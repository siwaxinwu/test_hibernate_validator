package com.roy.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import java.util.List;

/**
 * description：controller层对List<Dept1> 实体的级联验证（一对多）
 * author：dingyawu
 * date：created in 20:28 2020/8/24
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp2 {
    @Null
    private Integer id;

    @NotEmpty
    private String name;

    //注解也可以写在这儿
    private List<@Valid Dept1> list;



}