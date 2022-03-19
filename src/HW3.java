public class HW3 {

    public static void main(String[] args) {

        String l = "----------------------------------" ;
        int a = 12;
        int b = 10;

    //#1
        System.out.println("#1" + l);
        if (a == b) {

        System.out.println("a == b");

        } else  if (a < b) { System.out.println("a < b");

        } else {System.out.println("a > b");}

    //#2
        System.out.println("#2" + l);
        int c = 15;
        int d = 18;
        int sum = c + d;

        if ((sum%2) == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        //#3
        System.out.println("#3" + l );
        int e = 41;
        System.out.println("e = " + e);
        if (e > 10) {
            System.out.println("more then 10");
        }

        if (e < 100) {
            System.out.println("less then 100");
        }

        if ((e*1.0/ 2) > 20) {
            System.out.println("результат деления на 2 больше 20");
        }

        if ((e >= 5) && (e <= 40)) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        //#3.2 1
        System.out.println("#3.2 1" + l );
        for (int i = 0;i <= 15;) {
            System.out.println(i);
            i = i + 1;
        }

        System.out.println("#3.2 2" + l );

        int rez = 5;
        for (int i = 1;rez <10000;i++) {
            System.out.println(rez);
            rez = rez * 5;
        }

        //короткий вариант с выводом нулевой степени числа 5
        for (int i = 1;i < 10000; i = i * 5) {
            System.out.println(i);
        }

        System.out.println("#3.2 3.1" + l );

        int rez2 = 4;
        for (int j = 40; j <= 60; j = j + 1){
            if ((j%4) == 0) {
                System.out.println(j);
            }
        }

        System.out.println("#3.2 3.2" + l );
        for (int k = 40; k <= 60; k = k + 4) {
            System.out.println(k);
        }
    }
}
