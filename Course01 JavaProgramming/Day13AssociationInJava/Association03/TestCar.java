package Association03;

public class TestCar {
    public static void main(String[] args) {
        Engine engine = new Engine("abcd Disel Engine");
        Car car = new Car("Maruti Suzuki",engine);
        car.start();
        System. out.println(car);
    }
}
