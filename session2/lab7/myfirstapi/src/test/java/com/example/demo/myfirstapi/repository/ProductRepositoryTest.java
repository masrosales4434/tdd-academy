package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository productRepository;

    @BeforeEach
    void setup(){
        productRepository = new ProductRepository();
    }

    @Test
    void testFindAll() {

        List<Product> checkerList = productRepository.findAll();

        assertFalse(checkerList.isEmpty());
        assertEquals(3,checkerList.size());
    }

    @Test
    void testFindById_CorrectResponse() {
        assertEquals("Laptop", productRepository.findById(1L).get().getName());
    }

    @Test
    void saveProductWithNullId() {
        Product newProduct = new Product("Beyblade", 65.00);

        Product savedProduct = productRepository.save(newProduct);

        assertEquals(4,savedProduct.getId());
    }

    @Test
    void saveAndUpdateProduct(){
        Product newProduct = new Product(1L,"Monitor", 500.00);

        productRepository.save(newProduct);

        assertEquals(newProduct,productRepository.findById(1L).get());

    }

    @Test
    void saveWithInvalidProductID(){
        Product newProduct = new Product(9L, "Speakers", 50.00);

        Product trialSaveProduct = productRepository.save(newProduct);

        assertEquals(newProduct,trialSaveProduct);
        assertThrows(NoSuchElementException.class, () -> productRepository.findById(9L).get());
    }
}