/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.models;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author louiseahokas
 */
public class ProductTest{

    private Product product;
    
    /**
     * Test of constructor, of class Product.
     */
    @Test
    public void testProduct()
    {
        System.out.println("Product constructor");
        product = new Product(3, "Test product", "TestUrl", new Date());
        assertTrue(Product.class.isInstance(product));
        assertEquals("Test product", product.getProductName());
        assertEquals("TestUrl", product.getProductImageUrl());
        assertEquals(3, product.getId());
        assertTrue(Date.class.isInstance(product.getLastUpdated()));
        
    }
    
    
}
