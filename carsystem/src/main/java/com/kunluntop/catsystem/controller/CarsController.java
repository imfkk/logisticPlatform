package com.kunluntop.catsystem.controller;

import com.kunluntop.catsystem.entity.TbCarEntity;
import com.kunluntop.catsystem.service.CarsService;
import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class CarsController {
    @Autowired
    private CarsService carsService;

    @RequestMapping(value = "/ListCars" ,method = RequestMethod.GET)
    public Result ListCars() {
       return carsService.list();
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Result addCars() {
        return carsService.insert(new TbCarEntity());
    }
}
