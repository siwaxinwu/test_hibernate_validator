package com.roy.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * description：自定义注解
 * author：dingyawu
 * date：created in 22:15 2020/8/25
 * history:
 */
public class MultipleOfThreeForInteger implements ConstraintValidator<MultipleOfThree, Integer> {
    @Override
    public void initialize(MultipleOfThree constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return value== null ? true : value%3 == 0 ;
    }
}
