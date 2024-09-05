/*

 * Q3_ReverseSortDemo
 * 
 * JDK 21
 *
 * Mon Aug 26
 * 
 * @Hezekiah Shobayo
 */

public class Q3_ReverseSortDemo {

    public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.print(unorderedLetters[i]);
	}

	//method that sorts a char array into its reverse alphabetical order
	public static void reverseSort(char[] values){
        int argMax;
        char temp;
        for (int i = values.length - 1; i >= 0; i--){
            argMax = i;
            for (int j = i -1; j >=0; j--){
                if (values[j] < values[argMax]){
                    argMax = j;
                }
            }
            temp = values[i];
            values[i] = values[argMax];
            values[argMax] = temp;
        }
	}
}