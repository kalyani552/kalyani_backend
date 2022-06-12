package com.test.service;

import java.util.List;

import com.test.domain.products;

public interface productsService {
	List<products> getAllproductsService();
	void addproductsService(products a);
	products searchproductsByIdService(int id);
	void updateproductsService(products a,int id);
}
