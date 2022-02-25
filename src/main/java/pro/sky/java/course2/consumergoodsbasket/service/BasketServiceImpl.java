package pro.sky.java.course2.consumergoodsbasket.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.consumergoodsbasket.data.Basket;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService{

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }


    @Override
    public List<Integer> add(List<Integer> items) {
        return basket.addIds(items);
    }

    @Override
    public List<Integer> get() {
        return basket.getIds();
    }
}