package com.lhmgiw.basiccrudapplication.validator;

import com.lhmgiw.basiccrudapplication.enums.StatusEnum;
import com.lhmgiw.basiccrudapplication.validator.impl.StatusValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StatusValidatorImpl.class)
public @interface StatusValidator {
    StatusEnum[] anyOf();

    String message() default "must be any of {anyOf}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
