import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);


        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Integer> random_list = new ArrayList<>();
        ArrayList<String> type_animal = new ArrayList<>();

        System.out.println("       Admin Garden");

        int mune;

        do {

            System.out.println("1) ADD ANIMAL");
            System.out.println("2) SHOW ALL SOUND ANIMAL");
            System.out.println("3) SHOW ALL INFORMATION ANIMAL");
            System.out.println("4) INCREASE AGE A ANIMAL");
            System.out.println("5) EXIT");
            mune = input.nextInt();

            if (mune > 5 || mune < 1)
                System.out.println("ERROR CHOICE");

            else if (mune == 1) {

                int mune_animal;
                String choice = "null";
                boolean mune2 =  false;

                do {

                    System.out.println("1) lion");
                    System.out.println("2) cat");
                    System.out.println("3) dog");
                    System.out.println("4) owl");
                    System.out.println("5) canary");
                    mune_animal = input.nextInt();

                    if (mune_animal == 1){
                        choice = "lion";
                    }
                    else if (mune_animal == 2) {
                        choice = "cat";
                    }
                    else if (mune_animal == 3) {
                        choice = "dog";
                    }
                    else if (mune_animal == 4) {
                        choice = "owl";
                    }
                    else if (mune_animal == 5) {
                        choice = "canary";
                    }
                    else {
                        System.out.println("Error choice !!");
                        mune2 = true;
                    }

                }while (mune2);

                System.out.println("name :");

                String name = input.next();

                System.out.println("weight :");
                double weight = input.nextDouble();

                System.out.println("age :");
                int age = input.nextInt();

                Animal animal = new Animal(name,weight,age);

                animal.setAnimal(choice);
                animals.add(animal);

                type_animal.add(choice);

                int r = rand(random_list);

                System.out.println("ID :"+ r);
            }

            else if (mune == 2) {
                sound(type_animal);
            }

            else if (mune == 3) {
                information(animals,type_animal);
            }
            else if (mune == 4) {

                int scanf;
                System.out.println("id ");
                scanf = input.nextInt();

                comparison(scanf,animals,random_list);

            }


        }while ( mune != 5);

        System.out.println("END");

    }

    public static int rand(ArrayList<Integer> rand){

        Random random = new Random();

        int result = -1 ,flag ;

        do {

            flag = 0;
            result = random.nextInt(1000,9999) + 1;

            if (rand.contains(result)){
                flag = 1;
            }else
                rand.add(result);

        }while (flag == 1);

        return result;
    }

    public static void sound(ArrayList<String> animal){

        for (int i = 0 ; i < animal.size() ;i++){

            if ("lion".equals(animal.get(i))){

                Animal lion = new Lion();

                lion.makeSound();

            } else if ("cat".equals(animal.get(i))) {

                Animal cat = new Cat();

                cat.makeSound();

            } else if ("owl".equals(animal.get(i))) {

                Animal owl = new Owl();

                owl.makeSound();

            } else if ("canary".equals(animal.get(i))) {

                Animal canary = new Canary();

                canary.makeSound();

            } else if ("dog".equals(animal.get(i))) {

                Animal dog = new Dog();

                dog.makeSound();
            }
        }
    }

    public static void information(ArrayList<Animal> animal,ArrayList<String> type){

        for (int i = 0; i < animal.size(); i++) {

            Animal index = animal.get(i);
            System.out.println(index.getInfo());

            if ("lion".equals(type.get(i))){

                Animal lion = new Lion();

                lion.makeSound();
                lion.eat();

                Lion lion1 = new Lion();
                lion1.hunt();

            } else if ("cat".equals(type.get(i))) {

                Animal cat = new Cat();

                cat.makeSound();
                cat.eat();

                Cat cat1 = new Cat();
                cat1.hunt(2);

            } else if ("owl".equals(type.get(i))) {

                Animal owl = new Owl();

                owl.makeSound();
                owl.eat();

                Owl owl1 = new Owl();
                owl1.hunt("mouse");

            } else if ("canary".equals(type.get(i))) {

                Animal canary = new Canary();

                canary.makeSound();
                canary.eat();

            } else if ("dog".equals(type.get(i))) {

                Animal dog = new Dog();

                dog.makeSound();
                dog.eat();

                Dog dog1 = new Dog();
                dog1.hunt(1);
            }

            System.out.println("***********"+(i+1)+"*************");
        }
    }

    public static void comparison(int target,ArrayList<Animal> animals,ArrayList<Integer> random ){

        if (random.contains(target)){

            System.out.println("is found");

            int i = random.indexOf(target);
            Animal x = animals.get(i);
            int P = x.increaseAge();
            System.out.println(P);

        }
        else {
            System.out.println("do not found");
            return;
        }

    }
}











