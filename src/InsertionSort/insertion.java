package InsertionSort;

public class insertion {

    public static void main(String[] args) {
        int key=0,j=0;
        int[] a=new int[]{10,15,30,18,45,8,7};

        for(int i=2;i<=a.length;i++){
            key=a[i];
            j=i-1;

            while(j>0 && a[i]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
