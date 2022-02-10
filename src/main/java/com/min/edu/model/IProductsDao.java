package com.min.edu.model;

import java.util.List;
import java.util.Map;

import com.min.edu.vo.ProductsVo;

public interface IProductsDao {
	
	public List<ProductsVo> selectFood(Object obj);


	
}
