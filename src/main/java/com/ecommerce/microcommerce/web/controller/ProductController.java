package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.microcommerce.web.dao.ProductDao;

import java.util.List;


@RestController
public class ProductController {

    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping("/Produits")
    public List<Product> listeProduits() {
        return productDao.findAll();
    }

    //Récupérer un produit par son Id
    @GetMapping(value = "/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
            return productDao.findById(id);
    }

}