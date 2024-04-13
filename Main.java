/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Build Array from Permutation");

        Solution solution = new Solution();

        String[] operations1 = {"--X","X++","X++"};
        int count1 = solution.finalValueAfterOperations(operations1);
        System.out.println("Count = " + count1);

        String[] operations2 = {"++X","++X","X++"};
        int count2 = solution.finalValueAfterOperations(operations2);
        System.out.println("Count = " + count2);

    }
}


