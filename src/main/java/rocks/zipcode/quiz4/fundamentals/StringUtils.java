package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
   int position=0;
   if(string.length()%2==0)
       position=string.length()/2-1;
        else
       position=string.length()/2;
        char x=(string.substring(position,position+1)).charAt(0);
        return x;
    }

    public static String capitalizeMiddleCharacter(String str) {
 if(str.length()==1)
     return str.toUpperCase();
 else{

        int l=0;
        int position=0;
        if(str.length()%2==0){
            position=str.length()/2-1;
            l=2;}
        else {
            position = str.length() / 2;
            l=1;
        }
        String x=str.substring(0,position)+(str.substring(position,position+l)).toUpperCase()+str.substring(2, str.length());

        return   x;}
    }

    public static String lowerCaseMiddleCharacter(String str) {
        if(str.length()==1)
            return str.toLowerCase();
        else{

            int l=0;
            int position=0;
            if(str.length()%2==0){
                position=str.length()/2-1;
                l=2;}
            else {
                position = str.length() / 2;
                l=1;
            }
            String x=str.substring(0,position)+(str.substring(position,position+l)).toLowerCase()+str.substring(position+1, str.length());

            return   x;}
    }

    public static Boolean isIsogram(String str) {
        String string=str.toUpperCase();
        char [] c=str.toCharArray();

         Arrays.sort(c);
        for(int t=0;t<c.length-1;t++){
            if(c[t]==c[t+1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char [] c=str.toCharArray();
        for(int t=0;t<c.length-1;t++){
            if(c[t]==c[t+1])
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        char [] c=str.toCharArray();
        String string="";
        String y="";
        for(int t=0;t<c.length-1;t++){
            if(c[t]==c[t+1]){
                y+=c[t]+c[t+1];
            t++;}
            else
                string+=c[t];
        }
        String res=string+str.substring(str.length()-1);
        return res;
    }

    public static String invertCasing(String str) {
        char [] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            char x=c[i];
            if(Character.isUpperCase(x))
                c[i]=Character.toLowerCase(x);
            else if(Character.isLowerCase(x))
                c[i]=Character.toUpperCase(x);
        }
        return new String(c);
    }
}