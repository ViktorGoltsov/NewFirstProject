package HW;

import Lessons.HW6_Employee;
import Lessons.HW6_Person2;
import Lessons.HW6_Salary;

public class HW6 {
    public static void main(String[] args) {

        //6.2.1 Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод
        // возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
        HW6_Person2 marpl = new HW6_Person2("Murpol", 150, "f");
        HW6_Person2 uotson = new HW6_Person2("Uotson", 60, "m");

        marpl.setName("Burpol");
        //marpl.setAge(10);
        System.out.println(marpl.getName());
        System.out.println(marpl.getAge());
        System.out.println(uotson.getName());
        System.out.println(uotson.getAge());

        //6.2.2 Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
        // Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого
        // был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
        HW6_Employee marpl2 = new HW6_Employee("Murpol", 80, "f", 500);
        System.out.println(marpl2.isNameEqualToParam("murpol"));
        HW6_Employee uotson2 = new HW6_Employee("Uotson", 68, "m", 700);
        System.out.println(marpl2.isNameEqualToParam("UotsoNn"));

        //6.2.3 Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен
        // возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
        HW6_Salary john = new HW6_Salary("John", 50, "m", 75000);
        HW6_Salary tanya = new HW6_Salary("Tanya", 40, "f", 70000);
        HW6_Salary janna = new HW6_Salary("Janna", 63, "f", 73000);
        HW6_Salary mikal = new HW6_Salary("Mikal", 40, "m", 85000);

        HW6_Salary[] arr = {john, tanya, janna};
        System.out.println(HW6_Salary.sumSalary(arr));
        //System.out.println(HW6_Salary.sumSalary(new HW6_Salary[]{john, tanya, janna}));  //или вот такая запись
    }
}
