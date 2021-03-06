package com.example.aop.order;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {

    // com.example.aop.order 패키지와 그 하위패키지
    @Pointcut("execution(* com.example.aop.order..*(..))")
    public void allOrder() {} // pointcut signature

    // 클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {}

    // allOrder && allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {}
}
