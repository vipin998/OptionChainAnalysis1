package com.option.chain.analysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.option.chain.analysis.model.StockMaster;

@Repository
public interface StockMasterRepostory extends JpaRepository<StockMaster, Integer>{

	
}
