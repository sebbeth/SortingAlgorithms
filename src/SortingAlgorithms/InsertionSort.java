package SortingAlgorithms;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seb on 6/09/2016.
 */
public class InsertionSort {

    private int numberOfElementsSorted;
    private long start;
    private long end;


/**



 */

    public List insertionSort(LinkedList list) {


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        start = calendar.getTimeInMillis();


        numberOfElementsSorted = list.size();

        int current;




        int endCond = list.size();

        for (int sorted = 0; sorted < endCond; sorted++ ) {




            current = (int)list.getLast();

            list.removeLast();

        //    insertIntoLinkedList(list,sorted,current);

            for (int i = 0; i <= sorted; i++ ) {



                // Now find where in the sorted section of the list the current element should be inserted into.

                if (i == sorted) { // If we've gotten to the sorted index, add after the last sorted

                    insertIntoLinkedList(list,sorted,current);

                } else if (current < (int)list.get(i) ) { // If current < the sorted element at i, insert current before i


                    insertIntoLinkedList(list,i,current);

                    i = sorted; // Now exit the for loop

                } else {



                }




            }


        }


        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        end = calendar2.getTimeInMillis();

        return list;
    }




    private void insertIntoLinkedList(LinkedList list, int index, int input ) {



        if (index > list.size()-1) {
            list.addLast(input);

        } else if (index < 0 ) {

            list.addFirst(input);

        } else {

            list.add(index,input);
/*
            for (int i = 0; i < list.size(); i++ ) {

                if (i == index ) {
                    // insert here
                    list.add(i,input);

                }


            }

            */

        }





    }


    public String stats() {

        return ("Time taken: " + (end - start) + " milliseconds.  Elements sorted: " + numberOfElementsSorted);
    }


}
