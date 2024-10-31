package com.ks.ksfinal.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerServiceAspect {
	
	private static final Logger LOGGER = LogManager.getLogger(LoggerServiceAspect.class);
	
	@Pointcut("@annotation(com.ks.ksfinal.annotation.Loggable)")
	public void loggableMethods() {}
	
	@Before("loggableMethods()")  
	public void beforeAdvice(JoinPoint joinPoint) {  
		LOGGER.info(joinPoint.getSignature().getDeclaringType().getSimpleName() + "." +
					joinPoint.getSignature().getName() + "()" + " :: Entry ->");
	}
	
	@After("loggableMethods()")  
	public void afterAdvice(JoinPoint joinPoint) {  
		LOGGER.info(joinPoint.getSignature().getDeclaringType().getSimpleName() + "." +
					joinPoint.getSignature().getName() + "()" + " :: Exit ->");
	}
}
