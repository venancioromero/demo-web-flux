package com.venoty.demowebflux.repositories;

import com.venoty.demowebflux.models.Order;
import reactor.core.publisher.Flux;

import java.util.List;

public interface BakeryRepository {
    Flux<Order> findAll();
    /*List<Order> findAll();*/
}
