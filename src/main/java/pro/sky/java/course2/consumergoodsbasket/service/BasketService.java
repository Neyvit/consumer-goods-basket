package pro.sky.java.course2.consumergoodsbasket.service;

import java.util.List;

public interface BasketService{

        List<Integer> add(List<Integer> items);

        List <Integer> get();
}