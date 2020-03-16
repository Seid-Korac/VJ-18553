package ba.unsa.etf.rma.vj_18553;

import java.util.List;

public class MoviesModel {
    public static List<Movie> movies;

    public MoviesModel() {
        movies.add( new Movie("Deadpool", "Action/Comedy", "2018", "www.deadpool.com", "deadpool origins") );
        movies.add( new Movie("Deadpool 2", "Action/Comedy", "2019", "www.deadpool2.com", "deadpool with baby legs"));
        movies.add(new Movie("Deadpool x X-men","Action/Comedy", "2022","www.DPxXMen.com", "deadpool revives the X-men movies"));
    }
}
