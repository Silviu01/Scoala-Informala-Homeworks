package com.siit.bubblesortalgorithm;
/*
contains the algorithm to sort an array of objects by a specified property;
it is package-private
 */
class SortAlgorithm {

    /**
     * This method is used to bubble sort in descending order an
     * array of object by a specified property. The method is package-private.
     * @param arr this is the array passed to the method
     */

    void bubbleSort(SalesRep[] arr) {

        SalesRep temp;

        for (int i = 0; i < arr.length; i++){ // loops through the array an for each value
            //a comparison is done based on the loop below

            for (int j=1; j < arr.length; j++){  // searches for every iteration in the first loop
                // compares the value with the rest of the items in the array and moves the value of the
                //current index according to the comparison below

                if(arr[j-1].getSalesWorth()<arr[j].getSalesWorth()){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}