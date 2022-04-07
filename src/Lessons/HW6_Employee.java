package Lessons;

public class HW6_Employee {

    private static String name; //??? Не понятно, почему Static??? privat - позволяет обращаться к полю из других классов только через геттер и сеттер
    private int age; //public - позволяет обращаться к полю из других классов напрямую от объекта без применения геттеров и сеттеров
    private String gender;
    private int salary;

    public HW6_Employee (String name, int age, String gender, int salary) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setSalary(salary);
    }

    public static void setName(String name) {   //??? Не понятно, почему Static???
        HW6_Employee.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isNameEqualToParam (String nameParam) {
        boolean ifNameEqualToParam = false;
        if (HW6_Employee.name.equalsIgnoreCase(nameParam)) {
            ifNameEqualToParam = true;
        }
        return ifNameEqualToParam;
    }
}
