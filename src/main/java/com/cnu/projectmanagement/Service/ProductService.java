package com.cnu.projectmanagement.Service;

import com.cnu.projectmanagement.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public String addByName(String productName) {
        return productRepository.addByName(productName);
    }

    public String findById(Long productId) {
        return productRepository.findById(productId);
    }

    public HashMap<Long, String> updateWithIdAndName(Long productId, String newProductName) {
        return productRepository.updateWithIdAndName(productId, newProductName);
    }

    public String deleteById(Long productId) {
        return productRepository.deleteById(productId);
    }


}
