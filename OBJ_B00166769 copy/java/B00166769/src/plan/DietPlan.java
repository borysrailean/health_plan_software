package plan;

import java.util.ArrayList;
import java.util.List;

public class DietPlan {
    private String planName;
    private double dailyCalories;
    private List<Meal> meals;

    //constructor to get the DietPlan name and daily calories
    public DietPlan(String planName, double dailyCalories) {
        this.planName = planName;
        this.dailyCalories = dailyCalories;
        this.meals = new ArrayList<>();
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setDailyCalories(double dailyCalories) {
        this.dailyCalories = dailyCalories;
    }

    public double getDailyCalories() {
        return dailyCalories;
    }

    //adds a meal to the diet plan and adds it to the list
    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }
}
