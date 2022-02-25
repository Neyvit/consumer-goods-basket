package pro.sky.java.course2.consumergoodsbasket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.consumergoodsbasket.service.BasketService;

import java.util.List;

@RequestMapping("/order")
@RestController
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> addIds(
            @RequestParam List<Integer> id) {
        return basketService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> getIds() {
        return basketService.get();
    }
}