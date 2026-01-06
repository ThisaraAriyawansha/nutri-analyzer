package patterns;

import model.NutritionInfo;

public interface NutritionAdapter {
    NutritionInfo adapt(String externalData);
}