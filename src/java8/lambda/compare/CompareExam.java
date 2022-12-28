package java8.lambda.compare;

public class CompareExam {

    public static void exec(Compare compare) {
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println("value = " + value);
    }

    public static void main(String[] args) {
        exec((i, j) -> i - j);
    }
}
