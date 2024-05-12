package Association03;
public class Car {
    String name;
    Engine engine;
    public Car(String name, Engine engine){
        this.name = name;
        this.engine = engine;
    }
    @Override
    public String toString(){
        return "Car (name=" + name + ", engine=" + engine + "j";
    }
    public void start(){
        System.out.println ("car "+name+" started with "+engine);
    }
}
