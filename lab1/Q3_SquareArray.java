public class Q3_SquareArray {
    
    public static int[] createArray(int size) {
        int[] newArray = new int[size+1];
        for (int i = 0; i < size+1; i++){
            newArray[i] = i*i;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = createArray(12);
        for (int i = 0; i < array.length; i++) {
            System.out.println("The square of " + i + " is: " + array[i]);
        }
    }
}
