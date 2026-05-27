import java.util.Scanner;

public class Magazine extends Libraryitem{

    private int issueNumber;
    private String publisher;

    public void setIssueNumber(Scanner input){

        System.out.println("ISSUE NUMBER:");
        issueNumber = input.nextInt();
    }

    public void setPublisher(Scanner input){

        System.out.println("PUBLISHER:");
        publisher =input.next();
    }

    public String getBasic(){
        return ","+issueNumber+","+publisher;
    }

}
