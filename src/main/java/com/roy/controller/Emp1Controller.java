package com.roy.controller;

import com.roy.beans.Emp1;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * description：controller层对Dept1实体的级联验证（一对一）
 * author：dingyawu
 * date：created in 20:31 2020/8/24
 * history:
 */
@RestController
@RequestMapping("/emp")
@Validated
public class Emp1Controller {

    @RequestMapping("/add")
    public ResultVO add(@RequestBody @Valid Emp1 emp){
        return ResultVO.success();
    }

}
