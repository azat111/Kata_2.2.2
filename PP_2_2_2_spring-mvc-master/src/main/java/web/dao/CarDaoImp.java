package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDAO {

    private final List<Car> carslist = List.of(new Car(1, "Bb", 22), new Car(2, "Bb", 22), new Car(3, "Bb", 22), new Car(4, "Bb", 22), new Car(5, "Bb", 22));

    @Override
    @Transactional
    public List<Car> index() {
        return carslist;
    }

    @Override
    @Transactional
    public List<Car> getCarList(int count) {
        return carslist.stream().limit(count).toList();
    }
}
