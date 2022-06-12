package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.test.service.productsService;
import com.test.domain.products;
import com.test.exceptions.ProductNotFoundException;
import com.test.repository.productsDao;
@Component
@Transactional
public class productsServiceImpl implements productsService{
	@Autowired
	 private productsDao ProductsDao;
		@Override
		public List<products> getAllproductsService() {
			return ProductsDao.getAllproducts();
		}

		@Override
		public void addproductsService(products a) {
			ProductsDao.addNewproducts(a);
		}

		@Override
		public products searchproductsByIdService(int id) {
			products a=ProductsDao.searchproductsById(id);
			if(a==null) {
				String msg="The Customer"+id+"not found";
				throw new ProductNotFoundException(msg);
			}
			return a;
		}

		@Override
		public void updateproductsService(products a, int id) {
			ProductsDao.updateproducts(a, id);
		}
}
