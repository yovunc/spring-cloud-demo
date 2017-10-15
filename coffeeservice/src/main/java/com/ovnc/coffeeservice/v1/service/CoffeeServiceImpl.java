package com.ovnc.coffeeservice.v1.service;

import com.ovnc.coffeeservice.v1.beans.Coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("coffeeService")
public class CoffeeServiceImpl implements CoffeeService{

    private static List<Coffee> coffeeList = new ArrayList<Coffee>();

    private static Long id = 0L;

    public CoffeeServiceImpl(){
        Coffee coffee = new Coffee("Coffee","Very Aromatic", true);
        coffee.setId(++id);
        coffeeList.add(coffee);
    }

    public List<Coffee> getAllCoffees() {
        return coffeeList;
    }

    public Coffee getCoffeeById(Long id) {
        return findCoffeeById(id);
    }

    public void addCoffee(Coffee coffee) {
        coffee.setId(++id);
        coffeeList.add(coffee);
    }

    public void deleteCoffeeById(Long id) {
        Coffee coffee = findCoffeeById(id);
        if(coffee != null){
            coffeeList.remove(coffee);
        }
    }

    public void deleteAll() {
        coffeeList.clear();
        id = 0L;
    }

    public void updateCoffee(Coffee coffee) {
        Coffee foundCoffee = findCoffeeById(coffee.getId());
        if(foundCoffee != null){
            coffeeList.remove(foundCoffee);
            coffeeList.add(coffee);
        }
    }

    private Coffee findCoffeeById(Long id){
        for (Coffee coffee: coffeeList){
            if(coffee.getId() == id) {
                return coffee;
            }
        }

        return null;
    }
}
