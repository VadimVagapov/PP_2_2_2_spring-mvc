package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("One", "Tesla", 320));
        cars.add(new Car("Two", "Tesla", 356));
        cars.add(new Car("Three", "Tesla", 250));
        cars.add(new Car("Four", "Tesla", 400));
        cars.add(new Car("Five", "Tesla", 533));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            return cars;
        }
        return new ArrayList<>(cars.stream().limit(count).toList());
    }
}
