package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> carslist = List.of(new Car(1, "Bb", 22), new Car(2, "Bb", 22), new Car(3, "Bb", 22), new Car(4, "Bb", 22), new Car(5, "Bb", 22));

    List<Car> index();

    List<Car> getCarList(int count);

    static List<Car> index2() {
        return carslist;
    }

    static List<Car> getCarList2(int count) {
        return carslist.stream().limit(count).toList();
    }
}
