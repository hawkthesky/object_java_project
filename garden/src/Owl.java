public class Owl extends  Animal{

    public void makeSound(){
        System.out.println("Hoot");
    }

    public void eat(){
        System.out.println("Owl is eating mouse");
    }

    public void hunt(int len){
        System.out.println("owl hunted for "+len+" hours");
    }

    public void hunt(String prey){

        System.out.println("owl is hunting a "+prey);
    }

    public void hunt(){
        System.out.println("owl is hunting alone");
    }
}
