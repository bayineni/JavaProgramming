package BasicExamples;

import java.sql.Date;
import java.time.LocalTime;

public class Movie {

	LocalTime movietime;
	String moviegenre;
	java.util.Date moviedate;
	String movieName;

	public Movie(LocalTime movietime, String moviegenre,java.util.Date date, String movieName) {
		this.movietime = movietime;
		this.moviegenre = moviegenre;
		this.moviedate = date;
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public LocalTime getMovietime() {
		return movietime;
	}

	public void setMovietime(LocalTime movietime) {
		this.movietime = movietime;
	}

	public String getMoviegenre() {
		return moviegenre;
	}

	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}

	public java.util.Date getMoviedate() {
		return moviedate;
	}

	public void setMoviedate(Date moviedate) {
		this.moviedate = moviedate;
	}

}
