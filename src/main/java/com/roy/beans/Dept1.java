package com.roy.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

/**
 * description： controller层对Dept1实体的级联验证（一对一）
 * author：dingyawu
 * date：created in 22:50 2020/8/23
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept1 {
    @Null(message = "id不可以有值")
    private Integer id;

    @NotNull
    private Integer parentId;

    @NotEmpty
    private String name;

    @NotNull
    @PastOrPresent
    private LocalDateTime time;


}
