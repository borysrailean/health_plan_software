package user;

public class User {
    private String name;
    private double weight;
    private double height;
    private int age;
    private String sex;
    private String activityLevel;

    //constructor
    public User(String name, double weight, double height, int age, String sex, String activityLevel) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.sex = sex;
        this.activityLevel = activityLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    //calculate bmr (bmr is an equation to calculate humans daily calorie intake needed)
    public double calculateBMR() {
        if (sex.equalsIgnoreCase("male")) {
            //bmr for men
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else if (sex.equalsIgnoreCase("female")) {
            //bmr for women
            return 10 * weight + 6.25 * height - 5 * age - 161;
        }
        return 0;
    }

    //calculate TDEE (the tdee is part of the bmr formula and track the humans daily activity)
    public double calculateTDEE() {
        //calculate bmr from above formula
        double bmr = calculateBMR();
        //default set, lowest tdee
        double activityMultiplier = 1.2;

        //tdee levels based on users input
        switch (activityLevel.toLowerCase()) {
            case "light":
                activityMultiplier = 1.375;
                break;
            case "moderate":
                activityMultiplier = 1.55;
                break;
            case "active":
                activityMultiplier = 1.725;
                break;
            case "very active":
                activityMultiplier = 1.9;
                break;
        }

        //calculate tdee by multiplying bmr with users activity (rounded)
        return Math.round(bmr * activityMultiplier);
    }
}
