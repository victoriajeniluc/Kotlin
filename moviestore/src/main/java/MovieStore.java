import model.Movie;

import java.util.LinkedList;
import java.util.List;

public class MovieStore {
    List<Movie> movies = new LinkedList<Movie>();

    public void add(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> findByPartialTitle(final String partialTitle) {
        return findBy(new Predicate() {
            public boolean matches(Movie movie) {
                return movie.title().toUpperCase().contains(partialTitle.toUpperCase());
            }
        });
    }

    public List<Movie> findByDirector(final String director) {
        return findBy(new Predicate() {
            public boolean matches(Movie movie) {
                return movie.director().equals(director);
            }
        });

    }

    public List<Movie> findByReleaseYear(final int from, final int to) {
        return findBy(new Predicate() {
            public boolean matches(Movie movie) {
                return movie.year() >= from && movie.year() <= to;
            }
        });

    }

    private List<Movie> findBy(Predicate predicate) {
        List<Movie> result = new LinkedList<Movie>();
        for (Movie movie : movies) {
            if(predicate.matches(movie)){
                result.add(movie);
            }
        }
        return result;
    }

    interface Predicate{
        boolean matches(Movie movie);
    }
}
