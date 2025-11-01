// java
package opgave01.model;

import opgave01.model.TrainingPlan;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private int birthYear;
    private ArrayList<Double> lapTimes;
    private String club;
    private TrainingPlan trainingPlan;

    public Swimmer(String name, int birthYear, ArrayList<Double> lapTimes, String club) {
        this.name = name;
        this.birthYear = birthYear;
        this.lapTimes = lapTimes != null ? lapTimes : new ArrayList<>();
        this.club = club;
        this.trainingPlan = null;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    public String getClub() {
        return club;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public double bestLapTime() {
        if (lapTimes == null || lapTimes.isEmpty()) {
            return 0.0;
        }
        double best = Double.MAX_VALUE;
        for (Double t : lapTimes) {
            if (t != null && t < best) {
                best = t;
            }
        }
        return best == Double.MAX_VALUE ? 0.0 : best;
    }

    public int allTrainingHours() {
        if (trainingPlan == null) {
            return 0;
        }
        // assumes TrainingPlan has these getters
        return trainingPlan.getWeeklyWaterHours() + trainingPlan.getWeeklyStrengthHours();
    }
}