public class Lion extends Animal{

    public void makeSound(){
        System.out.println("Roar");
    }

    public void eat(){
        System.out.println("Lion is eating meat");
    }

    public void hunt(){
        System.out.println("lion is hunting alone");
    }

    public void hunt(int len){

        System.out.println("lion hunted for "+len+" hours");
    }

    public void hunt(String prey){

        System.out.println("lion is hunting a "+prey);
    }
}
