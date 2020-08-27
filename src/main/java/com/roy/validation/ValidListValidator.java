package com.roy.validation;

import com.roy.exceptions.ListValidException;
import com.roy.utils.ValidatorUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * description：
 * author：dingyawu
 * date：created in 21:57 2020/8/26
 * history:
 */
public class ValidListValidator implements ConstraintValidator<ValidList, List> {
    Class<?>[] groupings;

    @Override
    public void initialize(ValidList validList) {
        Class<?>[] groupings = validList.groupings();
    }

    //list就是我们获取的对象
    @Override
    public boolean isValid(List list, ConstraintValidatorContext context) {
        Map<Integer, Set<ConstraintViolation<Object>>> errors = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            Set<ConstraintViolation<Object>> error = ValidatorUtils.validator.validate(obj, groupings);
            errors.put(i, error);
        }
        if (errors.size() > 0){
            throw new ListValidException(errors);
        }
        return true;
    }
}
