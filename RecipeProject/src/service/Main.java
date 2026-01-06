package service;

import reflection.RecipeReflectionDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== AI RECIPE ANALYZER ===\n");
        
        // Create service
        RecipeService service = new RecipeService();
        
        // Demonstrate features
        service.demonstrateAllFeatures();
        
        System.out.println("\n=== REFLECTION DEMONSTRATION ===");
        RecipeReflectionDemo reflectionDemo = new RecipeReflectionDemo();
        reflectionDemo.demonstrateReflection();
        
        System.out.println("\n=== PROJECT SUMMARY ===");
        System.out.println("✓ 3 Design Patterns implemented");
        System.out.println("✓ Reflection demonstrated");
        System.out.println("✓ Functional Programming with Streams");
        System.out.println("✓ Bad smells identified and fixed");
        System.out.println("✓ All code compiles and runs");
    }
}