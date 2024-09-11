public class Main {
    public static void main(String[] args) {
        Printer printer1 = Printer.getInstance();
        printer1.print("Report.pdf");

        Printer printer2 = Printer.getInstance();
        printer2.print("Invoice.pdf");

        System.out.println(printer1 == printer2); // true
    }
}
