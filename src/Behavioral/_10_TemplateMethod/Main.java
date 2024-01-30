package Behavioral._10_TemplateMethod;

public class Main {
//Code Client

    public static void main(String[] args) {
        // Generate a Sales Report
        ReportTemplate salesReport = new SalesReport();
        salesReport.generateReport();

        // Output:
        // Sales Report Title
        // Format sales data
        // Generate sales report body
        // Generate sales report footer

        System.out.println(); // Separator

        // Generate a Financial Report
        ReportTemplate financialReport = new FinancialReport();
        financialReport.generateReport();

        // Output:
        // Financial Report Title
        // Format financial data
        // Generate financial report body
        // Generate financial report footer
    }
}
