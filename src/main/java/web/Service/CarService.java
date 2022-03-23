package web.Service;

import web.model.Cars;

import java.util.List;

public interface CarService {
    List<Cars> carsList(int count);
}
