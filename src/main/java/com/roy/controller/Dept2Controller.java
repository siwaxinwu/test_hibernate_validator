package com.roy.controller;

import com.roy.beans.Dept;
import com.roy.beans.Dept2;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * description：
 * author：dingyawu
 * date：created in 22:45 2020/8/23
 * history:
 */
@RestController
@RequestMapping("/dept2")
@Validated
public class Dept2Controller {

    @RequestMapping("/add")
    public ResultVO add(@RequestBody @Valid Dept2 dept){
        return ResultVO.success();
    }
}
