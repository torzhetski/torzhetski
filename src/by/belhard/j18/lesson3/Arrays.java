package by.belhard.j18.lesson3;

public class Arrays {
    public static void main(String[] args) {
        int [] array={5,6,8,-10,11};
        System.out.println(array[3]);

        array[0] = 100;
        System.out.println(array[0]);

        int[] array1= new int[3];
        System.out.println(array1[0]);

        int[][] arrayD=new int[3][];
        arrayD[0]=new int[3];
        arrayD[1]=new int[2];
        arrayD[2]=new int[4];
        arrayD[1][0]=5;
        arrayD[1][1]=-55;
        System.out.println(arrayD[1]);

    }
}
