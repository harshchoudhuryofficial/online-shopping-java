package com.ecommerce.services;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private List<Item> cartItems;

    public CartService() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        cartItems.add(new Item(product, quantity));
    }

    public void removeItem(Product product) {
        cartItems.removeIf(item -> item.getProduct().equals(product));
    }

    public List<Item> viewCart() {
        return cartItems;
    }

    public double getCartTotal() {
        return cartItems.stream().mapToDouble(Item::getTotalPrice).sum();
    }

    public void clearCart() {
        cartItems.clear();
    }

    public List<Item> getCartItems() {
        return new ArrayList<>(cartItems);
    }
}

class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
