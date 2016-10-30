package SortingAlgorithms;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seb on 5/10/16.
 */
public class CountingSort {

    private int numberOfElementsSorted;
    private long start;
    private long end;


    public List countingSort(LinkedList list) {


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        start = calendar.getTimeInMillis();


        numberOfElementsSorted = list.size();


        list = sort(list,list.size());


        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        end = calendar2.getTimeInMillis();


        return list;
    }




    private LinkedList sort(LinkedList a, int m) {

        // set c[k] = the number of occurrences of value k
        // in the array a.
        // begin by initializing c to zero.

        LinkedList c = new LinkedList();

        for (int k = 0; k <= m; k++ ) {

            c.add(0);

        }

        int n = (int)a.getLast();

        for (int i = 1; i <= n; i++ ) {

            c.set((int)a.get(i) , (int)(c.get((int)a.get(i))) + 1 );


        }

        // modify c so that c[k] = number of elements ≤ k

        for (int k = 1; k <= m; k++ ) {

            c.set(k , (int)c.get(k) + (int)c.get(k - 1) );

        }
        // sort a with the result in b

        LinkedList b = new LinkedList();


        for (int k = 0; k <= m; k++ ) {

            b.add(0);

        }

        for (int i = n; i >= 1; i-- ) {

            b.set( (int)c.get((int)a.get(i)) , a.get(i) );

            c.set( (int)a.get(i) , (int)c.get((int)a.get(i)) - 1);

        }


        for (int i = 0; i <= n; i++ ) {

            a.set(i, b.get(i));

        }

        // copy b back to a


        return a;
    }



    public String stats() {

        return ("Time taken: " + (end - start) + " milliseconds.  Elements sorted: " + numberOfElementsSorted);
    }

}