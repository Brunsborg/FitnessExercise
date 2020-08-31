public class HelperClass {

    public static void Layout(String ... args){
        for(String s : args){
            letterValue(s);
        }
        System.out.println();
    }

    public static void letterValue(String s){
        int value = 20-s.length();
        System.out.print(s);
        for(int i = 0; i <= value; i++){
            System.out.print(" ");
        }
    }

    public static void stars(){
        System.out.println("***********************************************************************************************************");
    }

    public static void bars(){
        System.out.println("=========================================================================================================== \n");
    }
}
