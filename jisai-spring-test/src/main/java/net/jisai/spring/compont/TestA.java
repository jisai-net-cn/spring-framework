package net.jisai.spring.compont;

import org.springframework.stereotype.Component;

/**
 * @author jisai
 */
@Component
public class TestA {

	public TestA() {
		System.out.println("TestA init.......");
	}

	public void test() {
		System.out.println("测试bean");
	}

}
