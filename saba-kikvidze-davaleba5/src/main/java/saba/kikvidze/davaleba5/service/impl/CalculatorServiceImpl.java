package saba.kikvidze.davaleba5.service.impl;

import org.springframework.stereotype.Service;
import saba.kikvidze.davaleba5.aspect.Print;
import saba.kikvidze.davaleba5.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Print
    @Override
    public int multiply(int x, int y) {
        return x*y;
    }
}
