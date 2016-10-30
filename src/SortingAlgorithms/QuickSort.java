package SortingAlgorithms;

import sun.awt.image.ImageWatched;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seb on 7/09/2016.
 */
public class QuickSort {

    private int numberOfElementsSorted;
    private long start;
    private long end;


    public List quickSort(LinkedList list) {


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        start = calendar.getTimeInMillis();


        numberOfElementsSorted = list.size();


        sort(list,0 ,list.size()-1 );



        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        end = calendar2.getTimeInMillis();

        return list;
    }



    private LinkedList sort(LinkedList list, int i, int j) {


        if (i < j) {

            int p = partition(list,i,j);
            list = sort(list, i, p-1);
            list = sort(list, p+1, j);
        }

        return  list;
    }


    private int partition(LinkedList list, int i, int j) {

        int val = (int)list.get(i);
        int h = i;

        for (int k = i + 1; k <= j; k++ ) {

            if ( (int)list.get(k) < val ) {

                h++;
                swap(list, h, k);

            }



            }
        swap(list,i,h);

        return h;

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
