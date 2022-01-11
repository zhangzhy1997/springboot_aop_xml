package com.example.zzy.aop;

import java.util.Arrays;
import java.util.logging.Logger;


import org.aspectj.lang.JoinPoint;

//日志处理类 增强处理类-日志
public class UserServiceLogger {
    private Logger logger = Logger.getLogger(String.valueOf(UserServiceLogger.class));

    // 前置增强
    public void before(JoinPoint joinPoint) {
        logger.info("调用" + joinPoint.getTarget() + "的"
                + joinPoint.getSignature() + "方法，方法参数是："
                + Arrays.toString(joinPoint.getArgs()));
    }

    // 后置增强
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("调用" + joinPoint.getTarget() + "的"
                + joinPoint.getSignature() + "方法，方法的返回值是："
                + result);
    }
}