import javax.print.DocFlavor;
import java.util.Scanner;

public  class DVD extends Libraryitem{

    private String director;
    private String durationMinutes;
    private int rating;

    public void setDirector(Scanner input){

        System.out.println("DIRECTOR:");
        director = input.next();
    }

    public void setDurationMinutes(Scanner input){

        System.out.println("DURATION MINUTES:");
        durationMinutes = input.next();
    }

    public void setRating(Scanner input){

        do {
            System.out.println("RATING:");
            rating = input.nextInt();

        }while (rating < 1 );

    }

    public String getBasic(){
        return ","+director+","+durationMinutes+","+rating;
    }

}
