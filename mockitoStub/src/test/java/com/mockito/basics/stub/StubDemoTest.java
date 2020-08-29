package com.mockito.basics.stub;

import static org.junit.Assert.*;

import org.junit.Test;

public class StubDemoTest {

	@Test
	public void when_contentGiven_RandomJokeShouldReturn_retrieveRandomJokes() {
		RandomJokes randomJokes = new RandomJokesStub();
		String str = randomJokes.getRandomJoke("Family");
		assertNotNull("Content should be either Sardar or Family",str);
	}

}
