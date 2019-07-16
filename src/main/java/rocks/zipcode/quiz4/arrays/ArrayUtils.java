package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int x=values.length/2;
        if(values.length%2==0)
            return values[x-1];
        else
        return values[x];
    }

    public static String[] removeMiddleElement(String[] values) {
        int x=values.length/2;
        int j=0;
        if(values.length%2==0)
        j=x-1;
        else
            j=x;
        String [] arr=new String[values.length-1];
        for(int i=0;i<x;i++){
            arr[i]=values[i];
        }
        for(int i=x+1;i<values.length;i++)
        {
            arr[i-1]=values[i];
        }
        return arr;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String [] arr=new String[values.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=values[i];
        }
        return arr;
    }
}