package com.kunluntop.catsystem.controller;

import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class CarsController {
    @RequestMapping(value = "/ListCars" ,method = RequestMethod.GET)
    public Result ListCars() {
        return ResultUtil.success("sadasd", "成功");
    }
}
