package com.roy.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.groups.Default;
import java.lang.annotation.*;

/**
 * description：list中的分组校验
 * author：dingyawu
 * date：created in 21:52 2020/8/26
 * history:
 *
 */
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {ValidListValidator.class})
public @interface ValidList {
    //自定义属性，要验证的分组
    Class<?>[] groupings() default {Default.class};

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
