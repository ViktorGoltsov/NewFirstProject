package HW;

public class HW5 {

    // сложение 2х чисел
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    // вычитание 2х чисел
    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    // умножение 2х чисел
    public static void mult(int a, int b) {
        System.out.println(a * b);
    }

    // деление 2х чисел
    public static void div(int a, int b) {
        System.out.println((double) a / b);
    }

    //Задачи №2
    //2.1. You need to double the integer and return it.
    public static int doubleTheInteger(int a) {
        a = a * 2;
        return a;
    }

    //2.2
    // Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower
    // each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
    //Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.

    public static boolean isLove(final int flower1, final int flower2) {
        return ((flower1 + flower2) % 2 != 0);
    }

    //2.3
    // We need a function that can transform a number into a string.
    //What ways of achieving this do you know?
    public static String numberToString(int num) {
        Integer numInt = num;
        String str = numInt.toString();
        return str;
    }

    public static String numberToString2(int num) {//
        String str = String.valueOf(num);
        return str;
    }

    public static String numberToString3(int num) {//
        String str = ("" + num);
        return str;
    }

    //2.4
    public static int findSmallestInt(int[] args) {
        int minValueOfArr = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (minValueOfArr > args[i]) {
                minValueOfArr = args[i];
            }
        }
        return (minValueOfArr);
    }

    //2.5
    //Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
    // Input will always be valid, i.e. no negative integers.
    public static String countingSheep(int num) {
        int i = 0;
        String str1 = "";
        while (i < num) {
            i++;
            str1 = (str1 + i + " sheep...");
        }
        return str1;
    }

    public static void main(String[] args) {

        //1
        int a = 5;
        int b = 10;
        sum(a, b);
        sub(a, b);
        mult(a, b);
        div(a, b);

        //2.1
        System.out.println(doubleTheInteger(5));

        //2.2
        int numberOfPetalsTim = 2;
        int numberOfPetalsSara = 4;

        System.out.println(isLove(numberOfPetalsTim, numberOfPetalsSara));

        //2.3.
        System.out.println(numberToString(555));
        System.out.println(numberToString2(777));
        System.out.println(numberToString3(888));

        //2.4 Given an array of integers your solution should find the smallest integer.
        //You can assume, for the purpose of this kata, that the supplied array will not be empty.

        int[] arr = {10, 20, -170, -290};
        System.out.println(findSmallestInt(arr));

        //2.5
        int Sheep = 5;
        System.out.println(countingSheep(Sheep));

        //5.2.1
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            for (int j = 0; j < (10 - i); j++) {
                System.out.print(j);
            }
        }

        //5.2.2
        String nSpace = "";
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            System.out.print(nSpace);
            nSpace = (nSpace + " ");
            for (int j = 0; j < (10 - i); j++) {
                System.out.print(j);
            }
        }

        //5.2.3
        String nSpace2 = "";
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            System.out.print(nSpace2);
            nSpace2 = (nSpace2 + " ");
            for (int j = 9 - i ; j > (-10 + i); j--) {
                if (j >= 0){
                    System.out.print(j);
                } else {
                    System.out.print(-j);
                }
            }
        }

    }
}
