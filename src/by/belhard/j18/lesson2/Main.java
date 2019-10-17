package by.belhard.j18.lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        b = 10;
        System.out.println(a);
        System.out.println(b);


        Main m1 = new Main();
        Main m2 = new Main();
        System.out.println(m1);
        System.out.println(m2);


    }
}