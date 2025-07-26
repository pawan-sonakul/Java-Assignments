package com.product.ProductManagement.controller;

import com.product.ProductManagement.entity.Product;
import com.product.ProductManagement.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping
    public String check() {
        return "Working";
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getById(id);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.delete(id);
        return "Product was deleted successfully";
    }
}
