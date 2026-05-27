import java.util.ArrayList;

public class Show {


    private boolean flag;
    private ArrayList<String> user_borrow = new ArrayList<>();

    public void display(String target,ArrayList<String> information){

        String temp ;

        flag = false;

        for (int i = 0; i < information.size(); i++) {

            temp = information.get(i);

            String[] word = temp.split(",");

            if (word[0].equals(target)){
                flag = true;

                user_borrow.add(word[1]+" "+word[2]);

            }

        }

    }

    public boolean isFlag() {
        return flag;
    }

    public ArrayList<String> getUser_borrow() {
        return user_borrow;
    }

}
