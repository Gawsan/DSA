package queue;

public class que {

    private int [] queArray;
    private int front;
    private int rear;
    private int nItems;
    private int maxSize;

    public que(int size){
        this.maxSize=size;
        queArray =new int[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public void insert(int num){
        if(rear==maxSize-1){
            System.out.println("Queue is full");
        }
        else{
            queArray[++rear]=num;
            nItems++;
        }
    }
    public int remove(){
        if(nItems==0){
            System.out.println("Queue is empty...");
            return -99;
        }
        else{
            nItems--;
            return queArray[front++];
        }
    }
    public int peekFront(){
        if(nItems==0){
            System.out.println("Queue is empty...");
            return -99;
        }
        else
            return queArray[front];
    }
    public boolean isEmpty(){
        return(nItems==0);
    }
    public boolean isFull(){
        return (rear==maxSize-1);
    }
}
