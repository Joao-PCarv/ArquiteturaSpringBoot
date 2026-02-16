package io.github.joao.arquiteturaSpring.construtor.api;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This annotation will be available at runtime.
// Its retention policy is RUNTIME, which means it can be accessed through reflection during the execution of the program.
@Retention(RetentionPolicy.RUNTIME)

// This annotation can be applied to types (classes, interfaces), methods, and fields.
// The @Target annotation specifies the kinds of program elements to which an annotation type is applicable.
@Target({ElementType.METHOD, ElementType.FIELD})

// This qualifier specifies that the "motorGasolina" bean should be injected when this annotation is used.
@Qualifier("motorGasolina")
public @interface Gasolina {
}
