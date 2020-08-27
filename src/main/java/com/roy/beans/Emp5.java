package com.roy.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * description：
 * author：dingyawu
 * date：created in 20:28 2020/8/24
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp5 {

    //验证组
    public interface Add{

    }
    public interface Update{

    }

    /**
     * 如果指定了验证组，那么该参数就只属于验证的指定组
     * 如果没有指定验证组，则该参数属于默认组
     *
     */
    @Null(groups = {Add.class})
    @NotNull(groups = {Update.class})
    private Integer id;
    @NotEmpty
    private String name;
    @Valid
    private Dept2 dept2;



}