package com.roy.service;

import com.roy.beans.Emp3;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * description： service层做参数校验（接口实现类）
 * author：dingyawu
 * date：created in 21:14 2020/8/24
 * history:
 */

public interface IEmpService {
    public void add( @Valid Emp3 emp3);

    //也可以写在方法的参数上
    public Emp3 getEmpById(@NotNull Integer id);
}
