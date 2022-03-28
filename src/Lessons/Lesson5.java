package Lessons;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(a.length);
        System.out.println(a);
        a[1] = 12;
        double av = a[1];

        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(a[i]);
        }

        a[0] = 10;

        //чтобы распечатать массив: Arrays.toString(arr)
        System.out.println(Arrays.toString(a));

        a[0] = 20;
        System.out.println(Arrays.toString(a));

        String str1 = "Привет!";
        System.out.println(str1.length());

        String str3 = str1.replace("П", "P");
        System.out.println(str3);
        //substring(1, 4) - выдает элементы строки с 1 по 4. (в мессиве  и в строке элементы начинаются с нуля)
        System.out.println(str1.substring(1, 4));

        for (int i = 0; i < str1.length(); i = i + 1) {
            System.out.println(str1.charAt(i));
        }        //str1.charAt(i) - возвращает символ из строки по номеру его позиции

        //вывести все символы строки равные заданому условию
        for (int i = 0; i < str1.length(); i = i + 1) {
            if (str1.charAt(i) == '!') {
                System.out.println(str1.charAt(i));
            }
        }

        //неправильный (долгий,непроизводительный )
        //способ вывода элементов строки через массив - созжается лишний ненужный элемент
        String str2 = "Privet";
        char[] arr2 = str2.toCharArray();
        for (int i = 0; i < arr2.length; i = i + 1) {
            System.out.println(arr2[i]);
        }

        Integer a1 = 100;
        Integer b1 = 100;
        System.out.println(a == a);

        Integer a2 = 10000000;
        Integer b2 = 10000000;
        System.out.println(a == a);

        int[] a4 = {8, 2, 3, 5};

        int[][] b4 = {{1, 2}, {3, 4, 5}};

        int[][][] c4 = {{{1}, {2}}, {{3, 4}}};

        System.out.println(b4[0][1]);

        //последовательный вывод на печать элементов
        // многомерного массива через вложенный цикл
        for (int i = 0; i < b4.length; i = i + 1) {
          for (int j = 0; j < b4[i].length; j = j + 1) {
            System.out.println(b4[i][j]);
          }
        }

        //распечатать одномерный массив
        System.out.println(Arrays.toString(b4));

        //распечатать многомерный массив!!!
        System.out.println(Arrays.deepToString(b4));
        //     System.out.println(b4[i]);

        //найти на какой позиции находится нужный элемент вс троке
        System.out.println(str1.indexOf("!"));
        // если элемента нет , то выводит -1
        System.out.println(str1.indexOf("d"));
    }
}
