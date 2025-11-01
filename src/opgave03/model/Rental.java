package opgave03.model;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int rentalDays;
    private String date;
    private ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, int rentalDays, String date) {
        this.number = number;
        this.rentalDays = rentalDays;
        this.date = date;
    }
    public double getPrice(){
       double price = 0;
        for (Car car: cars) {
            price += car.getDayPrice() * rentalDays;
        }
        return price;
    }
    public void setDays(int days){
        this.rentalDays = days;
    }
    public int getDays(){
        return rentalDays;
    }
    public int getNumber(){
        return number;
    }
    public void addCar(Car car){
        if(!cars.contains(car)){
            cars.add(car);
        }
    }
}
