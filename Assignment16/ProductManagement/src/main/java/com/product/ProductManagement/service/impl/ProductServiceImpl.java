package com.product.ProductManagement.service.impl;

import com.product.ProductManagement.entity.Product;
import com.product.ProductManagement.repository.ProductRepository;
import com.product.ProductManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product update(Long id, Product product) {
        Product newProduct = getById(id);
        newProduct.setName(product.getName());
        newProduct.setCategory(product.getCategory());
        newProduct.setPrice(product.getPrice());
        productRepository.save(newProduct);
        return newProduct;
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
