package tracker;

public class ActivityTracker {
    private String activityName;
    private int duration;
    private double caloriesBurned;

    //constructor
    public ActivityTracker(String activityName, int duration, double caloriesBurned) {
        this.activityName = activityName;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    //log activity
    public void logActivity() {
        System.out.println("Logged activity: " + activityName + " for " + duration + " minutes.");
    }

    //generate summary
    public String generateSummary() {
        return "Activity: " + activityName + ", Duration: " + duration + " mins, Calories Burned: " + caloriesBurned;
    }
}
