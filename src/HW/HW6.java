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
        HW6_Employee marpl2 = new HW6_Employee("Murpol", 80, "f", 50);
        System.out.println(marpl2.isNameEqualToParam("murpol"));
        HW6_Employee uotson2 = new HW6_Employee("Uotson", 68, "m", 70);
        System.out.println(marpl2.isNameEqualToParam("UotsoNn"));
        HW6_Employee john = new HW6_Employee("John", 50, "m", 60);
        HW6_Employee tanya = new HW6_Employee("Tanya", 40, "f", 70);
        HW6_Employee janna = new HW6_Employee("Janna", 63, "f", 90);
        HW6_Employee mikal = new HW6_Employee("Mikal", 40, "m", 80);


        //6.2.3 Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен
        // возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.


        HW6_Employee[] arr = {marpl2, tanya, janna};
        HW6_Salary salary = new HW6_Salary();
        System.out.println(salary.getSum(arr));
        //System.out.println(HW6_Salary.sumSalary(new HW6_Salary[]{john, tanya, janna}));  //или вот такая запись
    }

}
