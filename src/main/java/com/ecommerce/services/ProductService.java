package com.ecommerce.services;

import com.ecommerce.models.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        this.products = new ArrayList<>();
        initializeProducts();
    }

    private void initializeProducts() {
        products.add(new Product("Laptop", "High-performance laptop for work", 999.99, 10, 4.5));
        products.add(new Product("Mouse", "Wireless mouse with USB receiver", 29.99, 50, 4.2));
        products.add(new Product("Keyboard", "Mechanical gaming keyboard", 149.99, 25, 4.7));
        products.add(new Product("Monitor", "4K Ultra HD monitor", 399.99, 15, 4.6));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProductStock(String productName, int quantity) {
        Product product = getProductByName(productName);
        if (product != null && product.getStock() >= quantity) {
            product.setStock(product.getStock() - quantity);
        }
    }

    public void displayAllProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice() + 
                             ", Stock: " + product.getStock() + ", Rating: " + product.getRating());
        }
    }
}