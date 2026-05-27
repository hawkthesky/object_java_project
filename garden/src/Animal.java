public class Animal {

    private int age;
    private double weight;
    private String name;
    private String animal;

    public Animal(String name,double weight,int age){

        this.name = name;
        this.weight = weight;
        this.age = age;

    }

    public Animal(){
        this.name = "NULL";
        this.weight = 0;
        this.age = 0;
    }

    public void setAnimal(String animal){
        this.animal = animal;
    }

    public void makeSound(){

        System.out.println("Some generic animal sound ");
    }

    public void eat(){

        System.out.println(name+" is eating food");
    }

    public String getInfo(){
        return "Name:"+name+"\nWeight:"+weight+"\nAge:"+age+"\nAnimal:"+animal;
    }

    public int increaseAge(){
        ++age;
        return age;
    }

}
