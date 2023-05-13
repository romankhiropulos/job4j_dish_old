package ru.job4j.dish.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.dish.model.Dish;
import ru.job4j.dish.repository.DishRepository;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DishService implements IDishService {

    private final DishRepository dishRepository;

    public Collection<Dish> findAll() {
        return dishRepository.findAll();
    }

    @Override
    public void addDish(Dish dish) {
        dishRepository.save(dish);
    }

    @Override
    public void removeAll() {
        dishRepository.deleteAll();
    }

    @Override
    public void removeById(Long id) {
        dishRepository.deleteById(id);
    }

    @Override
    public void update(Dish dish) {
        dishRepository.save(dish);
    }

    @Override
    public void updateCostById(Long id, Float newCost) {
        Optional<Dish> dish = dishRepository.findById(id);
        dish.ifPresent(val -> {
            val.setCost(newCost);
            dishRepository.save(val);
        });
    }

    @Override
    public Optional<Dish> findById(Long id) {
        return dishRepository.findById(id);
    }
}
