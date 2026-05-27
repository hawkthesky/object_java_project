import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<String> item = new ArrayList<>();
        ArrayList<Integer> random = new ArrayList<>();
        ArrayList<String> borrowed = new ArrayList<>();
        ArrayList<String>  check_isbn = new ArrayList<>();
        ArrayList<String> canBorrow = new ArrayList<>();
        ArrayList<String> show_member = new ArrayList<>();


        System.out.println("===LIBRARY MANAGEMENT SYSTEM===");

        int mune;
        do {

            System.out.println("1) Add new item");
            System.out.println("2) Register new member");
            System.out.println("3) Borrow an item");
            System.out.println("4) Return an item");
            System.out.println("5) Search item by keyword");
            System.out.println("6) Display by item");
            System.out.println("7) Display by members");
            System.out.println("8) Show borrowed item of a members");
            System.out.println("0) Exit");
            mune = input.nextInt();

            if (mune > 8 || mune < 0) {
                System.out.println("ERROR CHOICE.");
            } else if (mune == 0) {
                System.out.println("End program library management system");
                break;
            }
            else if (mune == 1) {

                int choice;
                System.out.println("[1] remove");
                System.out.println("[2] add");
                System.out.print("choice:");
                choice = input.nextInt();

                if (choice == 2) {

                    Libraryitem adding = new DVD();
                    Libraryitem add_book = new Book();
                    Libraryitem add_magazine = new Magazine();

                    adding.setLibrary(input);
                    adding.setId(random);
                    adding.setTitle(input);
                    adding.setAvailable(input);
                    adding.setDue_date(input);

                    if ("book".equals(adding.getLibrary())) {

                        add_book.setAuthor(input);
                        add_book.setIsbn(input, check_isbn);
                        add_book.setGenre(input);

                        String book = add_book.getBasic();

                        item.add(adding.getInfo() + book);

                    } else if ("dvd".equals(adding.getLibrary())) {


                        adding.setDirector(input);
                        adding.setRating(input);
                        adding.setDurationMinutes(input);

                        String dvd = adding.getBasic();
                        item.add(adding.getInfo() + dvd);
                    } else if ("magazine".equals(adding.getLibrary())) {

                        add_magazine.setIssueNumber(input);
                        add_magazine.setPublisher(input);

                        String magazine = add_magazine.getBasic();
                        item.add(adding.getInfo() + magazine);
                    }


                    System.out.println(item.getLast());
                    System.out.println("note :" + random.getLast());
                    System.out.println("REGISTER SUCCUSS.");
                }
                else if (choice == 1) {

                    if (random.isEmpty()) {

                        System.out.println("is empty item lhe library.\n");

                    } else {

                        System.out.println(random);

                        int code;
                        System.out.print("CODE ID :");
                        code = input.nextInt();

                        if (random.contains(code)) {

                            if (show_member.isEmpty()){
                                int index = random.indexOf(code);


                                random.remove(index);

                                System.out.println("REGISTER SUCCUSS.");

                                item.remove(index);

                            }
                            else
                                System.out.println("this item borrowed .\nyou can not remove");


                        } else {
                            System.out.println(" NOT FOUND ID.");
                        }
                    }


                }


            }
            else if (mune == 2) {

                Library library = new Library();
                library.mune_member(input);

                if (library.getChoice().equals("Student")) {

                    Member member = new Student();

                    member.setName(input);
                    member.setId(input, borrowed);
                    member.setEmail(input);

                    String sum1 = member.getInfo();
                    String sum2 = library.getChoice();

                    String[] word = sum1.split(",");
                    //  canBorrow.add(word[2]+",3,");

                    String riposte = sum2 + sum1;

                    borrowed.add(riposte);

                } else if (library.getChoice().equals("Faculty")) {

                    Member member = new Faculty();

                    member.setName(input);
                    member.setId(input, borrowed);
                    member.setEmail(input);

                    String sum1 = member.getInfo();
                    String sum2 = library.getChoice();

                    String[] word = sum1.split(",");
                    //     canBorrow.add(word[2]+",10,");

                    String riposte = sum2 + sum1;

                    borrowed.add(riposte);
                }

            }
            else if (mune == 3) {

                Library library = new Library();
                
                library.mune_member(input);
                String temp = library.getChoice();
                
                Member member = new Student();
                Member member_fac = new Faculty();
                
                member.setCode_user(input);

                String target = member.getCode_user();
                member.check(borrowed, target);

                if (member.getCheck() == 0) {

                    member.show(item,random);

                    int choice = input.nextInt();

                    if (choice >= 1000 && choice <= 9999) {

                        if (random.contains(choice)) {

                            member.canBorrow(show_member,target);
                            member_fac.canBorrow(show_member,target);

                            if (member.getCount() < 3 && temp.equals("Student")){

                                int index = random.indexOf(choice);

                                member.update(item, index, random);

                                if (member.getUpdate()){

                                    show_member.add(target+","+item.get(index));
                                }
                            } else if (member_fac.getCount() < 10 && temp.equals("Faculty")) {

                                int index = random.indexOf(choice);

                                member.update(item, index, random);

                                if (member.getUpdate()){

                                    show_member.add(target+","+item.get(index));
                                }

                            }

                        } else
                            System.out.println("no found code :(");
                    } else
                        System.out.println("Error code :(");

                }

                System.out.println(show_member);

            }
            else if (mune == 4) {

                Library library = new Library() ;
                Member member = new Faculty();

                member.setCode_user(input);
                library.check(member.getCode_user(),borrowed);

                if (library.isFlag()){

                    int code;
                    System.out.println("ENTER CODE ITEM:");
                    code = input.nextInt();


                    if (check(random,code)){

                        int index = random.indexOf(code);
                        //member.check(member.getCode_user(),show_member);

                        boolean result = update_item(item,index);

                        if (show_member.isEmpty()){
                            System.out.println("is empty borrowing library.");
                        }
                        else {
                            if (result){

                                show_member.set(index, " ");
                                member.returnItem(input, item, index);

                            }
                        }



                    }
                }
                else
                    System.out.println("ERROR ID");


            }
            else if(mune == 5){

               // Searchable search_dvd = new DVD() ;
                Searchable search_book = new Book();
               // Searchable search_magazine = new Magazine();

                System.out.println("please enter the words properly:");
                System.out.println("enter:");
                String matches = input.next();

                boolean x = search_book.matches(matches,item);

                if (x){
                    System.out.println(search_book.getinfo());
                }
                else
                    System.out.println("not found the search information :(\n\n");

            }
            else if (mune == 6) {

                String display;

                Displayitem displayitem = new Displayitem(item);
                displayitem.item();

                displayitem.isFlag();
                if (displayitem.getFlag()== false)
                    System.out.println("is empty\n");

            }
            else if (mune == 7) {

                Displaymember display = new Displaymember();
                display.show_member(borrowed);

            }

            else if (mune == 8) {

                Member show = new  Student();

                show.setCode_user(input);

                String target = show.getCode_user();

                Show display = new Show();

                display.display(target,show_member);

                if (display.isFlag()){

                    if (display.getUser_borrow().isEmpty())
                        System.out.println("EMPTY");

                    else
                        System.out.println(display.getUser_borrow());
                }


            }

        }while (true);

    }

    public static boolean check(ArrayList<Integer> random ,int target){


        if (random.contains(target)){

            System.out.println("found");
            return true;

        }else{
            System.out.println("not found code !!");
            return false;
        }

    }

    public static boolean update_item(ArrayList<String> item,int index){

        String temp = item.get(index);

        String[] word = temp.split(",");

        if (word[2].equals("false")){

            if (word.length == 7){
                item.set(index,word[0]+","+word[1]+",true,"+word[3]+","+word[4]+","+word[5]+","+word[6]);
                System.out.println("OPERATION SUCCESS");
                return true;
            }
            else if (word.length == 6) {
                item.set(index,word[0]+","+word[1]+",true,"+word[3]+","+word[4]+","+word[5]);
                System.out.println("OPERATION SUCCESS");
                return true;
            }
        }
        else
            System.out.println("ERROR THE FOUND LIBRARY.");

        return false;

    }


}



