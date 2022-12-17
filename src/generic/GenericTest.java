package generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericTest {

    @Test
    void compileTimeExceptionTest() {
        Person<Employee> person = new Person<>(new Employee(10));
        Employee employee = person.info;
        Assertions.assertEquals(10, employee.rank);

        // 컴파일 오류 발생
        // java: incompatible types: java.lang.String cannot be converted to int
//        Person<Employee> person2 = new Person(new Employee("파트너"));
    }

    static class Employee {
        private int rank;
        public Employee(int rank) {
            this.rank = rank;
        }
    }

    static class Person<T> {
        private T info;
        public Person(T info) {
            this.info = info;
        }
    }
}
