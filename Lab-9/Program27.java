/*
27. WAP in Java to create a user-defined package with the following case:
    Case - a drive contains main class and folder p1. p1 folder contains CSE class and folder p2. p2 folder contains BWU class.
 */

import p1.CSE;
import p1.p2.BWU;

public class Program27 {
    public static void main(String[] args) {
        CSE cse = new CSE();
        BWU bwu = new BWU();

        cse.display();
        bwu.display();
    }
}
