package jbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.annotations.Customer;

public class AccountMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new
				AnnotationConfigApplicationContext(BeanConfiguration.class);
		Account acnt = ctx.getBean("getAccount", Account.class);
		System.out.println(acnt.getAcno()+ " "+acnt.getCustName()+" "+acnt.getBalance());
	
	}

}
