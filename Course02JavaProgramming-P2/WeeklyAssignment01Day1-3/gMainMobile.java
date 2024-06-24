class Battery {
    private String type;
    private int capacity;
  
    public Battery(String type, int capacity) {
      this.type = type;
      this.capacity = capacity;
    }
  
    @Override
    public String toString() {
      return "Battery: Type: " + type + ", Capacity: " + capacity + "mAh";
    }
  }
  
  class Screen {
    private double size;
    private String resolution;
  
    public Screen(double size, String resolution) {
      this.size = size;
      this.resolution = resolution;
    }
  
    @Override
    public String toString() {
      return "Screen: Size: " + size + " inches, Resolution: " + resolution;
    }
  }
  
  class Phone {
    private String brand;
    private String model;
    private Battery battery;
    private Screen screen;
  
    public Phone(String brand, String model, Battery battery, Screen screen) {
      this.brand = brand;
      this.model = model;
      this.battery = battery;
      this.screen = screen;
    }
  
    public void displayPhoneInfo() {
      System.out.println("Phone: Brand: " + brand + ", Model: " + model);
    }
  
    public void displayBatteryInfo() {
      System.out.println(battery);
    }
  
    public void displayScreenInfo() {
      System.out.println(screen);
    }
  }
  
  public class gMainMobile {
    public static void main(String[] args) {
      Phone phone = new Phone(
          "Samsung",
          "F 12",
          new Battery("Lithium-ion", 6000),
          new Screen(6.8, "3088x1440")
      );
  
      // Display phone information
      phone.displayPhoneInfo();
      phone.displayBatteryInfo();
      phone.displayScreenInfo();
    }
  }
  