package linkedList;

public class linkedList {
    private link first;

    public linkedList(){
        this.first=null;
    }

    public boolean isEmpty(){
        return(first==null);
    }
    public void displayList(){
        link current=first;

        while(current!=null){

            current.displayLink();
            current=current.next;
        }

    }

    public boolean find(int id){
        link current = first;

        while(current!=null) {
            if (current.data == id) {
                return true;
            } else {
                current = current.next;
            }
        }
            return false;
    }

    public void insertFirst(int id){
        link newLink=new link(id);

    }
}
