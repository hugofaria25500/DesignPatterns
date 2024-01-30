package Creational._1_Builder;

public interface MealBuilder {
//BUILDER: ABSTRACT INTERFACE FOR BUILDING THE PRODUCT

    void setMainCourse();
    void setSide();
    Meal getResult();

}
