package patterns;

import model.NutritionInfo;

public class ExternalNutritionAdapter implements NutritionAdapter {
    
    // Inner class - make it public
    public static class ExternalNutritionAPI {
        public String getNutritionData(String ingredient) {
            return String.format("%s|calories:%d|protein:%.1f|carbs:%.1f|fat:%.1f", 
                ingredient, 100, 10.0, 15.0, 5.0);
        }
    }
    
    private ExternalNutritionAPI externalAPI;
    
    public ExternalNutritionAdapter() {
        this.externalAPI = new ExternalNutritionAPI();
    }
    
    @Override
    public NutritionInfo adapt(String ingredient) {
        String externalData = externalAPI.getNutritionData(ingredient);
        String[] parts = externalData.split("\\|");
        
        int calories = 100;
        double protein = 10.0, carbs = 15.0, fat = 5.0;
        
        for (String part : parts) {
            if (part.startsWith("calories:")) {
                calories = Integer.parseInt(part.split(":")[1]);
            }
        }
        
        return new NutritionInfo(calories, protein, carbs, fat);
    }
}