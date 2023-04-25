public class Main {
    public static void main(String[] args) {
        final String EQUATION = "2 + 4 * 5";
        String[] tokens = EQUATION.split(" ");
        Node _2Node = new Node("NumberLiteral", 2, null, null);
        Node _4Node = new Node("NumberLiteral", 4, null, null);
        Node _5Node = new Node("NumberLiteral", 5, null, null);
        Node _multiplicationNode = new Node("*", null, _4Node, _5Node);
        Node sumNode = new Node("+", null, _2Node, _multiplicationNode);
        System.out.println(sumNode.evaluate());
    }
}