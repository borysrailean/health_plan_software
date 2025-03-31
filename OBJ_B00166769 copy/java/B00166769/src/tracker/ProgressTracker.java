package tracker;

import user.User;
import plan.WorkoutPlan;
import plan.DietPlan;
import plan.Meal;

public class ProgressTracker {

    //display progress
    public void displayProgress(User user, WorkoutPlan workoutPlan, DietPlan dietPlan) {
        System.out.println("Weight History: (" + user.getWeight() + ")");

        //display workout history
        System.out.println("Workout History: (Workout done: " + workoutPlan.getPlanName() + ")");

        //display diet history
        System.out.println("Diet History: ");
        for (Meal meal : dietPlan.getMeals()) {
            System.out.println(meal.getMealName() + ": " + meal.getNutritionalValue());
        }
    }
}
