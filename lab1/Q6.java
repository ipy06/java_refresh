import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator!!!");
        System.out.println("Enter your 10 grades:");
        double[] grades = new double[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextDouble();
        }
        sc.close();
        double average = calculateAverage(grades);
        double median = calculateMedian(grades);
        double numFailed = calculateNumberFailed(grades);
        double numPassed = calculateNumberPassed(grades);
        System.out.println("Your average grade is: " + average);
        System.out.println("Your median grade is: " + median);
        System.out.println("Number of grades failed: " + numFailed);
        System.out.println("Number of grades passed: " + numPassed);

	}

	public static double calculateAverage(double[] notes){
		//your code here
        double sum = 0;

        for (double d : notes) {
            sum += d;
        }

        return sum / notes.length;
	}

	public static double calculateMedian(double[] notes){
		//your code here
        Arrays.sort(notes);

        return (notes[4] + notes[5]) / 2;
	}

	public static int calculateNumberFailed(double[] notes){
		//your code here
        int count = 0;
        for (double d : notes) {
            if (d < 50) {
                count++;
            }
        }
        return count;
	}
    
	public static int calculateNumberPassed(double[] notes){
        //your code here
        int count = 0;
        for (double d : notes) {
            if (d > 50) {
                count++;
            }
        }
        return count;
	}
}
