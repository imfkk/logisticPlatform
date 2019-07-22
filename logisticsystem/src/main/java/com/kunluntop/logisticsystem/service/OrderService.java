package com.kunluntop.logisticsystem.service;

import com.kunluntop.common.response.Result;
import com.kunluntop.logisticsystem.entity.TbOrderEntity;

public interface OrderService {

    Result list();

    Result insert(TbOrderEntity order);

    Result remove(TbOrderEntity order);

    Result update(TbOrderEntity order);
}
