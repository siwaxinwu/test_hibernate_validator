package com.roy.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.ConstraintViolation;
import java.util.Map;
import java.util.Set;

/**
 * description：
 * author：dingyawu
 * date：created in 22:17 2020/8/26
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListValidException extends RuntimeException {
    private Map<Integer, Set<ConstraintViolation<Object>>> errors;

}
