public class ManualCar extends Car {
    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    String drive() {
        return brand + " Manual";
    }
}
