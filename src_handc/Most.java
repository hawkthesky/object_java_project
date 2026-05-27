
public class Most {

    private double[] mohit;
    private final int num = 50;
    private double most;

    public void setMohit(double[] mohit) {
        this.mohit = mohit;

        Copy();

    }

    private void Copy(){

        double[] copy_arr = new double[num];

        for (int i = 0; i < num; i++) {

            if (mohit [i] != 0){
                copy_arr[i] = mohit[i];
            }
            else
                break;

        }

        sort(copy_arr);
    }

    private void sort(double[] copy_arr){

        for (int i = 0; i < num -1; i++) {

            for (int j = 0; j < num-i-1; j++) {

                if (copy_arr[j] < copy_arr[j+1]){

                    double temp = copy_arr[j];
                    copy_arr[j] = copy_arr[j+1];
                    copy_arr[j+1] = temp;
                }
            }
        }

        double most = copy_arr[0];
        setMost(most);

    }

    public void setMost(double most) {
        this.most = most;
    }

    public double getMost() {
        return most;
    }
}
