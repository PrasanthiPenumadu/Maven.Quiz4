package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value*value;
    }

    public static Double[] squareRoots(Double... value) {
        Double [] newarr=new Double[value.length];
        for(int x=0;x<newarr.length;x++) {
            newarr[x] = Math.sqrt(value[x]);
        }
        return newarr;
    }

    public static Double[] squares(Double... values) {
        Double [] newarr=new Double[values.length];
        for(int x=0;x<newarr.length;x++){
            newarr[x]=values[x]*values[x];
        }
        return newarr;
    }

    public static Double add(Double value1, Double value2) {
        return value1+value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1-value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
