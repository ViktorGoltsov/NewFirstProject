package Lessons;

public class Lesson5 {

   // public static void sum3 (int a1, int b1) {     // Сигнатура метода: название, количество параметров, их типы и последовательность.
        // Метод должен начинаться с маленькой буквы и содержать глагол, в скобках указываются параметры  метода
     //   int z = a1 + b1;
       // System.out.println(z);
   // }
   // public static void sum(int a1, int b1, int c1) {
   //     int z = a1 + b1 + c1;
    //    System.out.println(z);
    //}

    public static int howOld(final String herOld) {
        char c = herOld.charAt(0);
        return Character.getNumericValue(c); //число, написанное в char переводит в int value

        //String str = herOld.substring(0, 1); // - or use String and parseInt method to convert no int
        //return Integer.parseInt(str);    // but in this way we create substring and separate object and this leads lower performance.
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;

    }



        public static void main(String[] args) {  //point to enter - main is a specific method used to ran application. We don't use it in Test Class because in Test class we run nothing.

            System.out.println(howOld("1 year old"));
            System.out.println(getVolumeOfCuboid(2, 4, 6));



        Test t = new Test(); //Создаем объект типа Тест, который помещаем в переменную t типа Тест

        int a1 = 10;
        int b1 = 5;
        int c1 = 7;
        int r1 = t.sum(a1, b1, c1);       // в скобках указываем аргументы метода в виде переменной или константы
        System.out.println(r1);

        int x = 11;
        int y = 3;
        System.out.println(t.sum3(x, y));          // в скобках указываем аргументы метода в виде переменной или константы

        //________________________________________________

        String str = "Hi!";
        System.out.println(str.indexOf("!"));

        //________________________________________________

        // Унарные операторы ++ --
        int a = 10;
        int b = a++;
        //++a - прединкремент: сначала инкремент делает, потом возвращает переменную
        // a++ - почтинкремент: сначала возвращает переменную, потом делает инкремент

        a += 5; // то же самое, что  a = a + 5;
        // то же самое действует для -=  *=  /=

        System.out.println(a);
        System.out.println(b);

        //________________________________________________

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
            continue; // ключевое слово - прерывает итерацию (пропускает)
                //break; // ключевое слово - Прерывает цикл (выходим из цикла)
            }
            System.out.println(i);
        }

        //Дебагинг  // F8 - переход на следующий шаг, F9 - переход между брейк пойнтами. F7 - заход в метод


    }
}
