public class stack {

        private double[]stkArray;
        private int maxSize;
        private int top;

        //constructor
        public stack(int s){
            maxSize=s;
            stkArray=new double[maxSize];
            top=-1;
        }

        public void push(double g){

            if(top==maxSize-1)
                System.out.println("Stack is full");
            else
                stkArray[++top]=g;

        }

        public double pop(){
            if(top==-1){
                System.out.println("Stack is full");
                return -99;
            }
            else
                return stkArray[top--];
        }

        public double peek(){
            if(top==-1){
                System.out.println("Stack is full");
                return -99;
            }
            else
                return stkArray[top];
        }
        public boolean isFull(){
            return(top==maxSize-1);
        }

        public boolean isEmpty(){
            return(top==-1);
        }

    }
    class StackApp{
    public static void main(String [] args){
        stack App=new stack(10);

        App.push(20);
        App.push(30);
        App.push(20);
        App.push(25);
        App.push(15);

        while(!App.isEmpty()){
            System.out.print(App.pop()+" ");
        }


    }

    }


