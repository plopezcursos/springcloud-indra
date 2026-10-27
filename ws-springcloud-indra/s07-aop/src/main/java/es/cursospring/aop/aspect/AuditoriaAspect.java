package es.cursospring.aop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuditoriaAspect {

	@Pointcut("execution(* es.cursospring.aop.service.PedidoService.*(..))")
	public void todosPointCut() {}
	
	@Before("execution(* es.cursospring.aop.service.PedidoService.crearPedido(..))")
	public void antesDeEjecutar() {
		System.err.println("Interceptor Before");
		System.err.println("------------------");
	}
	
	@Before("todosPointCut()")
	public void antesConJoinPoint(JoinPoint jp) {
		System.err.println("Before con JP");
		System.err.println(jp.getSignature().getName());
		System.err.println(Arrays.asList(jp.getArgs()));
		System.err.println("------------------");
	}
	
	@AfterReturning(pointcut = "todosPointCut()", returning = "resp")
	public void despuesExito(JoinPoint jp, Object resp) {
		System.err.println("AfterReturning");
		System.err.println(jp.getSignature().getName());
		System.err.println("Retorno: " + resp);
		System.err.println("------------------");
	}
	
	@Around("@annotation(es.cursospring.aop.aspect.Auditar)")
	public Object poderoso(ProceedingJoinPoint pjp) throws Throwable {
		Object resu = null;
		long t0 = System.currentTimeMillis();
		
		resu = pjp.proceed(pjp.getArgs());
		
		long tf = System.currentTimeMillis();
		System.err.println("Around");
		System.err.println(pjp.getSignature().getName() + " demoro: " + (tf-t0));
		
		return resu;
	}
}
