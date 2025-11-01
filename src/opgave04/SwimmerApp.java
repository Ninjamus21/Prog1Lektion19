package opgave04;

import opgave04.model.Swimmer4;
import opgave04.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {
    public static void main(String[] args) {


        Swimmer4 s1 = new Swimmer4("Jan", 'A', 16, 10);
        Swimmer4 s2 = new Swimmer4("Bo", 'B', 10, 6);
        Swimmer4 s3 = new Swimmer4("Mikkel", 'C', 8, 4);

        ArrayList<Swimmer4> swimmers = new ArrayList<>();
        swimmers.add(s1);
        swimmers.add(s2);
        swimmers.add(s3);

        for (Swimmer4 s : swimmers) {
            System.out.println(s.getName() + " træningsplan niveau: " + s.getTrainingPlan().getLevel()
            );
        }
    }
}
