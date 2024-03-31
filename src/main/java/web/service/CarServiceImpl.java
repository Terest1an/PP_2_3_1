package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {


    @Override
    public List<Car> show(List<Car> list, int nums) {
        return list.stream().limit(nums).toList();
    }
}
