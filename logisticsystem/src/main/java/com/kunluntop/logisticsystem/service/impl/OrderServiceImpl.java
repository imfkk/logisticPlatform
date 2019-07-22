package com.kunluntop.logisticsystem.service.impl;

import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import com.kunluntop.logisticsystem.dao.OrderRepository;
import com.kunluntop.logisticsystem.entity.TbOrderEntity;
import com.kunluntop.logisticsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Result list() {
        List<TbOrderEntity> carEntityList = orderRepository.findAll();
        return ResultUtil.success(carEntityList);
    }

    @Override
    public Result insert(TbOrderEntity order) {
        return null;
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
