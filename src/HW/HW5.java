package HW;

public class HW5 {

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
            //str1 = (str1 + i + " sheep...");
            str1 += (i + " sheep..."); // с таким оператором запись короче!
        }
        return str1;
    }

    public static void main(String[] args) {

        HW5_1 hw = new HW5_1();
        //1
        int a = 5;
        int b = 10;
        System.out.println(hw.sum(a, b));
        System.out.println(hw.sub(a, b));
        System.out.println(hw.mult(a, b));
        System.out.println(hw.div(a, b));

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

        int[] arr = {10, 20, -170, -280};
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
        //Вариант Сергея - уход от двойной записи длины строки: указывается только в начальном значении i
        for (int i = 9; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j <= i; j++) {
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

        //по варианту Сергея, где длина строки указывается 1 раз
        String nSpace2 = "";
        for (int i = 9; i >= 0; i--) {
            System.out.print("\n");
            System.out.print(nSpace2);
            nSpace2 = (nSpace2 + " ");
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
        }

        //вариант Сергея
        System.out.println();
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

        //5.2.3
        String nSpace3 = "";
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            System.out.print(nSpace3);
            nSpace3 = (nSpace3 + "  ");
            for (int j = 9 - i ; j > (-10 + i); j--) {
                if (j >= 0){
                    System.out.print(j);
                    System.out.print(" ");
                } else {
                    System.out.print(-j);
                    System.out.print(" ");
                }
            }
        }

    }
}
