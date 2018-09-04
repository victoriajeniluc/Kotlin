package question1;


/**
 * Question 1: Solution
 *
 * Employee class.
 * Made following changes.
 * 1. Made instance variables private.
 * 2. Provided getter and setter for salary and organization. [Generated code]
 * 3. Provided getter for name, no setter for name. [Generated code]
 * 4. Added parameterized constructor to initialize instance variables. [Generated code]
 * 5. toString() method is overridden.
 *
 * @author Udayan Khattry
 */

public class Employee {
    private String name;
    private double salary;
    private String organization;

    public Employee(String name1, double salary1, String organization1){
        this.name = name1;
        this.salary = salary1;
        this.organization = organization1;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Employe: [" + name + ", " + salary + ",  " + organization+ "]";
    }
}
