package io.github.joao.arquiteturaSpring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		// Disable the banner that is displayed when the application starts
		builder.bannerMode(Banner.Mode.OFF);

		// Set the active profile to "production")
		// You can specify multiple profiles by separating them with commas, e.g., "production,homologation"
		builder.profiles("production", "homologation");
//		builder.lazyInitialization(true); // Enable lazy initialization of beans, which can improve startup time by only creating beans when they are needed.

		// Additional configuration can be done here if needed, passed as arguments to the builder
		// Example: builder.properties("spring.config.name=custom-config");
		builder.run(args);

		ConfigurableApplicationContext applicationContext = builder.context();
//		var productRepository = applicationContext.getBean("productRepository");


		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		System.out.println("Application name: " + environment.getProperty("spring.application.name"));

		ExemploValue value = applicationContext.getBean(ExemploValue.class);

		value.imprimirVariavel();

		AppProperties bean = applicationContext.getBean(AppProperties.class);
		System.out.println("Valor da variável: " + bean.getVariavel());
		System.out.println("Valor do valor1: " + bean.getValor1());

	}

}
