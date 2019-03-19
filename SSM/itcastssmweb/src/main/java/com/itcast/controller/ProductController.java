package com.itcast.controller;

import com.itcast.pojo.Product;
import com.itcast.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @RequestMapping("/findAllProduct")
    public String findAllProduct(Model model) throws Exception {
        List<Product> productList = productService.findAllProduct();
        return "product-list";
    }
    @RequestMapping("/saveProduct")
    public String saveProduct(Product product){
        try {
            int n = productService.saveProduct(product);
            if (n>0){
                return "redirect:/product/findAlProduct";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return "product-add";
    }
}
