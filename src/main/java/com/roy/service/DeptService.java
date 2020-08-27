package com.roy.service;

import com.roy.beans.Dept3;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * description：service层做参数校验（无接口）
 * author：dingyawu
 * date：created in 21:18 2020/8/24
 * history:
 */
@Service
@Validated
public class DeptService {
    public void add(@Valid Dept3 dept3){
        System.out.println("dept add success");
    }
}
