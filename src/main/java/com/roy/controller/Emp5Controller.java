package com.roy.controller;

import com.roy.beans.Emp4;
import com.roy.beans.Emp5;
import com.roy.validation.ValidList;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.groups.Default;
import java.util.List;

/**
 * description：
 * author：dingyawu
 * date：created in 20:31 2020/8/24
 * history:
 */
@RestController
@RequestMapping("/emp5")
@Validated
public class Emp5Controller {

    @PostMapping("/addList")
    public ResultVO addList(@RequestBody  @ValidList(groupings = {Emp5.Add.class, Default.class}) List<Emp5> emp){
        return ResultVO.success();
    }

}
