public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan bentley = new Sedan("silver", 80, 200000, 18 );

        Ford mustang = new Ford("red", 90, 50000, 2022, 2000);
        Ford taurus = new Ford("gold", 75, 55000, 2021, 1990);

        Car pinto = new Car("brown", 65, 80000);

        System.out.println("Bentley Sedan Sale Price: " + bentley.getSalePrice());
        System.out.println("Mustang Sale Price: " + mustang.getSalePrice());
        System.out.println("Taurus Sale Price: " + taurus.getSalePrice());
        System.out.println("Pinto Sale Price: " + pinto.getSalePrice());
    }
}