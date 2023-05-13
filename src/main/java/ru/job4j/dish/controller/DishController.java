package ru.job4j.dish.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.dish.model.Dish;
import ru.job4j.dish.service.DishService;

import java.util.List;

@RestController
@RequestMapping("/dish")
@RequiredArgsConstructor
public class DishController {

    private final DishService dishService;

    @GetMapping("/all")
    public ResponseEntity<List<Dish>> getAll() {
        List<Dish> all = (List<Dish>) dishService.findAll();
        return new ResponseEntity<List<Dish>>(
                all.isEmpty() ? List.of(new Dish()) : all,
                all.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND
        );
    }

    @PostMapping("/create")
    public void create(@RequestBody Dish dish) {
        dishService.addDish(dish);
    }
}
