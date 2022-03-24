package queue;

public class queApp {
    public static void main(String []args){
        que x=new que(10);
        x.peekFront();
        x.insert(10);
        x.insert(25);
        x.insert(15);

        System.out.print("FIFO : ");

        while(!x.isEmpty()) {
            System.out.print(x.remove()+ " ");
        }
    }
}
