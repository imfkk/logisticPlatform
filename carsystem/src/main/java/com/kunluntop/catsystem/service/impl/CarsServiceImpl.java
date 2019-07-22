package com.kunluntop.catsystem.service.impl;

import com.kunluntop.catsystem.dao.CarsRepository;
import com.kunluntop.catsystem.entity.TbCarEntity;
import com.kunluntop.catsystem.service.CarsService;
import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsServiceImpl  implements CarsService {
    @Autowired
    private CarsRepository carsRepository;

    @Override
    public Result list() {
        List<TbCarEntity> carEntityList=carsRepository.findAll();
        return ResultUtil.success(carEntityList);
    }

    @Override
    public Result insert(TbCarEntity car) {
        return null;
    }

    @Override
    public Result remove(TbCarEntity car) {
        return null;
    }

    @Override
    public Result update(TbCarEntity car) {
        return null;
    }
}
