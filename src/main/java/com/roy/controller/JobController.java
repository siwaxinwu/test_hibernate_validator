package com.roy.controller;

import com.roy.beans.Job;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * description：自定义注解
 * author：dingyawu
 * date：created in 21:54 2020/8/25
 * history:
 */
@RestController
@Validated
@RequestMapping("/job")
public class JobController {
    @PostMapping("/add")
    public ResultVO add(@RequestBody @Valid Job job){
        return ResultVO.success();
    }
}
