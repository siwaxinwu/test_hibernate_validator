package com.roy.beans;

import com.roy.validation.MultipleOfThree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * description：自定义注解demo
 * 注解一般不会管null的情况，null这种情况由@null去注释
 * 同一个注解可以对多种参数类型生效
 *  实现注解：功能：对于Integer而言，必须是3的倍数
 *                 对于list而言，list中的元素必须是3的倍数
 * author：dingyawu
 * date：created in 21:51 2020/8/25
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    @MultipleOfThree
    private Integer id;
    @Size(min = 1, max = 10) //该注解只有在name不为空的情况下才会去验证
    @NotNull
    private String name;

    /**
     * 会按照顺序来验证
     */
    @Size(min = 1,message = "{min}sd")//支持EL表达式
    @NotNull
    @MultipleOfThree
    private List<String> labels;
}
