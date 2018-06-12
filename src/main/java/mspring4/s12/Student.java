package mspring4.s12;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person {
    @Override
    public void say() {
        System.out.println("I'm a student!");

    }
}
