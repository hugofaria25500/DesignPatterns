package Creational._1_Builder;

public class BurgerMealBuilder implements MealBuilder{
//CONCRETE BUILDER: IMPLEMENTS THE BUILDER INTERFACE TO BUILD A SPECIF PRODUCT
    Meal meal = new Meal();

    @Override
    public void setMainCourse() {
        meal.setMainCourse("Burger");
    }

    @Override
    public void setSide() {
        meal.setSide("Fries");
    }

    @Override
    public Meal getResult() {
        return meal;
    }
}
