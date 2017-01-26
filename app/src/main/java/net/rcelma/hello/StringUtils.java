package net.rcelma.hello;

/**
 * Created by User on 1/25/2017.
 */

public class StringUtils {
    public static String strInverter(String entry){
        char[] chars = entry.toCharArray();
        char[] rest = new char[chars.length];
        int cont = 0;
        for(int i = chars.length - 1; i >= 0; i--){
            rest[i] = chars[cont++];
        }
        return new String(rest);
    }

    public static String strInvertByWord(String words){
        StringBuilder strBld = new StringBuilder();
        for(String str: words.split(" ")){
            strBld.append(strInverter(str)).append(" ");
        }
        return strBld.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("JJJ KKK   hola!");
        System.out.println(strInverter("JHL LJK   hola!"));
        System.out.println(strInvertByWord("JHL LJK   hola!"));
    }
}
