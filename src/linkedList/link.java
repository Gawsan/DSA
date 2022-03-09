package linkedList;

public class link {

    public int data;
    public link next;

    public link(int value){
        this.data=value;
        this.next=null;
    }

    public void displayLink(){
        System.out.println(data);
    }

}
