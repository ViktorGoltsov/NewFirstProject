package Lessons;

public class HW6_Salary {
    private String name;
    private int age;
    private String gender;
    private int salary;

   public HW6_Salary (String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public static int sumSalary (HW6_Salary[]emp) {
        int sum = 0;
        for (int i = 0; i < emp.length; i++) {
            sum = sum + emp[i].salary;
        }
        return sum;
    }
}
