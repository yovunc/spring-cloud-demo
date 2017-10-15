package com.ovnc.coffeeservice.v1.service;

import com.ovnc.coffeeservice.v1.beans.Coffee;

import java.util.List;

public interface CoffeeService {

    public List<Coffee> getAllCoffees();

    public Coffee getCoffeeById(Long id);

    public void addCoffee(Coffee coffee);

    public void deleteCoffeeById(Long id);

    public void deleteAll();

    public void updateCoffee(Coffee coffee);
}
