package homework.hw4.task;

public class BLinkList {
    int itemData;
    BLinkList before;
    BLinkList after;
    BLinkList head;
    BLinkList tail;

    public BLinkList() {

    }

    public void in(int data) {
        BLinkList list = new BLinkList();
        list.itemData = data;
        if (tail == null) {
            head = list;
        } else {
            tail.after = list;
            list.before = tail;
        }
        tail = list;
    }

    public void twist() {
        BLinkList actual = tail;
        System.out.print("[");
        while (actual != null) {
            System.out.print(actual.itemData);
            if (actual.before != null){
                System.out.print(", ");
            }
            actual = actual.before;
        }
        System.out.println("]");
    }
}

