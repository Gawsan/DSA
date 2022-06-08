package Interview;

public class reverseArray {
    public static void main(String[] args) {
        int [] x = new int[]{1,5,4,3,2,9};
        System.out.println("before");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+ " ");
        }
        int temp, start =0, end=x.length-1;

        while(start<end){
            temp=x[start];
            x[start]=x[end];
            x[end]=temp;
            start++;
            end--;
        }
        System.out.println("\nAfter");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+ " ");
        }
    }


}
