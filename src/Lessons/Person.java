package Lessons;

public class Person {

    //System.out.println("Hello world"); // System - объект .out - поле .println - метод
   String name = "Ivan";   // поле класса//чаще всего оставляем поля пустыми
   int age = 10;           //чаще всего оставляем поля пустыми
    //Person person; - может быть и так

    //конструктор - специфический метод класса для создания объекта!
    //аргументы передаются при создании объектов класса
    //Имя Конструктора всегда совпадает с именем типа (класса)
    Person(String name, int age) { //название полей и параметров конструктора пишут чаще одинаковыми, чтобы не путаться, но можно и по разному написать
        this.name = name;
        this.age = age;

    }

    Person(String name) { //название полей и параметров конструктора пишут чаще одинаковыми, чтобы не путаться, но можно и по разному написать
        this.name = name;

    }
    //Оверлоадинг - модно завести два конструктора с одинаковым именем (нужно сделать различия в параметрах: тип, количество или последовательность - место в скобках)

    void printObject() {                  // метод

         String name = ""; //переменная

        System.out.println(this.name); //метод может принимать переменную или поле коласса. Если они одноименные, для чтого, чтобы метод понял, что это поле класса ставится слово this
        System.out.println(this.age); //This равна тому объекту класса, к которому в настоящий момент идет обращение! После This.можно вызвать не только поле, но и метод
        //когда пишем this - обращаемся к любым членам класса - синоним "Я" для объекта класса

    }

}
