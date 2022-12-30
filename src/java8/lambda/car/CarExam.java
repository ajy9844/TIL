package java8.lambda.car;

import java.util.ArrayList;
import java.util.List;

public class CarExam {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("작은차", 2, 800, 3));
        cars.add(new Car("봉고차", 12, 1500, 8));
        cars.add(new Car("중간차", 5, 2200, 0));
        cars.add(new Car("비싼차", 5, 3500, 1));

        printCar(cars,
                // 익명 클래스를 만들어서 사용한다.
                // 4명 이상이 탈 수 있고 가격이 2500만원 이하인 차를 검색한다.
                new CheckCar() {
                    public boolean test(Car car) {
                        return car.capacity >= 4 && car.price <= 2500;
                    }
                });
    }

    public static void printCar(List<Car> cars, CheckCar tester) {
        for (Car car : cars) {
            if (tester.test(car)) {
                System.out.println(car);
            }
        }
    }
}
