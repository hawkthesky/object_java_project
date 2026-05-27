import java.util.ArrayList;

public class Faculty extends Member{

    private boolean flag ;
    private int count;

    public void canBorrow( ArrayList<String> canBorrow,String target){

        flag = true;

        String temp ;

        for (int i = 0; i < canBorrow.size(); i++) {

            temp = canBorrow.get(i);

            String[] word = temp.split(",");

            if (word[0].equals(target))
                ++count;
        }

        if (count >= 10)
            System.out.println("Borrow faculty item 10 limit");

    }

    public boolean getFlag(){
        return flag;
    }

    public int getCount() {
        return count;
    }
}
