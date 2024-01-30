package Behavioral._10_TemplateMethod;

public class SalesReport extends ReportTemplate{
// Concrete Class (Sales Report)

    @Override
    protected void generateTitle() {
        System.out.println("Sales Report Title");
    }

    @Override
    protected void formatData() {
        System.out.println("Format sales data");
    }

    @Override
    protected void generateBody() {
        System.out.println("Generate sales report body");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Generate sales report footer");
    }
}
