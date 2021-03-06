package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ContructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorInjectedControllerTest {
    ContructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new ContructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.printf(controller.getGreeting());
    }
}