package com.kunluntop.logisticsystem.dao;

import com.kunluntop.logisticsystem.entity.TbOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<TbOrderEntity,Integer> {


}
