package Array;

import java.util.Arrays;

public class Array {
    public static <ids> void main(String[] args) {
        int[] ids = {12,13,34,55,77};
        for ( int index = 0 ; index < ids.length; index++){
            System.out.println(ids[index]);
        }


        for ( int index = 0; index<ids.length ; index++){
            ids[index] +=index+1;
        }System.out.println("After update ");
        for(int id: ids){
            System.out.print(id+" ");
            Arrays.stream(ids).sorted();
        }
    }
}
