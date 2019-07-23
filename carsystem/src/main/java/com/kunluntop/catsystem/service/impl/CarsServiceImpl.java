package com.kunluntop.catsystem.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.kunluntop.catsystem.dao.CarsRepository;
import com.kunluntop.catsystem.entity.TbCarEntity;
import com.kunluntop.catsystem.service.CarsService;
import com.kunluntop.common.response.Result;
import com.kunluntop.common.response.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

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
    @TxTransaction
    @Transactional
    public Result insert(TbCarEntity car) {
       // int i=1/0;
        car.setId(new Random().nextInt(30));
        car.setPlateNum("123456");
        carsRepository.save(car);
        int i=1/0;
        return ResultUtil.success("");
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
