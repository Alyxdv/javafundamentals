package com.fundamentals.labs;

public class ArraysLab {

    public void taskOne() { // done! whoo!
        String[] flavors = new String[10];
        flavors[0] = "Moosetracks";
        flavors[1] = "Cookies and Cream";
        flavors[2] = "Chocolate Chip Cookie Dough";
        flavors[3] = "Lavender Honey";
        flavors[4] = "Green tea";
        flavors[5] = "Vanilla Bean";
        flavors[6] = "Strawberry";
        flavors[7] = "Chocolate";
        flavors[8] = "Neapolitan";
        flavors[9] = "Strawberry Cheesecake";

        for (String flavor : flavors) {
            System.out.println(flavor);
        }
    }

    public void taskTwo() { // Not done.
        int[][] myScores ={{26,40},{10, 28}, {33, 28}, {30, 34},
                {13, 19}, {24, 31}, {6, 30}, {24, 31}, {26, 23},
                {35, 32}, {24, 17}, {40, 9}, {16, 23}, {23, 3}, {3, 26}, {31, 21}};
        for (int i = 0; i < myScores.length; i++) {
            for (int j = 0; j < myScores[i].length; j++) {
                System.out.print(myScores[i][j]);
                System.out.println();
            }
        }
    }

}
   /* public void basicTwoDimensionalArray() {
        int[][] myArray = {{23, 45}, {35,46}, {57,98}, {32, 48}};
        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.println("[" + i+ "]" +"["+j+"]" +" = " + myArray[i][j]); //includes location
            } // end inner for
        } // end outer for
    } // end method */