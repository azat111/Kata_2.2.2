package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public CarDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Car> index() {
        Session session = sessionFactory.getCurrentSession();
        List<Car> carslist = session.createQuery("FROM Car", Car.class).getResultList();
        return carslist;
    }

    @Override
    @Transactional
    public List<Car> getCarList(int count) {
        Session session = sessionFactory.getCurrentSession();
        return index().stream().limit(count).toList();
    }
}
