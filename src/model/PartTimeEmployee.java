package model;

public class PartTimeEmployee extends Employee {
    public static final int MONEYPERHOUR = 100000;
    private double workHour;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String fullName, int age, String phone, String email, double workHour) {
        super(id, fullName, age, phone, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getNetSalary() {
        double result = workHour * MONEYPERHOUR;
        return result;
    }


    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", workHour=" + workHour +
                '}';
    }
}
