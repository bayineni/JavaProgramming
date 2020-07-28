package BasicExamples;

import java.sql.Date;

import java.time.Instant;

import java.time.LocalTime;
import java.util.ArrayList;

//public class MainForMovie {

	public static void main(String[] args) {
		Movie movie1 = new Movie(LocalTime.now(), "History", Date.from(Instant.now()), "Bahubali");
		Movie movie2 = new Movie(LocalTime.now(), "Sci-Fi", Date.from(Instant.now()), "Interstellar");
		Movie movie3 = new Movie(LocalTime.now(), "Crime", Date.from(Instant.now()), "Pokiri");
		
		ArrayList<String> movieListing = new ArrayList<>();
		movieListing.add("movie1");
		movieListing.add("movie2");
		movieListing.add("movie3");
		 
		Theatre amc = new Theatre("AMC", 100, movieListing);
		
	}

}
