package org.example;

import java.util.HashSet;
import java.util.Set;

public class NoDuplicate {
    public static Set<String> antiduplicate(String[] collection) {
        Set<String> noDuplicates = new HashSet<>();
        int size = 0;
        int num = 0;
        for (int i = 0; i < collection.length; i++) {
            noDuplicates.add(collection[i]);
            if (size < noDuplicates.size()) {
                size = noDuplicates.size();
            } else num++;
        }
        System.out.println(num + " - количество дублированных слов");
        return noDuplicates;
    }
}
