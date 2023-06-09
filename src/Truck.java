public class Truck extends Car{
    int weight;

    public Truck(String color, int speed, double regularPrice, int weight) {
        super(color, speed, regularPrice);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice * 0.8;
        }
    }
}