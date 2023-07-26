package Chapter3;

public class OperatorsAndExpressions {
    void complicatedExpression(int x, int y) {
        boolean b;
        b = x > 50 && y > 60 ||
                x > 50 && y < -60 ||
                x < -50 && y > 60 ||
                x < -50 && y < -60;
        System.out.println(b);
    }

    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        OperAndExp.complicatedExpression(10,80);
    }
}
