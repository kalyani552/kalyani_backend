package com.test.repository;

import java.util.List;

import com.test.domain.products;

public interface productsDao {
	List<products> getAllproducts();
	products searchproductsById(int id);
	void updateproducts(products a,int id);
	void addNewproducts(products a);
	products searchproductsByIdService(int id);
	void updateproductsService(products a, int id);
}
