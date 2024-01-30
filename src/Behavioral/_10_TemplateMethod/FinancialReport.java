package Behavioral._10_TemplateMethod;

public class FinancialReport extends ReportTemplate{
// Concrete Class (Financial Report)

    @Override
    protected void generateTitle() {
        System.out.println("Financial Report Title");
    }

    @Override
    protected void formatData() {
        System.out.println("Format financial data");
    }

    @Override
    protected void generateBody() {
        System.out.println("Generate financial report body");
    }

    @Override
    protected void generateFooter() {
        System.out.println("Generate financial report footer");
    }
}
