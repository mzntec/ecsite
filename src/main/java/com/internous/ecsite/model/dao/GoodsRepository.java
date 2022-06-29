package com.internous.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internous.ecsite.modle.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods,Long> {
	
}