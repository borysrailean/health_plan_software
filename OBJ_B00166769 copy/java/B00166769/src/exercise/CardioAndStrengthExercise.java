package exercise;

//constructor shows exercise name and the number of calories burned per hour
public class CardioAndStrengthExercise extends Exercise {
    public CardioAndStrengthExercise(String name, double caloriesBurnedPerHour) {
        super(name, caloriesBurnedPerHour);
    }

    //this formula calories burned per hour into the 30 duration in main
    @Override
    public double calculateCaloriesBurned(int duration) {
        return getCaloriesBurnedPerHour() * duration / 60.0;
    }
}
