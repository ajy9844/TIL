package java8.lambda;

public class LambdaExam {

    public static void main(String[] args) {
        // 자바는 매소드만 매개변수로 전달할 방법이 없고, 인스턴스만 전달할 수 있다.
        // 그렇기 때문에 run() 메소드를 가지고 있는 Runnable 객체를 만들어서 전달한다.

        // () -> {...} 부분이 람다식, 다른 말로 익명 메소드이다.
        // JVM은 Thread 생성자가 Runnable 인터페이스의 구현체를 받아야 하는 것을 알고,
        // 람다식을 Runnable 구현체로 만들어서 매개변수로 넣어준다.
        new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
        }).start();
    }
}
