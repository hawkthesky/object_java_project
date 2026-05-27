public class Dog implements Vet {

    public void makeNoise(){

        System.out.println("hap hap");
    }

    public void eat(){
        System.out.println("eating Dog");
    }

    @Override
    public void giveShot() {
        System.out.println("Dog giveShot");
    }
}
