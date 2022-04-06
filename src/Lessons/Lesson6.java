package Lessons;

import java.util.Arrays;

public class Lesson6 {


    public static void main(String[] args) {
      //  double a = 2.0 - 1.1;
        //будет 0,89999999, как с этим бороться
      //  System.out.printf("%.6f", a);

        //int[] arr = {1, 2, 3, 4};

        //а изнасчально, чтобы создать массив, нужно было написать
        //int[] arr = new int[4] или int[]{1, 2, 3, 4}; -- массив на 4 переменных без их указания или с указанием
        //int[] arr = null; - тут массив не создаем, - тут распечатается Null
        //int[] arr = new int[4];//  --  пишем, если хотиим создать массив не заполненный по умолчанмию (указываем количество элементов) - будет заполнен "0,0,0,0".
        //int[] arr = new int[0]; - создаем пустой массив// или
        //int[] arr = {}; - создаем пустой массив//

        Person [] arr = new Person[10]; //иногда нужно создать пустые массивы определенной длины  - в задачах встречается.
        System.out.println(Arrays.toString(arr));

        Person person1 = new Person("Anna");
        //person1.name = "Anna";
        //person1.age = 30;

        Person person2 = new Person("Sergey", 31);
        //person2.name = "Sergey";
        //person2.age = 35;

        //System.out.println(person1.name);
        //System.out.println(person2.name);
//  у классов нет значений - это шаблон. У объкектов (экземпляров) класса есть значения
        person1.printObject();
        person2.printObject();





    }
}
