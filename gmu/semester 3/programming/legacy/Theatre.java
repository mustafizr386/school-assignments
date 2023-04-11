import javax.swing.JOptionPane;
public class Theatre {
   public static void main(String[] args) {
      final int NUM_MOVIES = 5;
      Movie[] movies = new Movie[NUM_MOVIES];
   
      int x = 0;
      do {
      
         /** START: BLOCK #1
          * In the block below, enter code that will first check if there is room to enter another movie in the
          * movies array. If there is, call the add the movie to the array using the inputMovie() method.
          * Else, if there is not, display an error message to the user letting them know the maximum nubmer of movies
          * that can be entered.
          * Hint: To check the number of movies already entered, use the getNumMovies() static method
          */
         if(Movie.getNumMovies() < NUM_MOVIES)
         {
            movies[x] = inputMovie();
         }
         else
         {
            System.out.println("the limit of " + NUM_MOVIES + " movies has been hit, no more can be added");
         }
         x++;
        
         /** END: BLOCK #1 **/        
      
      }
      while (JOptionPane.showConfirmDialog(null, "Enter another movie?") == JOptionPane.YES_OPTION);
   
      Movie shortestMovie = getShortest(movies);
      printSummary(movies, shortestMovie);
   }

   private static Movie inputMovie() {
      Movie aMovie = new Movie();
     
      aMovie.setTitle(JOptionPane.showInputDialog(null, "Enter the title for movie " + Movie.getNumMovies() + ": "));
     
      int length;
      boolean isLengthSet = false;
      do {
         try {
            length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of " + aMovie.getTitle() + " in (minutes)"));
         }
         catch (NumberFormatException e) {
            length = -1;
         }
         isLengthSet = aMovie.setLength(length);
         if (!isLengthSet) {
            JOptionPane.showMessageDialog(null, "Sorry, you entered an invalid movie length. Please try again.");
         }
      } while(!isLengthSet);
     
      return aMovie;
   }
  
   private static Movie getShortest(Movie[] movies) {
      Movie aMovie = null;
     
      if (movies.length > 0) {
        
         /** START: BLOCK #2
          * In the block below, enter code that will find the movie object containing the shortest length
          * Hint: You will need to loop through all movies to find the shortest
          */
         aMovie= movies[0];
         for(int x = 1; x <Movie.getNumMovies(); x++)
         {
            if(aMovie.getLength() > movies[x].getLength())
            {
               aMovie=movies[x];
            }
         }
        
        
         /** END: BLOCK #2 **/
      }
     
      return aMovie;
   }
  
   private static void printSummary(Movie[] movies, Movie shortestMovie) {
      String summary="**Movie Summary**\n";
     
      /** START: BLOCK #3
       * First, using the summary variable declared above, loop through all of the movies entered, appending the title of each
       * movie to the summary. Then, append to the summary the number of movies entered, the title of the shortest movie
      * and the length of the shortest movie
       * Hint: To get the number of movies entered, use the getNumMovies() static method
       * Hint: To get the title and length of the shortest movie, use the object reference passed into the method
       */
      for(int x = 0; x <Movie.getNumMovies()-1; x++)
      {
         summary += movies[x].getTitle() +", ";
         
      }
      summary += movies[Movie.getNumMovies()-1].getTitle() + "\nThe shortest movie: " + shortestMovie.getTitle() + " Duration: " + shortestMovie.getLength();
             
      /** END: BLOCK #3 **/
             
      JOptionPane.showMessageDialog(null, summary);
   }
}