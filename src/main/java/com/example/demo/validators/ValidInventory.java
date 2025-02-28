package com.example.demo.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {InventoryValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidInventory {
    String message() default "Inventory outside of range";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
