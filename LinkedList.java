public class LinkedList {
  public static class Node{
            Node next;
            int value;

            public Node(int val){
                value = val;
                next = null;
            }
        }
        Node head;

        public static void PrintList(LinkedList list){
            Node curr = list.head;

            while (curr.next != null){
                System.out.print(curr.value + " ");
                curr = curr.next;

            }
            System.out.println(curr.value);
        }

        public static void AddAtEnd(LinkedList list, int val){
            if (list.head == null){
                list.head = new Node(val);
            }
            else {
                Node current = list.head;
                while (current.next != null){
                    current = current.next;
                }
                current.next = new Node(val);
            }
        }

        public static void AddAtBegin(LinkedList list, int val){
            if (list.head == null){
                list.head = new Node(val);
            }
            else {
                Node curr = new Node(val);
                curr.next = list.head;
                list.head = curr;
            }
        }

        public static void AddAfter(LinkedList list, int after, int val){
            if (list.head == null){
                list.head = new Node(val);
            }

            else {
                Node curr = list.head;
                while (curr.value != after){
                    curr = curr.next;
                }
                Node currNew = new Node(val);
                currNew.next = curr.next;
                curr.next = currNew;

            }

        }
        public static void DeleteAtKey(LinkedList list, int val){
                if (list.head.value == val){
                list.head = list.head.next;
            }
            else {
                Node curr = list.head;

                while(curr.next != null){
                    if (curr.next.value == val){
                        curr.next = curr.next.next;
                    }else {
                        curr = curr.next;
                    }
                }
            }
        }


        public static void InsertMid(LinkedList list, int val){
                 Node fast_pntr = list.head;
              Node slow_pntr = list.head;

              Node prev = list.head;
              while(fast_pntr.next != null && slow_pntr != null){
                  prev = slow_pntr;
                  slow_pntr = slow_pntr.next;
                  fast_pntr = fast_pntr.next.next;
              }
              prev.next = new Node(val);
              prev.next.next = slow_pntr;
        }

        public static void reverse(LinkedList list){
            Node prev = null;
            Node next = null;

            Node curr = list.head;
            while (curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            list.head = prev;
        }




        public static void main(String[] args) {
        LinkedList list = new LinkedList();
        AddAtEnd(list, 1);
        AddAtEnd(list, 2);
        AddAtEnd(list, 3);

        AddAtBegin(list, 0);

        AddAfter(list, 3, 8);

        InsertMid(list, 5);

        DeleteAtKey(list, 3);

        reverse(list);

        PrintList(list);

    } 
}
