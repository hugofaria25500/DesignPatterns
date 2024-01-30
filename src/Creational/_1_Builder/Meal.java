package Creational._1_Builder;

public class Meal {
//PRODUCT: REPRESENTS THE OBJECT TO BE CONSTRUCTED

    private String mainCourse;
    private String side;

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mainCourse='" + mainCourse + '\'' +
                ", side='" + side + '\'' +
                '}';
    }
}
