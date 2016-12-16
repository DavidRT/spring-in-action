package com.example.springinaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight k = ct.getBean(Knight.class);
		k.embarkOnQuest();
		ct.close();
		 
	}

}
