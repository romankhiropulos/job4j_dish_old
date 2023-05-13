package ru.job4j.dish.service;

import ru.job4j.dish.model.Dish;

import java.util.Collection;
import java.util.Optional;

public interface IDishService {

    Collection<Dish> findAll();

    void addDish(Dish dish);

    void removeAll();

    void removeById(Long id);

    void update(Dish dish);

    void updateCostById(Long id, Float newCost);

    Optional<Dish> findById(Long id);
}
