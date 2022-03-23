package web.Service;


import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    public static List<Cars> carsList = new ArrayList<>();

    {
        carsList.add(new Cars("BMW", "V6", 111));
        carsList.add(new Cars("Merseder-Benz", "V6", 222));
        carsList.add(new Cars("Niva", "V6", 333));
        carsList.add(new Cars("Volvo", "V6", 444));
        carsList.add(new Cars("Jeep", "V8", 555));
    }

    @Override
    public List<Cars> carsList(int count) {
        if (count == 0 || count > 5) {
             return carsList;
        }
            return carsList.stream().limit(count).collect(Collectors.toList());
        
    }
}
