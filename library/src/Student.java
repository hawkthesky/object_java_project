import java.util.Scanner;
import java.util.ArrayList;

public class Student extends Member {

    private boolean flag ;
    private int count;

    public void canBorrow(ArrayList<String> canBorrow,String target){

        flag = true;

        String temp ;

        for (int i = 0; i < canBorrow.size(); i++) {

            temp = canBorrow.get(i);

            String[] word = temp.split(",");

            if (word[0].equals(target))
                ++count;
        }

        if (count >= 3)
            System.out.println("borrow student 10 item limit");

    }

    public boolean getFlag(){
        return flag;
    }

    public int getCount() {
        return count;
    }
}
