package com.example.springinaction.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springinaction.BraveKnight;
import com.example.springinaction.Knight;
import com.example.springinaction.Quest;
import com.example.springinaction.SlayDragonQuest;
import com.example.springinaction.fake.FakePrintStream;

@Configuration
public class TestKnightConfig {

	@Bean
	public Knight kight() {
		return new BraveKnight(quest());
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(stream());
	}
	
	@Bean
	public PrintStream stream(){
		return new FakePrintStream();
	}
}
