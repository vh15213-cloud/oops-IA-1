class Device {
    String brand;
    double price;

    Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class SmartDevice extends Device {
    String connectivityType;

    SmartDevice(String brand, double price, String connectivityType) {
        super(brand, price);
        this.connectivityType = connectivityType;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Connectivity Type: " + connectivityType);
    }
}

public class ProblemA {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice(
                "Samsung",
                25000,
                "Wi-Fi"
        );

        device.display();
    }
}
