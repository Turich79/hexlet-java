package hexlet.code;

import java.util.ArrayList;

public class App2 {
    public static boolean hasDuplicates(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            String tekStr = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(i != j && tekStr.equals(arr[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
