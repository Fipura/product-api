package com.pedro.productapi.service;

import com.pedro.productapi.model.Product;
import com.pedro.productapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Optional<Product> getProductById(Long id){
        return repository.findById(id);
    }

    public Product createProduct(Product product){
        return repository.save(product);
    }

    public Optional<Product> updateProduct(Long id, Product updated){
        return repository.findById(id).map(existing -> {
            existing.setName(updated.getName());
            existing.setDescription(updated.getDescription());
            existing.setPrice(updated.getPrice());
            return repository.save(existing);
        });
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }
}
