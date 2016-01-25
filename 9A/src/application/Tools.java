package application;
import java.util.*;

public class Tools {

	public static String toXMLTag(String tagName, String value) {
		return "<" + tagName + ">" + value + "</" + tagName + ">";
	}
	
	public static List<Movie> getMovieTitles() {
		return null;
		
	}
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies)
	{
	    HashMap<Person, Integer> countMap = new HashMap<Person, Integer>();
	    for (Movie movie : movies)
	    {
	        for (Person person : movie.getCast())
	        {
	            if (!countMap.containsKey(person))
	            {
	                countMap.put(person, new Integer(0));
	            }
	            countMap.put(person, countMap.get(person) + 1);
	        }
	    }
	    return countMap;
	}
}
