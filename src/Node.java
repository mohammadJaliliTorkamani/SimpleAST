public class Node {
    private String operator;
    private Integer value;
    private Node left;
    private Node right;

    public Node(String operator, Integer value, Node left, Node right) {
        this.operator = operator;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public float evaluate() {
        if (this.value != null)
            return this.value;

        switch (this.operator){
            case "+": return this.left.evaluate() + this.right.evaluate();
            case "-": return this.left.evaluate() - this.right.evaluate();
            case "*": return this.left.evaluate() * this.right.evaluate();
            case "/": return this.left.evaluate() / this.right.evaluate(); //ignoring / 0  for now.
        }

        return 0;
    }
}
