public class AutomaticCar extends Car {
    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    String drive() {
        return brand + " Automatic";
    }
}
