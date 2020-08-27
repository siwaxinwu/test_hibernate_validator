package com.roy.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import java.util.List;

/**
 * description：
 * author：dingyawu
 * date：created in 20:28 2020/8/24
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp3 {
    @Null
    private Integer id;

    @NotEmpty
    private String name;
}