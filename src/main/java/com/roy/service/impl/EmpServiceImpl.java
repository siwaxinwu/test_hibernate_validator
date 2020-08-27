package com.roy.service.impl;

import com.roy.beans.Emp3;
import com.roy.service.IEmpService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * description：
 * author：dingyawu
 * date：created in 21:16 2020/8/24
 * history:
 */
@Service
@Validated
public class EmpServiceImpl implements IEmpService {
    @Override
    public void add(Emp3 emp3) {
        System.out.println("add success");
    }

    @Override
    public Emp3 getEmpById(@NotNull Integer id) {
        return null;
    }
}
