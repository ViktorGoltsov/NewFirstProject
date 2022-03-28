package HW;

public class HW2 {
    public static void main (String [] args){
int a = 10;
int b = 25;
int c = a+b;
int d = a*b;
int c2=a-b;
double e = (a+0.0)/b;
int g=a%b;
int g2=b%a;
int i=a%2;
int j=b%2;


String f ="\u263B\uD83D\uDE37\u263B";
        System.out.println(f);
        System.out.println("a= "+a+"\nb= "+b);
        System.out.println("a+b= "+c);
        System.out.println("a*b= "+d);
        System.out.println("a-b= "+c2);
        System.out.println("a/b= "+e);
        System.out.println("a/b ost= "+g);
        System.out.println("b/a ost= "+g2);
        if (i==0) {
            System.out.println("a - четное число");}
        else {System.out.println("a - нечетное число");}
        if (j==0) {
            System.out.println("b - четное число");}
        else {System.out.println("b - нечетное число");}

    }
}
