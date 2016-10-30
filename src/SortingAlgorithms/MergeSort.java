package SortingAlgorithms;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;

/**
 * Created by seb on 6/09/2016.
 */
public class MergeSort {

    private int numberOfElementsSorted;
    private long start;
    private long end;


    public MergeSort() {



    }

    public LinkedList mergeSort(LinkedList list) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        start = calendar.getTimeInMillis();




        list = mSort(list);





        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        end = calendar2.getTimeInMillis();


        return list;
    }



    private LinkedList mSort(LinkedList list) {

        int n = list.size(); // n = cardinality of input set

        if (n == 1) { // if there is only one element, return it, there's nothing to sort.

            return list;

        } else {

            int m = n/2; // Get the middle index of the input set



            LinkedList l1 = new LinkedList();

            LinkedList l2 = new LinkedList();

            for (int i = 0; i < m; i++ ) { //populate l1 so that it equals the first half of the input set

                l1.add(list.get(i));
            }

            for (int j = m; j < list.size(); j++ ) { //populate l2 so that it equals the second half of the input set

                l2.add(list.get(j));

            }

            l1 = mSort(l1); // split l1 again
            l2 = mSort(l2); // split l2 again.

            return merge(l1,l2); // merge l1 and l2 together

        }


    }

    private LinkedList merge(LinkedList l1, LinkedList l2) {





        if (l1.isEmpty()) { // if l1 is empty, return l2, we're done

            return l2;

        } else if (l2.isEmpty()) { // if l2 is empty, return l1, we're done

            return l1;

        } else {

            // if the first element of l1 <= first element of l2
            if ((int)l1.getFirst() <= (int)l2.getFirst()) {

                int first = (int)l1.getFirst(); // Take the first element

                l1.removeFirst();

                LinkedList l = merge(l1,l2); // merge both sets minus first

                l.addFirst(first); // add first back to l
                return l;

            } else {

                int first = (int)l2.getFirst();

                l2.removeFirst();

                LinkedList l = merge(l1,l2);

                l.addFirst(first);
                return l;


            }

        }

    }



    public String stats() {

        return ("Time taken: " + (end - start) + " milliseconds.  Elements sorted: " + numberOfElementsSorted);
    }



}
