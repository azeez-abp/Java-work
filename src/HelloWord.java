import app.Index;//////import the index class
///////instanctial the class;
//////start using the method and props of the class
public class HelloWord {

    public static void main(String[] args) {
            Index objOne  = new Index();
            objOne.Index();
           int [] userInpInt =   objOne.getInt(4);///avoid using objOne.getInt(4) again to avoid second call
        for (int i=0;i < userInpInt.length;i++){
            System.out.println(" "+userInpInt[i]+" is among the collected integers ");//  allNumcollected[i]= input.nextInt();
        }
          //  System.out.println(objOne.getInt(4).length);
          System.out.println(methOne("__MAIN__"));
    }

    public static String methOne(String num){
        return num;
    }
}
