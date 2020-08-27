package com.roy.controller;

import com.roy.beans.Emp1;
import com.roy.beans.Emp2;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * description：controller层对List<Dept1> 实体的级联验证（一对多）
 * author：dingyawu
 * date：created in 20:43 2020/8/24
 * history:
 */
@RestController
@RequestMapping("/emp2")
@Validated
public class Emp2Controller {

    @RequestMapping("/add")
    public ResultVO add(@RequestBody @Valid Emp2 emp){
        return ResultVO.success();
    }

}