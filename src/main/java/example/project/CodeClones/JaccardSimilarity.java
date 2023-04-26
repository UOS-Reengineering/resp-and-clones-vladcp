package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // TODO: implement this function to compute the Jaccard similarity between two string arrays
        Set<String> res = new HashSet<>(set1);
        res.retainAll(set2);
        double j1 = res.size();

        double j2 = set1.size() + set2.size() - j1;
        System.out.println(j1 + " " + j2);
        return j1 / j2;
    }

}
