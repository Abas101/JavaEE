package saba.kikvidze.davaleba5.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(saba.kikvidze.davaleba5.aspect.Print)")
    public void printAnnotation(JoinPoint joinPoint) {
        System.out.println("args:" + Arrays.toString(joinPoint.getArgs()));
    }
}
