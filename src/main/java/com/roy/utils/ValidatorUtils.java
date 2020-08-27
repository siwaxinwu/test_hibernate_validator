package com.roy.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Validator;

/**
 * description：
 * author：dingyawu
 * date：created in 22:07 2020/8/26
 * history:
 */
@Component
public class ValidatorUtils {
    public static Validator validator;

    @Autowired
    public void setValidator(Validator validator) {
        ValidatorUtils.validator = validator;
    }
}
