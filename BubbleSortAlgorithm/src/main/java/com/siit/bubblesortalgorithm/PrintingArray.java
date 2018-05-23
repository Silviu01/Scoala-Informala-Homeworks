package com.siit.bubblesortalgorithm;
/*
this class is used to simply print an array based on some properties from SalesRep class
 */
class PrintingArray {

    static void loopingTheArrayAndPrinting(SalesRep[] reps) {
        for (SalesRep rep : reps) {
            getPrint(rep);
        }
    }

    static private void getPrint(SalesRep rep) {
        System.out.print(rep.getName() + " " + rep.getSalesWorth() + ", ");
    }
}

