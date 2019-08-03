package com.lin.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;

/**
 * @author: Mr.Lin
 * @create: 2019-08-03 19:43:09
 **/
@Documented
@Constraint(validatedBy = PhoneValidationValidator.class)
@Target( { METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneValidation  {
    String message() default "不是正确的手机号码";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };


}
