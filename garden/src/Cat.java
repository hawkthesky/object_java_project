public class Cat extends  Animal{

    public void makeSound(){

        System.out.println("Meow");
    }

    public void eat(){
        System.out.println("Cat is eating milk");
    }

    public void hunt(String prey){

        System.out.println("cat is hunting a "+prey);
    }

    public void hunt(int len){
        System.out.println("cat hunted for "+len+" hours");
    }

    public void hunt(){

        System.out.println("cat is hunting alone");
    }
}
