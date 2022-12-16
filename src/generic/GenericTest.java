package generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericTest {

    @Test
    void runtimeExceptionTest() {
        Person person = new Person("파트너");
        Assertions.assertThrows(ClassCastException.class, () -> {
            Employee employee = (Employee) person.info;
        });
    }

    static class Employee {
        private int rank;
        public Employee(int rank) {
            this.rank = rank;
        }
    }

    static class Person {
        private Object info;
        public Person(Object info) {
            this.info = info;
        }
    }
}
