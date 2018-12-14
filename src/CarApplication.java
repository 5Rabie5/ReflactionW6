import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel = new Hansel();
        Cars cars = new Cars();
        for (int times = 0; times < 10; times++) {
            List<String> brands = Arrays.asList("Audi", "Mercedes", "Seat", "Skoda", "Tesla", "Bmw", "Peugeot", "Citroen", "Jeep", "Ferrari");
            Collections.shuffle(brands);
            Car anthorCar = cars.getNextCar(brands.get(0));
            hansel.haveATry(anthorCar);
        }
    }
}
