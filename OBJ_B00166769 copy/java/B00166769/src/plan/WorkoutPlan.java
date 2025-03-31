package plan;

import exercise.Exercise;
import java.util.ArrayList;
import java.util.List;

public class WorkoutPlan {
    private String planName;
    private int duration;
    private List<Exercise> exercises;

    //constructor
    public WorkoutPlan(String planName, int duration) {
        this.planName = planName;
        this.duration = duration;
        this.exercises = new ArrayList<>();
    }

    //adds exercises to the workout plan
    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }
}
