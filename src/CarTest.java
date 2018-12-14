import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void driveAutomaticCarTest() {
        AutomaticCar car = new AutomaticCar("Peugeot");
        //  String brand = "Peugeot";
        String expected = "Peugeot Automatic";
        Assertions.assertEquals(expected,car.drive());
    }
    @Test
    void driveManualCarTest() {
        ManualCar car = new ManualCar("Peugeot");
        String expected = "Peugeot Manual";
        Assertions.assertEquals(expected,car.drive());
    }

}