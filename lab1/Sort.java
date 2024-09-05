public class Sort {
    // Writing a Selection Sort Function
    public static void sort(int[] xs){
        // Declare the variables iterators, minimumIndex, tmp
        int i, j, argMin, tmp;
        // Iterate through the array
        for (i = 0; i < xs.length; i++) {
            // Assume the current element is the smallest
            argMin = i;
            // Iterate through the rest of the array
            for (j = i + 1; j < xs.length; j++) {
                // If we find a smaller element, update the minimum index
                if (xs[j] < xs[argMin]) {
                    argMin = j;
                }
            }
            // Swap the smallest element with the current element
            tmp = xs[argMin];
            xs[argMin] = xs[i];
            xs[i] = tmp;
        }
    }
        

    public static void main(String[] args) {
        int[] xs = {5, 2, 8, 3, 1, 6, 4};
        sort(xs);
        for (int i = 0; i < xs.length; i++) {
            System.out.print(xs[i] + " ");
        }

    }
}
