package HW;

import java.util.Locale;

public class HW4 {

    public static void main(String[] args) {

        //1 необходимо вывести сумму всех значений массива.
        int sumOfArray = 0;
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i = i + 1) {
        sumOfArray = sumOfArray + array[i];
        }
        System.out.println(sumOfArray);

        //2  необходимо вывести максимальное значение массива.
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    //    int maxValueOfArray = array2[0];
        int maxValueOfArray = Integer.MIN_VALUE; //или вот такую строку вместо предыдущей на случай прихода пустого массива
        for (int i = 0; i < array2.length; i = i + 1) {
            if (array2[i] > maxValueOfArray) {
                maxValueOfArray = array2[i];
            }
        }
        System.out.println(maxValueOfArray);

        //3 необходимо вывести минимальное значение массива.

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValueOfArray = Integer.MAX_VALUE;
        for (int i = 0; i < array3.length; i = i + 1) {
            if (array3[i] < minValueOfArray) {
                minValueOfArray = array3[i];
            }
        }
        System.out.println(minValueOfArray);

        //4 необходимо вывести среднее арифметическое всех значений массива.
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumOfElements = 0;
        double avgOfErray4;
        for (int i = 0; i < array4.length; i = i +1) {
            sumOfElements = sumOfElements + array4[i];
        }
        avgOfErray4 = sumOfElements*1.0 / array4.length;
        System.out.println(avgOfErray4);

        //5 необходимо вывести сумму элементов массива.
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sumOfArray5 = 0;

        for (int i = 0; i < array5.length; i = i + 1) {
            for (int j = 0; j < array5[i].length; j = j + 1) {
                sumOfArray5 = sumOfArray5 + array5[i][j];
            }
        }
        System.out.println(sumOfArray5);

        //6 необходимо вывести максимальное значение массива.
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxValueOfArray6 = array6[0][0];
        for (int i = 0; i < array6.length; i = i + 1) {
            for (int j = 0; j < array6[i].length; j = j + 1) {
                if (array6[i][j] > maxValueOfArray6) {
                    maxValueOfArray6 = array6[i][j];
                }
            }
        }
        System.out.println(maxValueOfArray6);

        //7 необходимо вывести количество элементов в массиве.
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int nOfElements7 = 0;
        for (int i = 0; i < array7.length; i = i + 1) {
            for (int j = 0; j < array7[i].length; j = j + 1) {
                nOfElements7 = nOfElements7 + 1;
            }
        }
        System.out.println(nOfElements7);

        //короткий способ //
        int[][] array77 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int nOfElements77 = 0;
        for (int i = 0; i < array77.length; i = i + 1) {
                nOfElements77 = nOfElements77 + array77[i].length;
        }
        System.out.println(nOfElements77);


        //4.2


        //1
        // необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)

        // неправильный способ - ухудшает производительность
        String s = "Перестановочный алгоритм быстрого действия";
        char [] array8 = s.toCharArray();
        for (int i = 0; i < array8.length; i = i + 1) {
            if (array8[i] == 'о') {
                System.out.print(array8[i]);
            }
        }
        System.out.println();

        // правильный способ
        String ss = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < ss.length(); i = i + 1) {
            if (ss.charAt(i) == 'о') {
                System.out.print(ss.charAt(i));
            }
        }
        System.out.println();

       //2
       // необходимо подсчитать количество букв “е” в строке.
       // Для указанной строки ответ будет 4.
        String s2 = "Перевыборы выбранного президента";
        //char [] array9 = s2.toCharArray();  неправильный способ - ухудшает производительность
        int numOfe = 0;
        for (int i = 0; i < s2.length(); i = i + 1) {
            if (s2.charAt(i) == 'е') {
                numOfe = numOfe + 1;
            }
        }
        System.out.println(numOfe);

        //3
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
        String s3 = "Посмотрите как Рите нравится ритм";
        int longOfStrToFind = ("рит").length();
       // char [] arr9 = s3.toCharArray(); -  неправильный способ - ухудшает производительность
        for (int i = 0; i < s3.length()-longOfStrToFind+1; i = i + 1) {   // от длины массива отнимаем длину куска строки, который ищем, чтобы в проверке if не выйти за границы строки
            String str9 = s3.substring(i, i + 3);       // нам нужно +2 р(+и+т), но пишем 3, потому что синтаксис // метода такой (будет возвращать символы до номера индеса -1 от указанного
            if (str9.equalsIgnoreCase("рит")) {
                System.out.println(i);
            }
        }
        // Способ Сергея * Правильный!
        s3 = s3.toLowerCase(); // переводит все в нижний регистр для сравнения
        int index2 = s3.indexOf("рит");  //возвращает индекс начала первого совпадающего элемента в строке
        while (index2 != -1) {
            System.out.println(index2);
            index2 = s3.indexOf("рит", index2 + 1); //возвращает индекс начала совпадающего элемента в строке, начиная с указанного нами индекса элемента
        }


        //4
        // String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        String[][] array10 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int n = 0;
        for (int i = 0; i < array10.length; i = i + 1) {
            for (int j = 0; j < array10[i].length; j = j +1) {
              if (!array10[i][j].contains("е")) {
                  n = n + 1;
              }
            }
        }
        System.out.println(n);






    }

}
