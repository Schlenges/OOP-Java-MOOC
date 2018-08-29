package reference;

import reference.domain.*;

public class Main {

    public static void main(String[] args) {
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");

        RatingRegister reg = new RatingRegister();
        reg.addRating(eraserhead, Rating.BAD);
        reg.addRating(eraserhead, Rating.BAD);
        reg.addRating(eraserhead, Rating.GOOD);

        reg.addRating(theBridgesOfMadisonCounty, Rating.GOOD);
        reg.addRating(theBridgesOfMadisonCounty, Rating.FINE);

        System.out.println("All ratings: " + reg.filmRatings());
        System.out.println("Ratings for Eraserhead: " + reg.getRatings(eraserhead));

    }
}
