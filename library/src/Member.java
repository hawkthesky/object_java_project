import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public abstract class Member {

    private String id;
    private String email;
    private String name;
    private String code_user;
    private int check ;
    private  boolean update;

    public void setId(Scanner input,ArrayList<String> borrowed){

        ArrayList <String> ids = new ArrayList<>();
        Random random = new Random();

        int flag;
        do {

            flag = 0;

            int code_System = random.nextInt(100000,999999)+1;
            id = code_System + "";

            int len = id.length();

            if (len != 6)
                flag = 1;

            if (borrowed.isEmpty()){
                break;
            }
            else {

                String temp = null;

                for (int i = 0; i < borrowed.size(); i++) {

                    temp = borrowed.get(i);

                    String [] word = temp.split("\\,");


                    ids.add(word[2]);

                }
            }

            if (ids.contains(id)){
                flag = 1;
                System.out.println("same old");
            }

        }while (flag == 1);

        System.out.println("password :"+id);

    }

    public void setEmail(Scanner input){

        System.out.println("ENTER EMAIL:");
        System.out.println("NO NEED @gmail.com");
        email = input.next();

        email+= "@gmail.com";
    }

    public void setName(Scanner input){

        System.out.println("NAME:");
        name = input.next();
    }

    public String getInfo(){

        return ","+name+","+id+','+email;
    }

    public String getId(){
        return id;
    }

    public void setCode_user(Scanner input){

        System.out.print("ENTER ID:");
        code_user = input.next();
    }

    public String getCode_user(){
        return code_user;
    }

    public void check(ArrayList<String> borrowed,String target){

        String temp2 = null;
        check = 1;

        if (borrowed.isEmpty()){
            return;
        }


        for (int i = 0; i < borrowed.size(); i++) {

            temp2 = borrowed.get(i);

            String[] word = temp2.split(",");

            if (word[2].equals(target)){

                check = 0;
                System.out.println("FOUND INFORMATION STUDENT");
                break;
            }

        }

        if (check == 1){
            System.out.println("NOT FOUND INFORMATION STUDENT ");
        }
    }

    public int getCheck() {
        return check;
    }

    public abstract void canBorrow(ArrayList<String> conBorrow,String target);

    public void show(ArrayList<String> item,ArrayList<Integer> code_item){

        String target;

        for (int i = 0; i < item.size(); i++) {

            target = item.get(i);

            String[] word =target.split(",");

            System.out.println((i+1)+") "+word[0]+" "+word[1]+" "+code_item.get(i));
        }
        System.out.println("CHOICE CODE:");
    }

    public void update(ArrayList<String> item,int index,ArrayList<Integer> random){

        update = false;
        String target = item.get(index);

        String[] word = target.split(",");

        if ("true".equals(word[2])){

            if (word.length == 7){
                item.set(index,word[0]+","+word[1]+",false,"+word[3]+","+word[4]+","+word[5]+","+word[6]);

                System.out.println("debt service operation carried out");
                update = true;
            }
            else if (word.length == 6) {
                item.set(index,word[0]+","+word[1]+",false,"+word[3]+","+word[4]+","+word[5]);

                System.out.println("debt service operation carried out");
                update = true;
            }
        }
        else
            System.out.println("BOOK NOT AVAILABLE");
    }

    public boolean getUpdate(){
        return update;
    }

    public abstract boolean getFlag();


    public void returnItem(Scanner input,ArrayList<String> dayBorrowed,int index){

        int day_borrow;

        System.out.println("number day borrowed ?");
        day_borrow = input.nextInt();

        String[] word = dayBorrowed.get(index).split(",");

        int day = Integer.valueOf(word[3]);

        int result = day - day_borrow;

        if (result < 0){
            System.out.println("warning day");

        }

    }
    public abstract int getCount();
}








