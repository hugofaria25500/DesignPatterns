package Behavioral._10_TemplateMethod;

abstract class ReportTemplate {
// Abstract Class (Template)

    // Template method with a sequence of steps
    public final void generateReport() {
        generateTitle();
        formatData();
        generateBody();
        generateFooter();
    }

    // Abstract or hook methods to be implemented by concrete subclasses
    protected abstract void generateTitle();
    protected abstract void formatData();
    protected abstract void generateBody();
    protected abstract void generateFooter();
}
