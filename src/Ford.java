public class Ford extends Car {
        int year;
        int manufacturerDiscount;

        public Ford(String color, int speed, double regularPrice, int year, int manufacturerDiscount) {
            super(color, speed, regularPrice);
            this.year = year;
            this.manufacturerDiscount = manufacturerDiscount;
        }

        @Override
        double getSalePrice(){
            double salePrice = super.getSalePrice();
            return salePrice - manufacturerDiscount;
        }

    }
