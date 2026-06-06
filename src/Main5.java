interface Payable{
    double calculatePay();
}
interface Taxable{
    double calculateTax();
}
class Employee implements Payable,Taxable{
    private double baseSalary;
    private double hoursWorked;
    public double calculatePay(){
        return baseSalary*hoursWorked;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateTax(){
        return 0.1*calculatePay();
    }
    public double netSalary(){
        return calculatePay()-calculateTax();
    }
}
public class Main5{
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setBaseSalary(20);
        obj.setHoursWorked(100);
        System.out.println(obj.netSalary());
    }
}