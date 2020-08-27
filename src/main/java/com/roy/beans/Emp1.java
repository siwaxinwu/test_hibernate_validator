package com.roy.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * description：controller层对Dept1实体的级联验证（一对一）
 * author：dingyawu
 * date：created in 20:28 2020/8/24
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp1 {
    @Null
    private Integer id;
    @NotEmpty
    private String name;
    @Valid
    private Dept1 dept1;



}