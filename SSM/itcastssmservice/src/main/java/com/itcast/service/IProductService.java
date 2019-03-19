package com.itcast.service;

import com.itcast.pojo.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAllProduct() throws Exception;

    public int saveProduct(Product product)throws Exception;
}
