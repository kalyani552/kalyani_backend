package com.test.exceptions;

public class ProductNotFoundException extends RuntimeException {
	public ProductNotFoundException(String msg)
	{
		super(msg);
	}
}
