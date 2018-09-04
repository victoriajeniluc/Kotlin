import model.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class MovieStoreTest {
    // field declaration
    private final Movie harryPotter = new Movie("Harry Potter", "Rowling", 2000);
    private final Movie starWars = new Movie("Star Wars", "Schwimmer", 1999);
    private final Movie starTrek = new Movie("STAR Trek", "Schwimmer", 2002);
    private final Movie takeThat = new Movie("Take That", "Gary Fowler", 2001);

    private final MovieStore movieStore = new MovieStore();

    @Test
    public void returnsNoResultsWhenNoTitlesPartiallyMatchSearch() throws Exception {
        List<Movie> results = movieStore.findByPartialTitle("abc");
        assertThat(results.size(), is(0));
    }

    @Test
    public void findsMovieWhereTitleArePartiallyMatchedCaseInsensitive() throws Exception {
        List<Movie> results = movieStore.findByPartialTitle("tar");
        assertThat(results.size(), is(2));
        assertThat(results, containsInAnyOrder(starTrek, starWars));
    }

    //set up method
    @Before
    public void setUp() throws Exception {
        movieStore.add(harryPotter);
        movieStore.add(starWars);
        movieStore.add(starTrek);
        movieStore.add(takeThat);

    }

    @Test
    public void findsMovieWhenDirectorExactlyMatches() throws Exception {
        List<Movie> results = movieStore.findByDirector("Schwimmer");
        assertThat(results.size(), is(2));
        assertThat(results, containsInAnyOrder(starTrek, starWars));
    }


    @Test
    public void findsMovieWhenReleaseYearIsBetweenTwoValues() throws Exception {
        List<Movie> results = movieStore.findByReleaseYear(1999, 2002);
        assertThat(results.size(), is(4));
        assertThat(results, containsInAnyOrder(takeThat, harryPotter, starTrek, starWars));
    }

}
