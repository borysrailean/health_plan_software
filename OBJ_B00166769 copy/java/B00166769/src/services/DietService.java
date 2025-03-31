package services;

import plan.WorkoutPlan;
import plan.DietPlan;
import plan.Meal;
import user.User;

public class DietService implements FitnessService {

    @Override
    public WorkoutPlan provideWorkoutPlan(User user) {
        return null;
    }

    @Override
    public DietPlan provideDietPlan(User user) {
        //Calculate the TDEE for total calories daily needed
        double dailyCalories = user.calculateTDEE();

        DietPlan dietPlan;

        //plan if "male"
        if (user.getSex().equalsIgnoreCase("male")) {
            if (user.getWeight() > 80) {
                dietPlan = new DietPlan("Male Weight Loss Plan", dailyCalories - 500);
                dietPlan.addMeal(new Meal("Breakfast", 500, 25, 50, 15));
                dietPlan.addMeal(new Meal("Lunch", 600, 35, 70, 20));
                dietPlan.addMeal(new Meal("Dinner", 700, 45, 80, 30));
            } else if (user.getWeight() < 70) {
                dietPlan = new DietPlan("Male Weight Gain Plan", dailyCalories + 500);
                dietPlan.addMeal(new Meal("Breakfast", 600, 40, 80, 25));
                dietPlan.addMeal(new Meal("Lunch", 700, 50, 90, 30));
                dietPlan.addMeal(new Meal("Dinner", 1000, 60, 100, 45));
            } else {
                dietPlan = new DietPlan("Male Maintenance Plan", dailyCalories);
                dietPlan.addMeal(new Meal("Breakfast", 550, 30, 70, 20));
                dietPlan.addMeal(new Meal("Lunch", 650, 40, 80, 25));
                dietPlan.addMeal(new Meal("Dinner", 750, 50, 90, 35));
            }
        } else {
            //else "female"

            if (user.getWeight() > 70) {
                dietPlan = new DietPlan("Female Weight Loss Plan", dailyCalories - 500);
                dietPlan.addMeal(new Meal("Breakfast", 400, 20, 45, 12));
                dietPlan.addMeal(new Meal("Lunch", 500, 30, 60, 18));
                dietPlan.addMeal(new Meal("Dinner", 600, 40, 65, 25));
            } else if (user.getWeight() < 50) {
                dietPlan = new DietPlan("Female Weight Gain Plan", dailyCalories + 500);
                dietPlan.addMeal(new Meal("Breakfast", 550, 35, 75, 20));
                dietPlan.addMeal(new Meal("Lunch", 650, 40, 85, 25));
                dietPlan.addMeal(new Meal("Dinner", 850, 50, 100, 30));
            } else {
                dietPlan = new DietPlan("Female Maintenance Plan", dailyCalories);
                dietPlan.addMeal(new Meal("Breakfast", 450, 25, 60, 18));
                dietPlan.addMeal(new Meal("Lunch", 550, 30, 70, 20));
                dietPlan.addMeal(new Meal("Dinner", 650, 35, 80, 25));
            }
        }

        return dietPlan;
    }
}
