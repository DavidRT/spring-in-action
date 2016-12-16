package com.example.springinaction;

import static org.mockito.Mockito.*;

import org.junit.Test;
public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mock = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mock);
		knight.embarkOnQuest();
		verify(mock, times(1)).embark();
	}

}
