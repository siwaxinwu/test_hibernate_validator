package com.roy.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * description：自定义注解
 * author：dingyawu
 * date：created in 22:15 2020/8/25
 * history:
 */
public class MultipleOfThreeForList implements ConstraintValidator<MultipleOfThree, List> {

    @Override
    public void initialize(MultipleOfThree constraintAnnotation) {

    }

    @Override
    //list == null的情况交给null注解去判断
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        return list == null ? true : list.size()%3 == 0;
    }
}
