
public class Captcha {
    private int left;
    private int right;
    private int operator;
    static final int STRING_FIRST_PATTERN=1;

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public String getLeft() {
        String[] numberString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};


        return numberString[this.left - 1];
    }

    public String getRight() {
        return String.valueOf(right);
    }

    public String getOperator() {
        String[] operatorString = {"+", "*", "-"};

        return operatorString[this.operator - 1];

    }
}
