package reflection;

import model.Recipe;
import java.lang.reflect.*;

public class RecipeReflectionDemo {
    
    public void demonstrateReflection() {
        try {
            Class<?> recipeClass = Class.forName("model.Recipe");
            
            System.out.println("=== REFLECTION ===");
            System.out.println("Class: " + recipeClass.getName());
            
            System.out.println("\nMethods:");
            Method[] methods = recipeClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("- " + method.getName());
            }
            
            System.out.println("\nFields:");
            Field[] fields = recipeClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("- " + field.getName());
            }
            
            Constructor<?> constructor = recipeClass.getConstructor(String.class);
            Object recipeInstance = constructor.newInstance("Test Recipe");
            
            Method getNameMethod = recipeClass.getMethod("getName");
            String name = (String) getNameMethod.invoke(recipeInstance);
            System.out.println("\nInvoked getName(): " + name);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}