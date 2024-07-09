import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Task {

    public static byte[] ordenaArrayInteiros(byte[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    byte pivot = nums[i];
                    nums[i] = nums[j];
                    nums[j] = pivot;
                }
            }
        }
        return nums;
    }

    static void countChars(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Entry<Character, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + "=" + item.getValue());
        }
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }


    public static void main(String[] args) {
        // Q1
        System.out.println(" Q1: ");
        String str = "byte array size example";
        byte values[] = str.getBytes();
        for (int i = 0; i < values.length; i++)
            System.out.print(values[i] + " ");
        System.out.println("\nAfter ordering: ");
        values = ordenaArrayInteiros(values);
        for (int i = 0; i < values.length; i++)
            System.out.print(values[i] + " ");



        // Q2
        System.out.println("\n\n Q2: ");
        countChars("acdBCDabc"); // {a=2, B=1, b=1, c=2, C=1, d=1, D=1}


        // Q3
        System.out.println("\n\n Q3: ");
        ListaLigada list = new ListaLigada();
        list.head = new ListaLigada.Node(50);
        list.head.next = new ListaLigada.Node(20);
        list.head.next.next = new ListaLigada.Node(15);
        list.head.next.next.next = new ListaLigada.Node(4);
        list.head.next.next.next.next = new ListaLigada.Node(10);

        // Creating a loop for testing
        list.head.next.next.next.next.next = list.head.next.next;
        list.encontraRemove(list.head);
        System.out.println("Linked List after removing loop : ");
        list.printList(list.head);


        // Q4
        System.out.println("\n\n Q4: ");
        String o, r = "";
        Scanner in = new Scanner(System.in);
        int l;
        System.out.print("Palavra a verificar > ");
        o = in.nextLine();
        l = o.length();
        for (int i = l - 1; i > 0; i--) {
            r = o.charAt(i) + r;
        }
        System.out.println();
        System.out.println(isPalindrome(o));
        System.out.println();


        // Q5
        System.out.println("\n\n Q5: ");
        System.out.println(
                "Em uma arquitetura distribuida as principais vantagens sao as independencias entre microservices, "
                        + "podendo cada um ter uma tecnologia especifica independente e podendo escalar cada um de acordo com a necessidade. ");
    }
}



// Deteção e Remoção de Ciclos numa Lista Ligada
class ListaLigada {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // método de deteção e remoção
    boolean encontraRemove(Node node) {
        if (node.next != null) {
            node.next = null;
            return true;
        }
        return false;
    }


    // Function to print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}
