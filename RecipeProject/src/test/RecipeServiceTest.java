package test;

import service.RecipeService;
import reflection.RecipeReflectionDemo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class RecipeServiceTest {
    private RecipeService recipeService;
    
    @BeforeEach
    void setUp() {
        recipeService = new RecipeService();
    }
    
    @Test
    void testRecipesExist() {
        assertFalse(recipeService.getRecipes().isEmpty());
    }
    
    @Test
    void testReflectionWorks() {
        RecipeReflectionDemo demo = new RecipeReflectionDemo();
        assertDoesNotThrow(() -> demo.demonstrateReflection());
    }
    
    @Test
    void testServiceWorks() {
        assertDoesNotThrow(() -> recipeService.demonstrateAllFeatures());
    }
}