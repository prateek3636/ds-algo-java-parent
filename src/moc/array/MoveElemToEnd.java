package moc.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElemToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        // [1,2,3,4,2,2,5] [1,3,4,2,2,2,5]
        int start = 0, end = array.size()-1;
        while(start <= end){
            if(array.get(end) == toMove){
                end --;
            }

            else if(array.get(start) == toMove && array.get(end) != toMove){
                int tmp = array.get(start);
                array.set(start, array.get(end));
                array.set(end, tmp);
                start++;
            }

            else{
                start++;
            }

        }

        System.out.println(Arrays.toString(array.toArray()));
        return new ArrayList<>();

    }
}
