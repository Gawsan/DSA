package linkedList;

public class linkedList {
    private link first;

    public linkedList() {
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
        link current = first;

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

    public link deleteMiddle(int id) {

    }
}
