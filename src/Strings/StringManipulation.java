package Strings;

public class StringManipulation {
    public static void main(String[] args) {

        //String literal
        String str="hello";
        System.out.println(str);

        //stirng object
        String str1= new String("World");
        System.out.println(str1);

        //concat string object and literal
        String str2=str+str1;
        System.out.println(str2);

    }
}