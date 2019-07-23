package com.kunluntop.logisticsystem.controller;

import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import com.kunluntop.logisticsystem.service.OrderService;
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
    @Autowired
    private OrderService orderService;
    private String url="http://CARSYSTEM:8010/cars/ListCars";
    @RequestMapping(value = "/ListCars" ,method = RequestMethod.GET)
    public Result ListCars() {
        return  orderService.list();

       // return  restTemplate.getForObject(url,Result.class);
    }

    @RequestMapping(value = "/insert" ,method = RequestMethod.GET)
    public Result insert() {
        return  orderService.insert(null);

        // return  restTemplate.getForObject(url,Result.class);
    }

}
