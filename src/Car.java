public class Car {
    String color;
    int speed;
    double regularPrice;

    public Car(String color, int speed, double regularPrice) {
        this.color = color;
        this.speed = speed;
        this.regularPrice = regularPrice;
    }

    double getSalePrice() {
        return  regularPrice;
    }

}


