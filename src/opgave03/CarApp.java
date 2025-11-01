package opgave03;

import opgave03.model.Car;
import opgave03.model.Rental;

public class CarApp {
    public static void main(String[] args) {


        Car car1 = new Car("AB12345", 2018);
        Car car2 = new Car("CD67890", 2020);
        Car car3 = new Car("EF13579", 2015);
        Car car4 = new Car("GH24680", 2021);
        Car car5 = new Car("IJ11223", 2019);

        Rental rental1 = new Rental(1, 5, "2024-06-01");
        Rental rental2 = new Rental(2, 3, "2024-06-02");

        rental1.addCar(car1);
        rental1.addCar(car2);
        rental2.addCar(car3);
        rental2.addCar(car4);

        System.out.println("Rental: " + rental1.getNumber() + " " + rental1.getPrice());

        car1.setDayPrice(100);
        car2.setDayPrice(150);
        car3.setDayPrice(200);
        car4.setDayPrice(250);
        car5.setDayPrice(300);

        // after setting prices
        System.out.println("Rental: " + rental1.getNumber() + " total: " + rental1.getPrice() + " for " + rental1.getDays() + " days");
        System.out.println("Rental: " + rental2.getNumber() + " total: " + rental2.getPrice() + " for " + rental2.getDays() + " days");
    }
}
