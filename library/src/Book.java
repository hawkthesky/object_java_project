import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Book extends Libraryitem{

    private String author;
    private String isbn;
    private String genre;

    public void setAuthor(Scanner input) {

        System.out.println("AUTHOR:");
        author = input.next();

    }
    public void setIsbn(Scanner input,ArrayList<String> check){

         String  part_1 = "978";

         Random random = new Random();


         int flag ;

         do {

             flag = 0;

             int part1 = random.nextInt(10000,99999) + 1;
             int prat2 = random.nextInt(10000,99999) + 1;

             String code_part1 = part1 + "";
             String code_part2 = prat2 + "";

             isbn = code_part1 + code_part2;

             if (isbn.length() != 10){
                 System.out.println("Error");
             }else {

                 if (check.contains(isbn)){
                     flag = 1;
                 }
                 else{
                     check.add(isbn);
                 }

             }


         }while (isbn.length() != 10 || flag == 1);

         isbn = part_1+isbn;

        System.out.println(check);
    }

    public void setGenre(Scanner input){

        int mune;

        do {

            System.out.println("GENRE:");
            System.out.println("1) fun");
            System.out.println("2) scary");
            System.out.println("3) adventure");
            System.out.println("4) fantasy");
            System.out.println("5) action");
            System.out.println("6) child");
            System.out.println("7) religious");
            System.out.println("8) historical");
            mune = input.nextInt();

            if (mune == 1)
                genre = "fun";

            else if (mune ==2) {
                genre = "scary";
            }
            else if (mune == 3) {
                genre = "adventure";
            }
            else if (mune == 4) {
                genre = "fantasy";
            }
            else if (mune == 5) {
                genre = "action";
            }
            else if (mune == 6) {
                genre = "child";
            }
            else if (mune == 7) {
                genre = "religious";
            }
            else if (mune == 8) {
                genre = "historical";
            }
            else
                System.out.println("Error choice");

        }while (mune > 8 || mune < 1);

    }

    public String getBasic() {
        return ","+author+","+genre+","+isbn;
    }

}
