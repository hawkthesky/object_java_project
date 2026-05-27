public class Show {

    private String[] color;
    private String[]  shape;

    public Show(String[] shape,String[] color){
        this.shape = shape;
        this.color = color;
        print();
    }

    private void print(){

        for (int i = 0; i < 50 ; i++) {

            if ( shape[i] == null){
                break;
            }
            System.out.println("NAME:"+shape[i]+"  COLOR :"+color[i]);
        }
    }
}
