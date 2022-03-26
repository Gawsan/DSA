package queue;

public class circulaeQue {


        private int [] queArray;
        private int front;
        private int rear;
        private int nItems;
        private int maxSize;

        public circulaeQue(int size){
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
                //circular que
                //current rear maximum then we need to made -1
                if(rear==maxSize-1){
                    rear=-1;
                }
                }
                queArray[++rear]=num;
                nItems++;
            }
        public int remove(){
            if(nItems==0){
                System.out.println("Queue is empty...");
                return -99;
            }
            else{
                nItems--;
                int temp= queArray[front++];
                if(front==maxSize){
                    front=0;
                }
                return temp;
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

