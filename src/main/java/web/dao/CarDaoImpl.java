package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", 3, 1995));
        cars.add(new Car("Volvo", 300, 1993));
        cars.add(new Car("Mercedes-Benz", 500, 2006));
        cars.add(new Car("McLaren", 620, 2012));
        cars.add(new Car("Audi", 4, 2020));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getResultCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
