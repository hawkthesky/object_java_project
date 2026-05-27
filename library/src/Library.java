import java.util.Scanner;
import java.util.ArrayList;

public class Library {

    private Libraryitem libraryitem;
    private Member member;
    private String choice;
    private boolean flag;

    public Library(){

        this.libraryitem = new DVD();
        this.member = new Student();
    }

    public void mune_member(Scanner input){

        int mune;
        boolean flag;


        do {

            flag = false;

            System.out.println("[1] Student");
            System.out.println("[2] faculty");
            System.out.print("choice:");
            mune = input.nextInt();

            if (mune == 1){

                System.out.println("can borrow up to 3 items for 14 days ");
                choice = "Student";

            }
            else if ( mune == 2) {

                System.out.println(" can borrow up to 10 items for 30 days ");
                choice = "Faculty";
            }
            else{
                System.out.println("ERROR CHOICE MUNE.");
                flag = true;
            }

        }while(flag);

    }

    public String getChoice(){

        return choice;
    }


    public void check(String target,ArrayList<String> member){

        flag = false;
        for (int i = 0; i < member.size(); i++) {

            String[] word = member.get(i).split(",");

            if (word[2].equals(target)){

                flag = true;
                System.out.println("ID FOUND");
                break;
            }

        }

    }

    public boolean isFlag() {
        return flag;
    }
}
