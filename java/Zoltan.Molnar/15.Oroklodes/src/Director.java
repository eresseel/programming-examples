public class Director extends Employee {
    public static final double TAX_RATE_PERCENR = 20;
    private double bonus = 0.0;

    public Director(String name, int age) {
        super(name, age, 25000);
    }

    public Director(String name, int age, double monthlySalary) {
        super(name, age, monthlySalary);
    }

    @Override
    public String getName() {
        return super.getName() + ", a fonok";
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getMonthlySalary() {
        return monthlySalary + bonus;
    }

    @Override
    public void someSillyStuff() {
        monthlySalary = 2000000;
    }
}
