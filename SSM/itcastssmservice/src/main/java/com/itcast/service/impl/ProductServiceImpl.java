package com.itcast.service.impl;

import com.itcast.dao.ProductMapper;
import com.itcast.pojo.Product;
import com.itcast.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public List<Product> findAllProduct() throws Exception {
        return productMapper.findAllProuduct();
    }

    @Override
    public int saveProduct(Product product) throws Exception {
        return productMapper.saveProduct(product);
    }
}
