package BasicExamples;

import java.util.ArrayList;

public class Theatre {
	String theatreName;
	int totalNumberOfSeats;
	ArrayList<String> movieListing;

	public Theatre(String theatreName, int totalNumberOfSeats, ArrayList<String> movieListing) {
		this.theatreName = theatreName;
		this.totalNumberOfSeats = totalNumberOfSeats;
		this.movieListing = movieListing;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public int getTotalNumberOfSeats() {
		return totalNumberOfSeats;
	}

	public void setTotalNumberOfSeats(int totalNumberOfSeats) {
		this.totalNumberOfSeats = totalNumberOfSeats;
	}

	public ArrayList<String> getMovieListing() {
		return movieListing;
	}

	public void setMovieListing(ArrayList<String> movieListing) {
		this.movieListing = movieListing;
	}

}
