package com.roy.controller;

import com.roy.beans.Dept;
import com.roy.beans.Dept3;
import com.roy.service.DeptService;
import com.roy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * description：service层做参数校验（无接口）
 * author：dingyawu
 * date：created in 22:45 2020/8/23
 * history:
 */
@RestController
@RequestMapping("/dept3")

public class Dept3Controller {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/add")
    public ResultVO add(@RequestBody Dept3 dept3){
        deptService.add(dept3);
        return ResultVO.success();
    }
}
