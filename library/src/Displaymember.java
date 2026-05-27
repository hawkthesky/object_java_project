import java.util.ArrayList;

public class Displaymember{

    public void show_member(ArrayList<String> member){

        String temp;

        for (int i = 0; i < member.size(); i++) {

            temp =member.get(i);

            String[] word = temp.split(",");

            System.out.println("           < "+(i+1)+" >");
            System.out.println("TYPE:"+ word[0]);
            System.out.println("NAME:"+word[1]);
            System.out.println("ID:"+word[2]);
            System.out.println("EMAIL:"+word[3]);
            System.out.println("*********************");
        }
    }
}
