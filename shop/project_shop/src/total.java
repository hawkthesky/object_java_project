public class total {

    final int num = 50;
    private String[] name;
    private String[] code_item;
    private double[] money;
    private int[] number;

    public total(String[] name,String[] code_item,int [] number,double[] money){

        this.name = name;
        this.code_item = code_item;
        this.number = number;
        this.money = money;
    }

    public String[] getName(){
        return name;
    }

    public String[] getCode_item(){
        return code_item;
    }

    public int[] getNumber(){
        return number;
    }

    public double[] getMoney(){
        return money;
    }
}
