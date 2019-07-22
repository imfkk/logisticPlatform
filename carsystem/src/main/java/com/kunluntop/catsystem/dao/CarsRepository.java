package com.kunluntop.catsystem.dao;

import com.kunluntop.catsystem.entity.TbCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<TbCarEntity,Integer> {


}
