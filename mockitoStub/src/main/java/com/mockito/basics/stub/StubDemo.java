package com.mockito.basics.stub;

public class StubDemo {
	RandomJokes randomJokes;
	
	StubDemo(RandomJokes randomJokes){
		this.randomJokes = randomJokes;
	}
	public String retrieveRandomJokes(String content) {
		return randomJokes.getRandomJoke(content);
	}
}
