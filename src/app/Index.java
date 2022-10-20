package app;

import java.util.Scanner;

public class Index {
    private Scanner input  = new Scanner(System.in);
    public  void Index(){
        System.out.println("INDEX CALL");
    }

    public int[] getInt(int numOfInt){
        System.out.println("Enter "+numOfInt+" integers ");
        int[] allNumcollected = new int[numOfInt];
        for (int i=0;i < allNumcollected.length;i++){
            allNumcollected[i]= input.nextInt();
        }
//        for (int i=0;i < allNumcollected.length;i++){
//            System.out.println("Enter "+allNumcollected[i]+" integers ");//  allNumcollected[i]= input.nextInt();
//        }
        return allNumcollected;
    }
}

