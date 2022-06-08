package Interview;

import java.util.Arrays;

public class acendingArray {
    public static void main(String[] args) {
        int [] x=new int[]{1,9,5,2,8,6,4};

        int temp=0;

        System.out.println("Before");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+ " ");
        }

        for(int i=0;i<x.length;i++){
            for(int j=i;j<x.length;j++){
                if(x[i]>x[j]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        System.out.println("\nAfter");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+ " ");
        }
    }
}
