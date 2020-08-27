package com.roy.controller;

import com.roy.enums.Error;
import com.roy.exceptions.ListValidException;
import com.roy.vo.ResultVO;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * description：
 * author：dingyawu
 * date：created in 19:40 2020/8/24
 * history:
 */

@ControllerAdvice(basePackages = "com.roy.controller")
@ResponseBody
public class CtrlAdvice {

    /**
     * controller层抛出的异常捕获校验
     * @param e
     * @return
     */
    @ExceptionHandler
    public ResultVO exceptionHandler(MethodArgumentNotValidException e){
        Map<String, String> collect = e.getBindingResult().getFieldErrors().stream().collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        return ResultVO.fail(Error.PARAM_ERROR, collect);
    }

    @ExceptionHandler
    public ResultVO exceptionHandler(ConstraintViolationException e){
        Map<Path, String> collect = e.getConstraintViolations().stream().collect(Collectors.toMap(ConstraintViolation::getPropertyPath, ConstraintViolation::getMessage));
        return ResultVO.fail(Error.PARAM_ERROR, collect);
    }


    @ExceptionHandler
    public ResultVO exceptionHandler(ListValidException e){
        Map<Integer, Map<Path, String>> map = new HashMap<>();
        e.getErrors().forEach((integer, constraintViolations) ->{
            map.put(integer, constraintViolations.stream().collect(Collectors.toMap(ConstraintViolation::getPropertyPath, ConstraintViolation::getMessage)));
        });
        return ResultVO.fail(Error.PARAM_ERROR, map);
    }

    @ExceptionHandler
    public ResultVO exceptionHandler(Exception e){

        return ResultVO.fail(Error.SYSO_ERROR, null);
    }
}
