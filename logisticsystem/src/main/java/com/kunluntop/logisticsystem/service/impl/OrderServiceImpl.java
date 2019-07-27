package com.kunluntop.logisticsystem.service.impl;

import api.CarClientService;
import com.codingapi.tx.annotation.TxTransaction;
import com.kunluntop.common.response.ResultUtil;
import com.kunluntop.logisticsystem.dao.OrderRepository;
import com.kunluntop.logisticsystem.entity.TbOrderEntity;
import com.kunluntop.logisticsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.kunluntop.common.response.Result;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {
    private String url="http://CARSYSTEM:8010/cars/add";
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CarClientService carClientService;


    @Override
    public Result list() {
      return   carClientService.getCarList();

    }

    @Override
    @TxTransaction
    @Transactional
    public Result insert(TbOrderEntity order) {
        TbOrderEntity orderEntity=new TbOrderEntity();
        orderEntity.setId(new Random().nextInt(100));
        orderEntity.setOrderCode("1234554646");
        orderEntity= orderRepository.save(orderEntity);

      // int a=1/0;
        restTemplate.getForObject(url,Result.class);
       // int i=1/0;
        return ResultUtil.error(-1,"32132");
    }

    @Override
    public Result remove(TbOrderEntity order) {
        return null;
    }

    @Override
    public Result update(TbOrderEntity order) {
        return null;
    }
}
