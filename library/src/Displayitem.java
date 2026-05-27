import java.util.ArrayList;

public class Displayitem {


    private ArrayList<String> item;
    private boolean flag;

    public Displayitem(ArrayList<String> item){

        this.item = item;
    }

    public void isFlag(){

        if (item.size() == 0){
            flag = false;
        }else
            flag = true;

    }

    public void item(){

        String temp;

        for (int i = 0; i < item.size(); i++) {

            temp = item.get(i);

            String[] word = temp.split(",");

            System.out.println("           <<"+(i+1)+">>");
            System.out.println("ITEM:"+word[0]);
            System.out.println("TITIE:"+word[1]);
            System.out.println("AVAILABLE:"+word[2]);
            System.out.println("DUO DATE:"+word[3]);

            System.out.println("**********************");
        }
    }

    public boolean getFlag(){
        return flag;
    }
}
