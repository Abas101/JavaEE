package saba.kikvidze.davaleba5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import saba.kikvidze.davaleba5.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplyTest() {
        int expected = 20;
        int actual;

        actual = calculatorService.multiply(10, 2);
        assertEquals(expected, actual);
    }

}
