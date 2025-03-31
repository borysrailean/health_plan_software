package services;

import plan.WorkoutPlan;
import plan.DietPlan;
import user.User;

public interface FitnessService {
    //provides workout plan based on the inserted data
    WorkoutPlan provideWorkoutPlan(User user);

    //provides diet plan based on the inserted data
    DietPlan provideDietPlan(User user);
}
