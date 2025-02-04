package org.example;

import java.util.HashSet;
import java.util.Set;

public class NoDuplicate {
    public static Set<String> antiduplicate(String[] collection) {
        Set<String> noDuplicates = new HashSet<>();
        int size = 0;
        for (int i = 0; i < collection.length; i++) {
            int num = 0;
            noDuplicates.add(collection[i]);
            if (size < noDuplicates.size()) {
                size = noDuplicates.size();
                for (int j = 0; j < collection.length; j++) {
                    if (collection[i].equals(collection[j])) {
                        num++;
                    }
                }
                System.out.println("Слово " + collection[i] + " повторяется " + num + " раз(а).");
            }
        }
        return noDuplicates;
    }
}
