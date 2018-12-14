import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {
    public Car getNextCar(String brand){

        List<Car> list = Arrays.asList(new AutomaticCar(brand),new ManualCar(brand));
        Collections.shuffle(list);
        return list.get(0);
    }

}
