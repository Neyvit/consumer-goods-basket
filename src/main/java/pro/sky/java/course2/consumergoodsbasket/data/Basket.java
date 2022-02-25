package pro.sky.java.course2.consumergoodsbasket.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> items = new ArrayList<>();

    public List<Integer> getItems() {
        return items;
    }

    public List<Integer> addIds(List<Integer> id) {
        items.addAll(id);
        return id;
    }

    public List<Integer> getIds(){
        return getItems();
    }

    @Override
    public String toString() {
        return "items: " + items;
    }
}