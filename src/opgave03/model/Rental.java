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
        return 0;
    }
    public void setDays(int days){
        this.rentalDays = days;
    }
    public int getDays(){
        return rentalDays;
    }
}
