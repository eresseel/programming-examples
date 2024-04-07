public class Employee extends Person {
    public static final double TAX_RATE_PERCENR = 15;
    protected double monthlySalary;

    public Employee(String name, int age, double monthlySalary) {
        super(name, age);
        this.monthlySalary = monthlySalary;
        someSillyStuff();
    }

    public Employee(String name, int age) {
        this(name, age, 4000);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getIncomeTax() {
        return monthlySalary * 1 + (TAX_RATE_PERCENR / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", munkavallalo";
    }

    public void someSillyStuff() {
        System.out.println("someSillyStuff was call");
    }
}
