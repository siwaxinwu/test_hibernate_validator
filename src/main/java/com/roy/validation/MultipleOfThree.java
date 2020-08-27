package com.roy.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Null;
import java.lang.annotation.*;

/**
 * description：自定义注解
 * author：dingyawu
 * date：created in 22:08 2020/8/25
 * history:
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {MultipleOfThreeForList.class, MultipleOfThreeForInteger.class})
public @interface MultipleOfThree {
    String message() default "必须是3的倍数";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
