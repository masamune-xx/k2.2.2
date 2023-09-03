package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, 1995));
        cars.add(new Car("Volvo", 300, 1993));
        cars.add(new Car("Mercedes-Benz", 500, 2006));
        cars.add(new Car("McLaren", 620, 2012));
        cars.add(new Car("Audi", 4, 2020));
        return cars;
    }

    @Override
    public List<Car> getResultCars(List<Car> cars, int count) {
        if (count >= 5 || count == 0) return cars;
        return cars.stream().limit(count).toList();
    }
}
