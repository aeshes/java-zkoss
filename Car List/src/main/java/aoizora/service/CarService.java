package aoizora.service;

import aoizora.domain.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();
    List<Car> search(String keyword);
}
