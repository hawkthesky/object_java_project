public class One_Print {

    private final int num = 50;
    private String[] code_item ;
    private String[] name ;
    private int[] number ;
    private  double[] money;

    public One_Print(String[] name,int[] number,double[] money,String[]code_item){

        this.name = name;
        this.money = money;
        this.number = number;
        this.code_item = code_item;

    }

    public String getName(String code){

        for (int i = 0; i < num; i++) {
            if (code.equals(code_item[i])){
                return name[i];
            }
        }
        return null;
    }

    public String getCode(String code){
        for (int i = 0; i < num; i++) {
            if(code.equals(code_item[i]))
                return code_item[i];
        }
        return null;
    }

    public int getNumber(String code){
        for (int i = 0; i < num; i++) {
            if (code.equals(code_item[i])){
                return number[i];
            }
        }
        return -1;
    }

    public double getMoney(String code) {
        for (int i = 0; i < num; i++) {
            if (code.equals(code_item[i])){
                return money[i];
            }
        }
        return 0;
    }
}
