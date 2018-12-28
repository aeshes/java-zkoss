package aoizora.service;

import aoizora.domain.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private static List<Car> dataModel;

    static {
        dataModel = Arrays.asList(new Car(1, "a", "a", null, null, 10),
                new Car(2, "b", "b", null, null, 20),
                new Car(3, "c", "c", null, null, 30));
    }

    @Override
    public List<Car> findAll() {
        return dataModel;
    }

    @Override
    public List<Car> search(String keyword) {
        return dataModel.stream()
                .filter(car -> car.getModel().equals(keyword))
                .collect(Collectors.toList());
    }
}
