public class Dog extends Animal{

    public void makeSound(){
        System.out.println("Woof");
    }

    public void eat(){
        System.out.println("Dog is eating Bone");
    }

    public void hunt(){

        System.out.println("dog is hunting alone");
    }

    public void hunt(String prey){

        System.out.println("dog is hunting a "+prey);
    }

    public void hunt(int len){

        System.out.println("dog hunted for "+len+" hours");
    }
}
