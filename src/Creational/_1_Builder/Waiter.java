package Creational._1_Builder;

public class Waiter {
//DIRECTOR: MANAGES THE CONSTRUCTION PROCESS

    private MealBuilder mealBuilder;

    public Waiter (MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal constructMeal() {
        mealBuilder.setMainCourse();
        mealBuilder.setSide();
        return mealBuilder.getResult();
    }

}
