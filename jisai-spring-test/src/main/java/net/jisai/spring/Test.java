package net.jisai.spring;

import net.jisai.spring.compont.TestA;
import net.jisai.spring.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jisai
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
		TestA bean = applicationContext.getBean(TestA.class);
		bean.test();
		System.out.println(bean);
	}
}
