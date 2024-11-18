package arrays;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prac {
    public static void main(String[] args)
    {
        int[] a={10,20,30,40};
        int[] b={10,20,30,40};
        int[] arr=new int[4];

        for(int i=0;i<a.length;i++){
            System.out.println("The elements: "+a[i]);
        }

        System.out.println(arr.length);
        arr[0]=23;
        arr[1]=34;
        System.out.println("element 1"+arr[0]);
        System.out.println("element 2"+arr[1]);
        System.out.println("element 3"+arr[0]);
        b[2]=40;
        System.out.println(Arrays.equals(a, b));
        System.out.println(b[2]);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        Arrayss a1=new Arrayss();
        a1.addd();

//        String name[]={"Gova","kow","siri"};
//        for(String n : name){
//            System.out.println(n);
//        }
        for (int v:b){
            System.out.print(v+" ");
        }
    }
}

class Arrayss{
    public void addd() {
        int array3d[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d.length; j++) {
                System.out.println(array3d[i][j]);
            }
        }
    }


}
