public class MergeKsortedLists {
    private static Node mergeKLists(Node[] arr) {
        if(arr.length == 0) return null;
        int end = arr.length - 1;

        while (end > 0){
            int begin = 0;
            while (begin < end){
                arr[begin] = mergeTwoLists(arr[begin],arr[end]);
                begin++;
                end--;
            }
        }
        return arr[0];

    }

    private static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node prev = dummy;

        while (l1 != null && l2 != null){
            if(l1.data <= l2.data){
                prev.next = l1;
                l1 = l1.next;
            }
            else{
                prev.next=l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if(l1 != null) prev.next = l1;
        if(l2 != null) prev.next = l2;

        return dummy.next;
    }


    public static void main(String[] args) {

        int k = 3;


        Node[] list = new Node[k];

        list[0] = new Node(1);
        list[0].next = new Node(3);
        list[0].next.next = new Node(5);
        list[0].next.next.next = new Node(7);

        list[1] = new Node(2);
        list[1].next = new Node(4);
        list[1].next.next = new Node(6);
        list[1].next.next.next = new Node(8);

        list[2] = new Node(0);
        list[2].next = new Node(9);
        list[2].next.next = new Node(10);
        list[2].next.next.next = new Node(11);

        // Merge all lists
        Node head = mergeKLists(list);
        printList(head);
    }


    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}
