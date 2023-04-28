package com.tasks.spring1;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class Store {
    private final Map<Integer, ItemProduct> items;
    private int id = 1;

    public Store() {
        this.items = new HashMap<>();
        items.put(id, new ItemProduct(id++, "Тахеометр"));
        items.put(id, new ItemProduct(id++, "Нивелир"));
        items.put(id, new ItemProduct(id++, "Теодолит"));
        items.put(id, new ItemProduct(id++, "Штатив"));
        items.put(id, new ItemProduct(id++, "Треггер"));
    }

    public Collection<ItemProduct> getList() {
        return items.values();
    }


    public void add(ItemProduct itemProduct) {
        items.put(itemProduct.getId(), itemProduct);
    }

    public void update(ItemProduct itemProduct) {
        if (items.containsKey(itemProduct.getId())) {
            items.replace(itemProduct.getId(), itemProduct);
        }
    }

    public ItemProduct remove(int id) {
        return items.remove(id);
    }
}
