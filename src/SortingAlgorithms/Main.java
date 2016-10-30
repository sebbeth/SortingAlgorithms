package SortingAlgorithms;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {



        int n = 20000;

        LinkedList toSort = new LinkedList();
        LinkedList toSort2 = new LinkedList();
        LinkedList toSort3 = new LinkedList();
        LinkedList toSort4 = new LinkedList();
        LinkedList toSort5 = new LinkedList();
        LinkedList toSort6 = new LinkedList();


        out("Sorting... \n \n");



        for (int i = 0; i < n; i++ ) {


            Random r = new Random();

            int payload =  r.nextInt(1000000);
            toSort.add(payload);
            toSort2.add(payload);
            toSort3.add(payload);
            toSort4.add(payload);
            toSort5.add(payload);
            toSort6.add(payload);


        }


        out(" Unsorted " +   toSort.toString());

        MergeSort mergeSort = new MergeSort();
        out("Merge sort: \n"+ mergeSort.mergeSort(toSort5).toString());

        out(mergeSort.stats());


/*
        QuickSort quickSort = new QuickSort();
        out(" Quick sort : \n" + quickSort.quickSort(toSort3).toString());

        out(quickSort.stats());

        out("\n");

*/

/*
        out("Bubble sort: Unsorted " + toSort.toString());

        BubbleSorter bubble = new BubbleSorter();
        out(bubble.bubbleSort(toSort).toString());

        out(bubble.stats());

*/

  /*      MergeSort mergeSort = new MergeSort();
        out(mergeSort.mergeSort(toSort).toString());

        out(mergeSort.stats());


        out("\n");
*/

/*
        out(" Insertion sort: Unsorted " + toSort2.toString());

        InsertionSort insertionSort = new InsertionSort();
        out(insertionSort.insertionSort(toSort2).toString());

        out(insertionSort.stats());

        out("\n");
*/

/*
        Randomiser randomiser = new Randomiser();
//        out(randomiser.generateRandomisedList(6).toString());

        out("Randomiser: " + toSort4.toString());

        out(randomiser.randomise(toSort4).toString());

        out(randomiser.stats());
*/

        out("\n");

/*
        out("Counting Sort: Unsorted " + toSort5.toString());

        CountingSort countingSort = new CountingSort();
        out(countingSort.countingSort(toSort5).toString());

        out(countingSort.stats());
*/


/*
        out("\n");

        out("Selection sort: Unsorted " + toSort6.toString());

        SelectionSort selectionSort = new SelectionSort();
        out(selectionSort.selectionSort(toSort6).toString());

        out(selectionSort.stats());
*/


    }



    public static void out(String input) {

        System.out.println(input);
    }
}
