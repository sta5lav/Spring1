package com.tasks.spring1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String addItemInBasket(@RequestParam List<Integer> id) {
        basketService.addProduct(id);
        return "Позиция(и) " + id + " успешно добавлен(ы) в корзину!";
    }

    @GetMapping(path = "/get")
    public List<ItemProduct> getItemInBasket() {
       return basketService.get();
    }
}
