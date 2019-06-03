package Lab_3;


import Lab_5.*;

import java.util.Scanner;

//String
//Відсортувати слова заданого тексту, що починаються з голосних літер, за другою літерою.
public class lab_3 {
    public static void main(String[] args) {
        char[] letters = {'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String  str = sc.nextLine();

        String strArray[] =  str.split(" ");

        for (int i=0; i<strArray.length-1; i++){
            for (int j=i+1; j<strArray.length; j++){
                boolean flag1 = false, flag2 = false;
                for (char x: letters) {
                    if (strArray[i].length() >= 2 && strArray[i].charAt(0) == x){
                        flag1 = true;

                    }
                    if (strArray[j].length() >= 2 && strArray[j].charAt(0) == x){
                        flag2 = true;

                    }


                }
                if (flag1 && flag2 && strArray[i].toUpperCase( ).charAt(1) > strArray[j].toUpperCase( ).charAt(1)){
                    String term = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = term;
                }
            }
        }

        for (String x: strArray)
            System.out.print(x + " ");

    }
}
