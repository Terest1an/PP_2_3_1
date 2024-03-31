package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    private CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Niva", 2121));
        cars.add(new Car(2, "Vesta", 2180));
        cars.add(new Car(3, "Granta", 2190));
        cars.add(new Car(4, "Priora", 2170));
        cars.add(new Car(5, "Kalina", 2118));
        if (count < 0) {
            count = 0;
        } else if (count > 5) {
            count = 5;
        }
        model.addAttribute("count", carService.show(cars, count));
        return "cars";
    }
}
