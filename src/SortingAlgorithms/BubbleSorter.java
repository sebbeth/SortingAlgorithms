package SortingAlgorithms;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by seb on 6/09/2016.
 */
public class BubbleSorter {

    private int numberOfElementsSorted;
    private long start;
    private long end;



    public BubbleSorter() {


    }


    public List bubbleSort(List list) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        start = calendar.getTimeInMillis();


        numberOfElementsSorted = list.size();

        for (int i = 0; i < list.size(); i++ ) {

            for (int j = list.size() - 1; j > i; j-- ) {


                if ( ((int)list.get(j)) < ((int)list.get(j-1)) ) {

                    int temp = (int)list.get(j);
                    list.set(j ,list.get(j-1));
                    list.set(j-1, temp);

                }

            }

        }


        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        end = calendar2.getTimeInMillis();



        return list;
    }


    public String stats() {

        return ("Time taken: " + (end - start) + " milliseconds.  Elements sorted: " + numberOfElementsSorted);
    }


}
