package com.roy.controller;

import com.roy.beans.Emp1;
import com.roy.beans.Emp4;
import com.roy.beans.Emp5;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.groups.Default;
import java.util.List;

/**
 * description：分组校验（但是级联对象没生效）
 * author：dingyawu
 * date：created in 20:31 2020/8/24
 * history:
 */
@RestController
@RequestMapping("/emp4")
@Validated
public class Emp4Controller {
    @RequestMapping("/add")
    public ResultVO add(@RequestBody @Validated({Emp4.Add.class, Default.class}) Emp4 emp){
        return ResultVO.success();
    }
    @PutMapping("/put")
    public ResultVO update(@RequestBody @Valid Emp4 emp4){
        return ResultVO.success();
    }


    @PostMapping("/addList")
    public ResultVO addList(@RequestBody @Validated({Emp5.Add.class, Default.class}) List<Emp5> emp){
        return ResultVO.success();
    }

}
