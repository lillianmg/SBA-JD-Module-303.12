public class Sedan extends Car {
    int length;

    public Sedan(String color, int speed, double regularPrice, int length) {
        super(color, speed, regularPrice);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.9;
        }
    }

}