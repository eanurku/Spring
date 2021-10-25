package com.anurag.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {
    @Override
    public void initialize(Phone phone) {

    }
    @Override
    public boolean isValid(String phoneValue, ConstraintValidatorContext constraintValidatorContext) {
        if (phoneValue == null) {
            return false;
        }
        return phoneValue.matches("[0-9]*");
    }
}
