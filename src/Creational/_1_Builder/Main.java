package Creational._1_Builder;

public class Main {
//## CREATIONAL - BUILDER ## //

    public static void main(String[] args) {
    //CLIENT: USES THE DIRECTOR (WAITER) TO BUILD THE PRODUCT

        MealBuilder burgerMealBuilder = new BurgerMealBuilder();
        Waiter waiter = new Waiter(burgerMealBuilder);
        Meal meal = waiter.constructMeal();
        System.out.println("Meal: " + meal);
    }
}
