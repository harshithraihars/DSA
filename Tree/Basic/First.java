import java.util.Scanner;

public class First {
    public First() {

    }

    private static class Node {

        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the value of the root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("do you want to insert value at the ;eft of the " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value to be inserted at the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("do you want to insert value at the right of the " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value to be inserted at the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null)
            return;
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        First first=new First();
        first.populate(scanner);
        first.display();
    }
}
