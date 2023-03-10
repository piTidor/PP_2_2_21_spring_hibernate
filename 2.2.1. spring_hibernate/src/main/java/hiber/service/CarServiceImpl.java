package hiber.service;

import hiber.dao.CarDao;
import hiber.dao.UserDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;
    @Transactional
    @Override
    public void add(Car car) {
        carDao.add(car);

    }
}
