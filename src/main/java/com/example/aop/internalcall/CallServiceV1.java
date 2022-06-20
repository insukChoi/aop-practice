//package com.example.aop.internalcall;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * Spring 2.6 부터 순환참조가 금지됨
// */
//@Slf4j
//@Component
//public class CallServiceV1 {
//
//    private CallServiceV1 callServiceV1;
//
//    @Autowired
//    public void setCallServiceV1(CallServiceV1 callServiceV1) {
//        this.callServiceV1 = callServiceV1;
//    }
//
//    public void external() {
//        log.info("call external");
//        callServiceV1.internal(); // 외부 메서드 호출 (this.internal())
//    }
//
//    public void internal() {
//        log.info("call internal");
//    }
//}
