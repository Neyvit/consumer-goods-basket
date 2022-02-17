package pro.sky.java.course2.consumergoodsbasket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.consumergoodsbasket.data.Basket;

import java.util.List;

@RequestMapping("/store/order")
@RestController
public class BasketController {


    @GetMapping("/add")
    public List<Integer> addIds(
            @RequestParam List<Integer> id) {
        return id;
    }

    @GetMapping("/get")
    public List<Integer> getIds() {
        return getItems();
    }





/*    @GetMapping("/add")
    public List<Integer> addIds(
            @RequestParam List<Integer> id) {
        return basket.addIds(id);
    }*/

/*    @GetMapping("/get")
    public Basket getIds() {
        return items;
    }*/



/*    @GetMapping("/add")
    public List addSeveralIds(
            @RequestParam List<Integer> ids) {
        return basketServiceImpl.addSeveralIds(ids);
    }*/


    /*    @GetMapping("/add")
        public List addId(
                @RequestParam int id) {
            return items.addId(id);
        }*/
}