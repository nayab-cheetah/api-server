/**
 * 
 */
package com.apiserver.logger;

 
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/**
 * @author nayab.ali
 *
 */
@Component
@Aspect
public class LoggerAspect {
	private static Logger logger=LoggerFactory.getLogger(LoggerAspect.class);
	@Around("getAllPointcuts()")
	public Object methodAroundLog(ProceedingJoinPoint  p) throws Throwable{
		logger.info("Before method execution of class::"+p.getSignature().getDeclaringTypeName()+"::"+p.getSignature().getName()+"()");
		Object o= p.proceed();
		logger.info("After method execution of class::"+p.getSignature().getDeclaringTypeName()+"::"+p.getSignature().getName()+"()");
		return o; 
	}
	@Pointcut("within(com.service.Impl.*) || within(com.controller.*)")
	public void getAllPointcuts(){
		
	}


}
