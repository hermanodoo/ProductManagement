package com.cnu.projectmanagement.Controller;

import com.cnu.projectmanagement.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/add")
    public String save(@RequestParam("productName") String productName) {
        // localhost:3307/add?productName=
        return productService.addByName(productName);
    }

    @RequestMapping("/search")
    public String search(@RequestParam("productId") Long productId) {
        // localhost:3307/product/search?productId=
        return productService.findById(productId);
    }

    @RequestMapping("/update")
    public HashMap<Long, String> update(@RequestParam("productId") Long productId,
                                        @RequestParam("newProductName") String newProductName) {
        // localhost:3307/update?productId=_______&newProductName=_______
        return productService.updateWithIdAndName(productId, newProductName);
    }


    @RequestMapping("/delete")
    public String delete(@RequestParam("productId") Long productId) {
        // localhost:3307/delete?productId=_______
        return productService.deleteById(productId);
    }


}
