package SortingAlgorithms;

import java.util.*;

/**
 * Created by seb on 8/09/2016.
 */

public class Randomiser {

    private int numberOfElementsSorted;
    private long start;
    private long end;

    public List randomise(List list) {

        numberOfElementsSorted = list.size();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        start = calendar.getTimeInMillis();



        // Take a list of ints and randomise them.
        List output = new LinkedList();

        while (list.size() > 0) {

            int selector = new Random().nextInt(list.size()); // Select an element from the sorted list randomly.

            output.add(list.get(selector)); //add it to the randomised list.
            list.remove(selector); // remove it from the sorted list.

        }




        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        end = calendar2.getTimeInMillis();

        return output;


    }

    public List generateRandomisedList(int n) {

        List sortedList = new LinkedList();
        List randomisedList = new LinkedList();


        for (int i = 0; i < n; i++ ) { // Populate our sortedList.

            sortedList.add(i);

        }

        while (randomisedList.size() != n) {

            int selector = new Random().nextInt(sortedList.size()); // Select an element from the sorted list randomly.

            randomisedList.add(sortedList.get(selector)); //add it to the randomised list.
            sortedList.remove(selector); // remove it from the sorted list.

        }




            return randomisedList;
    }

    public String stats() {

        return ("Time taken: " + (end - start) + " milliseconds.  Elements sorted: " + numberOfElementsSorted);
    }

}
