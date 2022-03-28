package linkedList;

public class linkedList {

    //first link call itt as first
    private link first;

    public linkedList() {
        //initially empty
        this.first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        link current = first;

        while (current != null) {

            current.displayLink();
            current = current.next;
        }

    }

    public boolean find(int id) {
        //initially current is first
        link current = first;
        //if not null
        while (current != null) {
            if (current.data == id) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void insertFirst(int id) {
        link newLink = new link(id);
        //need to check the concept
        newLink.next=first;
        //the change first as newlink
        first = newLink;
    }

    public void insertMiddle(int key, int id) {
        link newLink = new link(id);
        link current = first;
        while (current != null) {
            if (current.data == key) {
                newLink.next = current.next;
                current.next = newLink;
            } else {
                current = current.next;
            }
        }
    }

    public link deleteFirst() {
        link temp = first;
        first = first.next;
        return temp;
    }
//    public link deleteMiddle(){
//
//    }
}
