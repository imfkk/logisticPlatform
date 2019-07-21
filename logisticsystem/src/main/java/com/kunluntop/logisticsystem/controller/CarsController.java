package com.kunluntop.logisticsystem.controller;

import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/cars")
public class CarsController {
    @Autowired
    private RestTemplate restTemplate;

    private String url="http://CARSYSTEM:8010/cars/ListCars";
    @RequestMapping(value = "/ListCars" ,method = RequestMethod.GET)
    public Result ListCars() {
        return  restTemplate.getForObject(url,Result.class);
    }
}
