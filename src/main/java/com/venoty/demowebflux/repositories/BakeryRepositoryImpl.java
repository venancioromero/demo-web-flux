package com.venoty.demowebflux.repositories;

import com.venoty.demowebflux.models.Order;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BakeryRepositoryImpl implements BakeryRepository {

    private static List<Order> orders = new ArrayList<>();

    static {
        orders.add(new Order("/images/bread.jpg","Bread 1", 0.3f));
        orders.add(new Order("/images/bread2.jpg","Bread 2", 0.54f));
        orders.add(new Order("/images/cake.jpeg","Bun", 30.3f));
        orders.add(new Order("/images/cake2.jpg","Cake 2", 50.3f));
        orders.add(new Order("/images/cake3.jpg","Chocolate cake", 45.3f));
        orders.add(new Order("/images/cake4.jpg","Rainbow cake ", 12.3f));
        orders.add(new Order("/images/cake5.jpeg","Cake 5", 32.3f));
        orders.add(new Order("/images/bread.jpg","Bread 1", 0.3f));
        orders.add(new Order("/images/bread2.jpg","Bread 2", 0.54f));
        orders.add(new Order("/images/cake.jpeg","Bun", 30.3f));
        orders.add(new Order("/images/cake2.jpg","Cake 2", 50.3f));
        orders.add(new Order("/images/cake3.jpg","Chocolate cake", 45.3f));
        orders.add(new Order("/images/cake4.jpg","Rainbow cake ", 12.3f));
        orders.add(new Order("/images/cake5.jpeg","Cake 5", 32.3f));
        orders.add(new Order("/images/bread.jpg","Bread 1", 0.3f));
        orders.add(new Order("/images/bread2.jpg","Bread 2", 0.54f));
        orders.add(new Order("/images/cake.jpeg","Bun", 30.3f));
        orders.add(new Order("/images/cake2.jpg","Cake 2", 50.3f));
        orders.add(new Order("/images/cake3.jpg","Chocolate cake", 45.3f));
        orders.add(new Order("/images/cake4.jpg","Rainbow cake ", 12.3f));
        orders.add(new Order("/images/cake5.jpeg","Cake 5", 32.3f));
        orders.add(new Order("/images/bread.jpg","Bread 1", 0.3f));
        orders.add(new Order("/images/bread2.jpg","Bread 2", 0.54f));
        orders.add(new Order("/images/cake.jpeg","Bun", 30.3f));
        orders.add(new Order("/images/cake2.jpg","Cake 2", 50.3f));
        orders.add(new Order("/images/cake3.jpg","Chocolate cake", 45.3f));
        orders.add(new Order("/images/cake4.jpg","Rainbow cake ", 12.3f));
        orders.add(new Order("/images/cake5.jpeg","Cake 5", 32.3f));
        orders.add(new Order("/images/bread.jpg","Bread 1", 0.3f));
        orders.add(new Order("/images/bread2.jpg","Bread 2", 0.54f));
        orders.add(new Order("/images/cake.jpeg","Bun", 30.3f));
        orders.add(new Order("/images/cake2.jpg","Cake 2", 50.3f));
        orders.add(new Order("/images/cake3.jpg","Chocolate cake", 45.3f));
        orders.add(new Order("/images/cake4.jpg","Rainbow cake ", 12.3f));
        orders.add(new Order("/images/cake5.jpeg","Cake 5", 32.3f));
    }

    // Classic version

    /*@Override
    public List<Order> findAll() {
        return orders;
    }*/

    // Reactive
    @Override
    public Flux<Order> findAll() {
        return Flux.fromIterable(orders).delayElements( Duration.ofSeconds(1) );
    }

}
