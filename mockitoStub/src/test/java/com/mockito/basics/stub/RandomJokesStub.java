package com.mockito.basics.stub;

public class RandomJokesStub implements RandomJokes{
	
	@Override
	public String getRandomJoke(String content) {
		if(content == "Sardar")
			return "Sardar .. Hehehehe";
		if(content == "Family")
			return "Family .. Hahahaha";
		return null;
	}
}
