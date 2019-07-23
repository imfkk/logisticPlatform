package com.kunluntop.logisticsystem.service.impl;

import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import com.kunluntop.logisticsystem.dao.OrderRepository;
import com.kunluntop.logisticsystem.entity.TbOrderEntity;
import com.kunluntop.logisticsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private String url="http://CARSYSTEM:8010/cars/ListCars";
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Result list() {
        List<TbOrderEntity> carEntityList = orderRepository.findAll();
        return ResultUtil.success(carEntityList);
    }

    @Override
   // @TxTransaction(isStart = true)
   // @Transactional
    public Result insert(TbOrderEntity order) {
        TbOrderEntity orderEntity=new TbOrderEntity();
        orderEntity.setId(1234);
        orderEntity.setOrderCode("1234554646");
        orderEntity= orderRepository.save(orderEntity);

        int a=1/0;
        restTemplate.getForObject(url,Result.class);

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
