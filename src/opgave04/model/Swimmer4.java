package opgave04.model;

public class Swimmer4 {
    private String name;
    private TrainingPlan trainingPlan;

    public Swimmer4(String name, char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.name = name;
        this.trainingPlan = new TrainingPlan(level, weeklyWaterHours, weeklyStrengthHours);
    }

    public String getName() {
        return name;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }
    public void setTrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.trainingPlan = new TrainingPlan(level, weeklyWaterHours, weeklyStrengthHours);
    }
}
