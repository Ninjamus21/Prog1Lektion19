package opgave01;


import opgave01.model.Swimmer;
import opgave01.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {

    public static void main(String[] args) {

        TrainingPlan tp1 = new TrainingPlan('A', 16, 10);
        TrainingPlan tp2 = new TrainingPlan('B', 10, 6);

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer s1 = new Swimmer("Jan", 1994, lapTimes, "AGF");
        s1.setTrainingPlan(tp1);

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer s2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");
        s2.setTrainingPlan(tp2);

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer s3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");


        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(s1);
        swimmers.add(s2);
        swimmers.add(s3);



        for (Swimmer s : swimmers) {
            if (s.getTrainingPlan() != null) {
                System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime() + " sekunder");
                System.out.println(s.getName() + "'s antal træningstimer: " + (s.allTrainingHours()));
            } else {
                System.out.println(s.getName() + " har ingen træningsplan.");
            }
        }

    }
}