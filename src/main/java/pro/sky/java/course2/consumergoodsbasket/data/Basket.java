package pro.sky.java.course2.consumergoodsbasket.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("session")
public class Basket {

    public List<Integer> getItems() {
        return items;
    }

    private final List<Integer> items = new ArrayList<>();

    public List<Integer> addIds(List<Integer> id) {
        items.addAll(id);
        return id;
    }

    public List<Integer> getIds(){
        return getItems();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "items=" + items +
                '}';
    }
}