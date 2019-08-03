package com.lin.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Mr.Lin
 * @create: 2019-08-03 19:44:20
 **/
public class PhoneValidationValidator   implements ConstraintValidator<PhoneValidation, String> {
    private static final Pattern PHONE_PATTERN = Pattern.compile(
            "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$"
    );
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if ( value == null || value.length() == 0 ) {
            return false;
        }
        Matcher m = PHONE_PATTERN.matcher(value);
        return m.matches();
    }
}
