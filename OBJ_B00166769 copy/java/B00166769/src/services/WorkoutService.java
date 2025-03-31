package services;

import plan.DietPlan;
import plan.WorkoutPlan;
import exercise.CardioAndStrengthExercise;
import user.User;

public class WorkoutService implements FitnessService {

    @Override
    public WorkoutPlan provideWorkoutPlan(User user) {
        WorkoutPlan plan;

        if (user.getSex().equalsIgnoreCase("male")) {
            //male plans
            if (user.getWeight() > 90) {
                plan = new WorkoutPlan("Male Weight Loss Plan", 60);
                plan.addExercise(new CardioAndStrengthExercise("Running", 800));
                plan.addExercise(new CardioAndStrengthExercise("Biking", 700));
            } else if (user.getWeight() < 70) {
                plan = new WorkoutPlan("Male Weight Gain Plan", 60);
                plan.addExercise(new CardioAndStrengthExercise("Bench Press", 500));
                plan.addExercise(new CardioAndStrengthExercise("Push Ups", 300));
            } else {
                plan = new WorkoutPlan("Male Maintenance Plan", 60);
                plan.addExercise(new CardioAndStrengthExercise("Running", 800));
                plan.addExercise(new CardioAndStrengthExercise("Squats", 450));
            }
        } else {
            //female plans
            if (user.getWeight() > 70) {
                plan = new WorkoutPlan("Female Weight Loss Plan", 40);
                plan.addExercise(new CardioAndStrengthExercise("Running", 800));
                plan.addExercise(new CardioAndStrengthExercise("Biking", 700));
            } else if (user.getWeight() < 50) {
                plan = new WorkoutPlan("Female Weight Gain Plan", 45);
                plan.addExercise(new CardioAndStrengthExercise("Bench Press", 500));
                plan.addExercise(new CardioAndStrengthExercise("Push Ups", 300));
            } else {
                plan = new WorkoutPlan("Female Maintenance Plan", 40);
                plan.addExercise(new CardioAndStrengthExercise("Running", 800));
                plan.addExercise(new CardioAndStrengthExercise("Squats", 450));
            }
        }

        return plan;
    }

    @Override
    public DietPlan provideDietPlan(User user) {
        return null;
    }
}
