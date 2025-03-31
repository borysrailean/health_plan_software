import java.util.Scanner;
import services.WorkoutService;
import services.DietService;
import plan.WorkoutPlan;
import plan.DietPlan;
import user.User;
import tracker.ProgressTracker;

public class Main {
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);

        //users details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your weight (kg): ");
        //validates user input to numbers only
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number for weight.");
            scanner.next();
        }
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number for height.");
            scanner.next();
        }
        double height = scanner.nextDouble();

        System.out.print("Enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number for age.");
            scanner.next();
        }
        int age = scanner.nextInt();

        scanner.nextLine();
        String sex = "";
        while (true) {
            System.out.print("Enter your sex (male/female): ");
            sex = scanner.nextLine().toLowerCase();
            if (sex.equals("male") || sex.equals("female")) {
                break;
            } else {
                System.out.println("Please spell as mentioned in the question (male/female).");
            }
        }

        String activityLevel = "";
        while (true) {
            System.out.print("Enter your activity level (sedentary, light, moderate, active, very active): ");
            activityLevel = scanner.nextLine().toLowerCase();
            if (activityLevel.equals("sedentary") || activityLevel.equals("light") || activityLevel.equals("moderate")
                    || activityLevel.equals("active") || activityLevel.equals("very active")) {
                break;
            } else {
                System.out.println("Please spell as mentioned in the question (sedentary, light, moderate, active, very active).");
            }
        }

        //store user info
        User user = new User(name, weight, height, age, sex, activityLevel);

        //calculate the user daily calorie intake (bmr tdee from user formula)
        double calorieIntake = user.calculateTDEE();
        System.out.println("\nYour daily calorie intake needed: " + calorieIntake + " kcal");

        //create instances
        WorkoutService workoutService = new WorkoutService();
        DietService dietService = new DietService();
        ProgressTracker progressTracker = new ProgressTracker();

        //create workout and diet plans based of info given
        WorkoutPlan workoutPlan = workoutService.provideWorkoutPlan(user);
        DietPlan dietPlan = dietService.provideDietPlan(user);

        //display workout plan
        System.out.println("\n--- Workout Plan ---");
        System.out.println("Plan: " + workoutPlan.getPlanName());
        System.out.println("Duration: " + workoutPlan.getDuration() + " minutes");
        workoutPlan.getExercises().forEach(exercise -> {
            System.out.println("- " + exercise.getName() + ": " + Math.round(exercise.calculateCaloriesBurned(30)) + " calories burned in 30 mins");
        });

        //display diet plan
        System.out.println("\n--- Diet Plan ---");
        System.out.println("Plan: " + dietPlan.getPlanName() + " (" + Math.round(user.calculateTDEE()) + " kcal)");
        dietPlan.getMeals().forEach(meal ->
                System.out.println(meal.getMealName() + ": " + meal.getNutritionalValue())  // Display the nutritional values
        );

        //display the progress report from tracker
        System.out.println("\nProgress Report:");
        progressTracker.displayProgress(user, workoutPlan, dietPlan);

        //close scanner
        scanner.close();
    }
}
