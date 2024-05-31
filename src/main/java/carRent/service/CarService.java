package carRent.service;

import carRent.model.Booking;
import carRent.model.Car;
import carRent.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public void save(Car car) {
        carRepository.save(car);
    }

    public Car findByID(Long id) {
        Optional<Car> optionalCar = carRepository.findById(id);
        return optionalCar.orElse(null);
    }

    public List<Car> findALl() {
        return carRepository.findAll();
    }


}
