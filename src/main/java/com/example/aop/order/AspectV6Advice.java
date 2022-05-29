package com.example.aop.order;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
public class AspectV6Advice {

//    @Around("com.example.aop.order.aop.PointCuts.orderAndService()")
//    public Object doTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
//        try {
//            // @Before
//            log.info("[트랜젝션 시작] {}", joinPoint.getSignature());
//            Object result = joinPoint.proceed();
//            // @AfterReturning
//            log.info("[트랜젝션 커밋] {}", joinPoint.getSignature());
//            return result;
//        } catch (Exception e) {
//            // @AfterThrowing
//            log.info("[트랜젝션 롤백] {}", joinPoint.getSignature());
//            throw e;
//        } finally {
//            // @After
//            log.info("[리소스 릴리즈] {}", joinPoint.getSignature());
//        }
//    }

    @Before("com.example.aop.order.PointCuts.orderAndService()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("[before] {}", joinPoint.getSignature());
    }

    @AfterReturning(value = "com.example.aop.order.PointCuts.orderAndService()", returning = "result")
    public void doReturn(JoinPoint joinPoint, Object result) {
        log.info("[return] {} result={}", joinPoint.getSignature(), result);
    }

    @AfterThrowing(value = "com.example.aop.order.PointCuts.orderAndService()", throwing = "ex")
    public void doThrowing(JoinPoint joinPoint, Exception ex) {
        log.info("[ex] {} message={}", joinPoint.getSignature(), ex);
    }

    @After(value = "com.example.aop.order.PointCuts.orderAndService()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("[after] {}", joinPoint.getSignature());
    }
}
