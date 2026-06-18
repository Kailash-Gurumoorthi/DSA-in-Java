import java.util.ArrayList;
import java.util.List;

public class exam {
    public static void main(String[] args) {
        /* int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        // 1. Start with the empty subset
        result.add(new ArrayList<>());

        // 2. Iterate through each number in the input array
        for (int num : nums) {
            int currentSize = result.size();

            // 3. For each existing subset, create a new one by adding 'num'
            for (int i = 0; i < currentSize; i++) {
                // Create a copy of the existing subset
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                // Add the current number to the copy
                newSubset.add(num);
                // Add the new subset to our result list
                result.add(newSubset);
            }
        }

        // 4. Print the output exactly as shown in the screenshot
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    } */
        String str = "ABC";
        permute(str, "");
}
/*
import java.util.ArrayList;
import java.util.List;

public class exam {
    public static void main(String[] args) {
        // Let's create a source list with some data
        List<String> source = new ArrayList<>();
        source.add("A");
        source.add("B");

        // --- CONSTRUCTOR 1: PASSING A COLLECTION ---
        // This is what you use in your subset program.
        // It creates a NEW list and COPIES "A" and "B" into it.
        List<String> listFromCollection = new ArrayList<>(source);

        // --- CONSTRUCTOR 2: PASSING AN INTEGER ---
        // This is what you were asking about with (1).
        // It creates an EMPTY list but tells the computer:
        // "Reserve memory for 100 items because I'm going to add a lot later."
        List<String> listFromInteger = new ArrayList<>(1);
        listFromInteger.add("a");
        listFromInteger.add(" ");

        System.out.println("--- Results ---");
        System.out.println("List from Collection: " + listFromCollection);
        System.out.println("Size of listFromCollection: " + listFromCollection.size());

        System.out.println("\nList from Integer: " + listFromInteger);
        System.out.println("get  " + listFromInteger.get(1));
    } */

    private static void permute(String str, String result) {
        // GOAL: If no letters left to pick, we found a solution
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // 1. CHOICE: Pick a character
            char ch = str.charAt(i);

            // Remaining string after picking 'ch'
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // 2. EXPLORE: Recurse with the remaining letters
            permute(remaining, result + ch);

            // 3. BACKTRACK: (In this specific String example, the
            // "backtrack" happens naturally because 'result' is a
            // local variable that doesn't change for the next loop iteration.)
        }
    }
}

