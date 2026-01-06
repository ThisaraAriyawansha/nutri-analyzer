package model;

public class NutritionInfo {
    private final int calories;
    private final double protein;
    private final double carbs;
    private final double fat;
    
    public NutritionInfo(int calories, double protein, double carbs, double fat) {
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }
    
    public int getCalories() { return calories; }
    public double getProtein() { return protein; }
    public double getCarbs() { return carbs; }
    public double getFat() { return fat; }
    
    public double calculateProteinPercentage() {
        return (protein * 4) / calories * 100;
    }
}