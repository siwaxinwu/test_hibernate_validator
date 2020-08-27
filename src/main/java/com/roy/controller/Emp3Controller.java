package com.roy.controller;

import com.roy.beans.Emp2;
import com.roy.beans.Emp3;
import com.roy.service.IEmpService;
import com.roy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * description：service层做参数校验（有接口）
 * author：dingyawu
 * date：created in 21:34 2020/8/24
 * history:
 */
@RestController
@RequestMapping("/emp3")
public class Emp3Controller {

    @Autowired
    private IEmpService empService;

    @RequestMapping("/add")
    public ResultVO add(@RequestBody Emp3 emp3){
        empService.add(emp3);
        return ResultVO.success();
    }

    @RequestMapping("/getById")
    public ResultVO getById(Integer id){
        empService.getEmpById(id);
        return ResultVO.success();
    }

}