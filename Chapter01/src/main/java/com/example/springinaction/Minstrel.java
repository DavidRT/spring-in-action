package com.example.springinaction;

import java.io.PrintStream;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Minstrel {
	
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	@Before("execution(* Knight.embarkOnQuest(..))")
	public void singBeforeQuest(){
		stream.println("Fa la la, the knight is so brave >:D");
	}
	
	@After("execution(* Knight.embarkOnQuest(..))")
	public void singAfterQuest(){
		stream.print("Brave knight did embark on a quest !");
	}

}
