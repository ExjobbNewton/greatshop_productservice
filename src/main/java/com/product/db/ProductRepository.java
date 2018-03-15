/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.db;

import com.product.models.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author louiseahokas
 */
public class ProductRepository {
    
    SessionFactory sessionFactory;
    
    public List<Product> getProducts()
    {
        Session session = sessionFactory.openSession();
        
        List<Product> productList = session.createCriteria(Product.class).list();
        
        session.close();
        return productList;
    }
    
    public Product getProductById(int id)
    {
        Session session = sessionFactory.openSession();
        
        Product product = (Product) session.get(Product.class, id);
        
        return product;
    }
    
}
