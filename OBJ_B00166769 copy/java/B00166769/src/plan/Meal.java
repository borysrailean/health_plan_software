package plan;

public class Meal {
    private String mealName;
    private int calories;
    private int protein;
    private int carbs;
    private int fats;

    //constructor
    public Meal(String mealName, int calories, int protein, int carbs, int fats) {
        this.mealName = mealName;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return mealName;
    }

    //this is to get the nutrition for the meal
    public String getNutritionalValue() {
        return calories + " kcal, " + protein + "g protein, " + carbs + "g carbs, " + fats + "g fats.";
    }
}
