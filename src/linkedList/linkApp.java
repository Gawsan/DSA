package linkedList;

public class linkApp {

    public static void main(String  [] args){
        linkedList l=new linkedList();
        l.insertFirst(9);
        l.insertFirst(9);
        l.insertFirst(8);
        l.displayList();
        while(!l.isEmpty()){
           link temp=l.deleteFirst();
            temp.displayLink();
        }
    }
}
