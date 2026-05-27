import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class Libraryitem implements Searchable{

    private int id;
    private String title;
    private boolean isAvailable;
    private int due_date;
    private String library;

    private ArrayList<String> Show_search = new ArrayList<>();


    public void setLibrary(Scanner input){

        int mune;

        do {

            System.out.println("1) Book ");
            System.out.println("2) DVD");
            System.out.println("3) Magazine");
            System.out.print("CHOICE :");
            mune = input.nextInt();

            if (mune == 1){
                library = "book";
            }
            else if (mune == 2) {

                library = "dvd";
            }
            else if (mune == 3) {
                library = "magazine";
            }
            else {
                System.out.println("ERROR CHOICE.");
            }

        }while ( mune > 3 || mune < 1);

    }

    public void setId(ArrayList<Integer> r) {

        Random random = new Random();

        boolean x;

        do{

            id = random.nextInt(1000,9999) + 1;

            if (r.contains(id)){
                x = true;
            }else {
                r.add(id);
                x = false;
            }

        }while (x);
    }

    public void setTitle(Scanner input){

        System.out.println("enter title :");
        title = input.next();
    }

    public void setAvailable(Scanner input) {

        int choice;

        do {
            System.out.println("as available :");
            System.out.println("[1] true");
            System.out.println("[2] false" );
            System.out.print("choice :");
            choice = input.nextInt();

            if (choice == 1){
                isAvailable = true;

            } else if (choice == 2) {
                isAvailable = false ;

            }else
                System.out.println("Error");

        }while (choice > 2 || choice < 1 );

    }

    public void  setDue_date(Scanner input){

        System.out.println("due data :");
        due_date = input.nextInt();
    }

    public String getInfo(){
        return library+","+title+","+isAvailable+","+due_date;
    }

    public abstract String getBasic();

    public void setAuthor(Scanner input){}

    public void setIsbn(Scanner input,ArrayList<String> check){}

    public void setGenre(Scanner input){}

    public void setIssueNumber(Scanner input){}

    public void setPublisher(Scanner input){}

    public void setDirector(Scanner input){}

    public void setDurationMinutes(Scanner input){}

    public void setRating(Scanner input){}

    public String getLibrary(){
        return library;
    }


    public boolean matches(String keyword,ArrayList<String> item){

        String temp;
        boolean flag = false;



        for (int i = 0; i < item.size(); i++) {

            temp = item.get(i);

            String[] word = temp.split(",");

            for (int j = 0; j < word.length; j++) {

                if (keyword.equals(word[j])){

                    Show_search.add(temp);
                    flag = true;
                }
            }


        }

        return flag;
    }

    public ArrayList<String> getinfo(){

        return Show_search;
    }


}








