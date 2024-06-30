package dev.lpa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      Integer boxedInt = Integer.valueOf(15);
      Integer deprecateBoxing = new Integer(15);
      int unboxedInt = boxedInt.intValue();

      //Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println((autoBoxed.getClass().getName()));
//        System.out.println((autoBoxed.getClass().getName()));
        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] =50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] charactersArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(charactersArray));

        var ourList = List.of(1,2,3,4,5);
        System.out.println(ourList);


    }

    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();

        for(int i : varargs){
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i){

        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }

    private static Double getLiteralDoublePrimitive() {
        return 100.00;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    }
