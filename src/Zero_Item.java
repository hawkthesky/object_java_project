public class Zero_Item {

    final int num = 50;
    private String[] name;
    private int[] number;

    public Zero_Item(String[] name,int[] number ){

        this.name = name;
        this.number = number;
    }

   public String[] getName(){


        String[] arr_name = new String[num];
        int sum = 0;

       for (int i = 0; i < num; i++) {
           if (number[i] == 0){
               if (name[i] != null){
                   arr_name[sum] = name[i];
                   sum++;
               }
           }
       }
       return arr_name;
   }
}
