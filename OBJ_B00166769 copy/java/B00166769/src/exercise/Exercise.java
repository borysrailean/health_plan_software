package exercise;

public abstract class Exercise {
    private String name;
    private double caloriesBurnedPerHour;

    //constructor for exercise name and calories burned per hour
    public Exercise(String name, double caloriesBurnedPerHour) {
        this.name = name;
        this.caloriesBurnedPerHour = caloriesBurnedPerHour;
    }

    //abstract method to get the calories burned during the exercise
    public abstract double calculateCaloriesBurned(int duration);

    //getter and setters below

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;


    }

    public void setCaloriesBurnedPerHour(double caloriesBurnedPerHour) {
        this.caloriesBurnedPerHour = caloriesBurnedPerHour;
    }

    public double getCaloriesBurnedPerHour() {
        return caloriesBurnedPerHour;
    }
}
