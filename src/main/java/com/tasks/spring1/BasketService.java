package com.tasks.spring1;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BasketService {
    private final Basket basket;
    private final Store store;

    public BasketService(Basket basket, Store store) {
        this.basket = basket;
        this.store = store;
    }

    public void addProduct(List<Integer> id) {
        basket.addId(id);
    }

    public List<ItemProduct> get() {
        return store.getList().stream()
                .filter(itemProduct -> basket.getProductList().contains(itemProduct.getId()))
                .collect(Collectors.toList());
    }
}

