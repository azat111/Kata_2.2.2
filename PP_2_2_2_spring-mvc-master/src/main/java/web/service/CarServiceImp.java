package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDAO;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Transactional(readOnly = true)
    @Override
    public List<Car> index() {
        return carDAO.index();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getCarList(int count) {
        return carDAO.getCarList(count);
    }
}
