package SortingAlgorithms;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seb on 10/10/16.
 */
public class SelectionSort {

    private int numberOfElementsSorted;
    private long start;
    private long end;


    public List selectionSort(LinkedList list) {


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        start = calendar.getTimeInMillis();




        int n = list.size();

        for (int j = 0; j < n-1; j++ ) { // for all elements in the set

            int minIndex = j;

            for (int i = j+1; i < n; i++) { // for all elements after j in the set


                if ((int)list.get(i) < (int)list.get(minIndex) ) { // if an element after j is less then j

                    minIndex = i; // remember it
                }

            }

            if(minIndex != j) {

                swap(list,j,minIndex); // swap j and minIndex

            }


        }





        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        end = calendar2.getTimeInMillis();


        return list;

    }

    private void swap(LinkedList list, int indexA, int indexB) {

        int temp = (int)list.get(indexA);

        list.set(indexA,list.get(indexB));
        list.set(indexB,temp);


    }


    public String stats() {

        return ("Time taken: " + (end - start) + " milliseconds.  Elements sorted: " + numberOfElementsSorted);
    }


}
