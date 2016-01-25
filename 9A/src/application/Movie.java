/*
Movies have title, genre, duration (in minutes), rate and a list (java.util.List) 
of actresses/actors (called cast) who are persons. Persons have firstname, lastname, gender
and two flags (boolean type property) if the current person has already won the Oscar and if the 
current person has already won the Golden Globe
*/
package application;

import java.util.ArrayList;

public class Movie {
	private String title;
	private Genre genre;
	private long duration;
	private double rate;
	private ArrayList<Person> cast;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public ArrayList<Person> getCast() {
		return cast;
	}

	public void setCast(ArrayList<Person> cast) {
		this.cast = cast;
	}

	public String toString() {
		return title + " " + genre + " " + duration + " " + rate + " " + cast;
	}

	public String toXMLString(String... persons) {
		StringBuilder sb = new StringBuilder();
		sb.append("<movie>");
		sb.append(Tools.toXMLTag("title", getTitle()));
		sb.append(Tools.toXMLTag("genre", String.valueOf(getGenre())));
		sb.append(Tools.toXMLTag("duration", String.valueOf(getDuration())));
		sb.append(Tools.toXMLTag("rate", String.valueOf(getRate())));
		// sb.append(Tools.toXMLTag("cast", String.valueOf(getCast())));
		sb.append("<cast>");
		for (int i = 0; i < persons.length; i++) {
			sb.append(persons[i]);
		}
		sb.append("</cast>");
		sb.append("</movie>");
		return sb.toString();
	}

}
