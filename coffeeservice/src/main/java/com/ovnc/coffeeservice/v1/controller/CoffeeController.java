package com.ovnc.coffeeservice.v1.controller;

import com.ovnc.coffeeservice.v1.beans.Coffee;
import com.ovnc.coffeeservice.v1.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/coffees/v1")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public @ResponseBody List<Coffee> getCoffeeList(){
        return coffeeService.getAllCoffees();
    }

    @RequestMapping(value = "/addCoffee", method = RequestMethod.POST)
    public @ResponseBody void addCoffee(@RequestBody Coffee coffee){
        coffeeService.addCoffee(coffee);
    }

    @RequestMapping(value = "/uodateCoffee", method = RequestMethod.PUT)
    public @ResponseBody void updateCoffee(@RequestBody Coffee coffee){
        coffeeService.updateCoffee(coffee);
    }

    @RequestMapping(value = "/removeCoffee/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void removeCoffee(@PathVariable("id") Long id){
        coffeeService.deleteCoffeeById(id);
    }

    @RequestMapping(value = "removeAllCoffees", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllCoffees(){
        coffeeService.deleteAll();
    }

}
