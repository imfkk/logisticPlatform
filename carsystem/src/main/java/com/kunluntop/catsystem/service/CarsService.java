package com.kunluntop.catsystem.service;

import com.kunluntop.catsystem.entity.TbCarEntity;
import com.kunluntop.common.response.Result;

public interface CarsService {

    Result list();

    Result insert(TbCarEntity car);

    Result remove(TbCarEntity car);

    Result update(TbCarEntity car);
}
