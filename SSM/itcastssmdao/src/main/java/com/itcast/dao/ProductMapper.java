package com.itcast.dao;

import com.itcast.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productMapper")
public interface ProductMapper {
    public List<Product> findAllProuduct()throws Exception;

    public int saveProduct(Product product) throws Exception;
}
