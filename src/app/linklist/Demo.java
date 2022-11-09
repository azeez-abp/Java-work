package app.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> items  = new LinkedList<>();
//         items.add("Abia");
//         items.add("Adamamwaw");
//         items.add("Akwa-Ibamo");
//         items.add("Lagos");
//         items.add("Oyo");

        addInOrdr(items,"brantan");
        addInOrdr(items,"antan");
        addInOrdr(items,"fanta");
        addInOrdr(items,"canta");
        addInOrdr(items,"datana");

        printLsit(items);
        checkList(items);

    }


    public static void printLsit(LinkedList<String > items){
        Iterator itemIterator  = items.iterator();
        while (itemIterator.hasNext()){
         System.out.println(   itemIterator.next());
        }
        System.out.println(   "==============================");
    }

    public  static  boolean addInOrdr(LinkedList<String> items,String newItemData){
       ListIterator<String> iterators  = items.listIterator();
        while (iterators.hasNext()){
            int comparator  = iterators.next().compareTo(newItemData);
            if(comparator==0){
                return false;
            }else if(comparator > 0 ){
                /////newItemData go before this]
                iterators.previous();
                iterators.add(newItemData);
                return  true;

            }
            else if(comparator < 0 ){
                /////the next is there


            }



        }
        //add after next
        iterators.add(newItemData);
        return  true;
    }

    private static void checkList(LinkedList<String> list){
        Scanner input  = new Scanner(System.in);
        boolean quit  = false;
        boolean goingFroward  =  true;//fix issue of no getting the next or prev item when prev change to next
        ListIterator<String > items  = list.listIterator();
        if(list.getFirst() == "") {

        }else{
            printMenu();
            while (!quit){
                int option   = input.nextInt();
                input.nextLine();
                switch (option){
                    case 0:
                        System.out.println("You quite");
                        quit =true;
                    case 1:
                        if (!goingFroward){
                            if (items.hasNext()){
                                items.next();
                            }
                            goingFroward = true;
                        }
                        if(items.hasNext()){
                            System.out.println("You now checking  on "+ items.next());
                        }else{
                            System.out.println("No more item to check");

                        }
                    break;

                    case 2:
                        if (goingFroward){
                            if (items.hasPrevious()){
                                items.previous();
                            }
                            goingFroward = false;
                        }
                        if(items.hasPrevious()){
                            System.out.println("You now checking  on  "+ items.previous());
                        }else{
                            System.out.println("No more item to check");
                        }
                        break;

                    case 3:
                         printMenu();
                         break;



                }
            }

        }
    }

    public static void printMenu(){
        System.out.println("Enter 0 to quite " +
                "\n Enter 1 to go to the next item" +
                " \n Enter 2 to go to the previous item " +
                "\n Enter 3 to show menu");
    }
}

