package com.tasks.spring1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Integer> productListId;

    public Basket(List<Integer> productList) {
        this.productListId = productList;
    }

    public void addId(List<Integer> productList) {
        this.productListId.addAll(productList);

    }

    public List<Integer> getProductList() {
        return productListId;
    }


    @Override
    public String toString() {
        return "Basket{" +
                "productListId=" + productListId +
                '}';
    }
}
