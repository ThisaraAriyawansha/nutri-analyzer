# AI-Based Recipe & Nutrition Analyzer


## Project Overview

A console-based Java application that simulates an **AI-powered Recipe and Nutrition Analyzer**. 

It loads recipes from a JSON file, analyzes nutritional content (calories, protein, fats, carbs, sugar, etc.), calculates a health score, suggests healthier alternatives, and allows users to interact with the system through a simple menu-driven console interface.

Key features:
- Load and manage multiple recipes with detailed ingredients
- Automatic nutrition calculation and health scoring
- Recommendation of healthier recipe alternatives
- Dynamic recipe creation and update notifications
- Advanced querying and filtering of recipes

## Technologies Used

- **Java 17+**
- **Jackson** – for parsing `recipes.json`
- **JUnit 5** – for unit and reflection testing
- Pure console application (no GUI, no external database)


## Design Patterns Used

- **Factory Pattern** – Creates recipe objects dynamically based on category
- **Observer Pattern** – Notifies registered observers when recipes are analyzed or updated
- **Adapter Pattern** – Adapts a mock external nutrition API for compatibility

## Functional Programming

Java Streams are extensively used in `RecipeStreamProcessor` for:
- Filtering recipes (e.g., low-calorie, vegan)
- Mapping and transforming nutrition data
- Reducing values to compute averages
- Grouping and collecting results

## Reflection

`RecipeReflectionDemo` uses Java Reflection API to:
- Inspect classes, methods, and fields at runtime
- Dynamically invoke methods based on the application's structure
- Validate behavior through JUnit tests

## How to Run

1. Clone or download the repository
2. Open the project in Eclipse, IntelliJ IDEA, or any Java IDE
3. Add required dependencies:
   - Jackson (com.fasterxml.jackson.core:jackson-databind)
   - JUnit 5
   (Use Maven/Gradle or add JARs manually)
4. Ensure `recipes.json` is in the correct data folder
5. Run `Main.java`


