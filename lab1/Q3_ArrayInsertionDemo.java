public class Q3_ArrayInsertionDemo {
    
    public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		// Your code here
        int[] newArray = new int[beforeArray.length + 1];

        for (int i = 0; i < newArray.length; i++){
            if (i < indexToInsert) {
                newArray[i] = beforeArray[i];
            }
            else if (i == indexToInsert){
                newArray[i] = valueToInsert;
            }
            else {
                newArray[i] = beforeArray[i - 1];
           }
        }

        return newArray;
	}

	public static void main(String[] args){
		// Your code here
        int[] array = {1, 5, 4, 7, 9, 6};
        int index = 3;
        int value = 15;
        
        System.out.println("Array before insertion:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        int[] newArray = insertIntoArray(array, index, value);
        
        System.out.println("Array after insertion of " + value + " at position " + index + ":");
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
	}
    
}
