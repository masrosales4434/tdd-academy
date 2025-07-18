package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;
    @BeforeEach
    void setup(){
        product = new Product("Coke", 10.00);

    }
    @Test
    void testGetIdWithNoID() {
        assertNull(product.getId());
    }

    @Test
    void testGetIdWithValidID() {

        product.setId(1000L);

        assertEquals(1000L,product.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Coke", product.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(10.00,product.getPrice());
    }

    @Test
    void testValidSetID() {

        product.setId(2000L);

        assertEquals(2000L, product.getId());
    }

    @Test
    void testSetName() {

        product.setName("Sprite");

        assertEquals("Sprite", product.getName());
    }

    @Test
    void testSetPrice() {
        product.setPrice(30.00);

        assertEquals(30.00,product.getPrice());
    }

    @Test
    void testToString() {
        String expected = "Product{" +
                "id=" + product.getId() +
                ", name='" + product.getName() + "\'" +
                ", price=" + product.getPrice() +
                "}";
        assertEquals(expected, product.toString());
    }


    @Test
    void testEquals() {

        Product testEqualProduct = new Product(null,"Coke", 10.00);

        assertTrue(product.equals(testEqualProduct));
    }

    @Test
    void testHashCode() {

        System.out.println(product.hashCode());

        assertEquals(1141419577, product.hashCode());
    }
}