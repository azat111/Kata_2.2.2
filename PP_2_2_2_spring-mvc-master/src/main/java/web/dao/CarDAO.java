package web.dao;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import web.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> index();
    List<Car> getCarList(int count);
}
