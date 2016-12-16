package com.example.springinaction;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.example.springinaction.config.TestKnightConfig;
import com.example.springinaction.fake.FakePrintStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestKnightConfig.class, loader = AnnotationConfigContextLoader.class)
public class KnightJavaConfigInjectionTest {

	@Autowired
	Knight knight;

	@Autowired
	FakePrintStream stream;
	
	@Autowired
	Quest quest;

	@After
	public void clearPrintStream() {
		stream.close();
	}

	@Test
	public void shouldInjectKnightWithSlayDragonQuest() {
		assertThat(knight, instanceOf(BraveKnight.class));
		assertThat(quest, instanceOf(SlayDragonQuest.class));
		knight.embarkOnQuest();
		assertEquals("Embarking in quest to slay the dragon :D\n",stream.getPrintedString());
	}
}
