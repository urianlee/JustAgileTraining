package justagilehomework;

import static org.testng.AssertJUnit.assertEquals;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import justagilehomework.Stringmanip;
import justagilehomework.Calc;

public class week2homework {
	Scanner input = new Scanner(System.in);
	// EXERCISE 1
	public void exercise1() {
		System.out.println("\n1)\n");
		System.out.println("Hello");
		System.out.println("Urian Lee");
	}
	
	// EXERCISE 2
	public void exercise2(int numA, int numB) {
		System.out.println("\n2)\n");
		System.out.println("Test Data: ");
		System.out.println(numA+" + "+numB);
		System.out.println("Expected Output: ");
		System.out.println(numA + numB);
	}
	
	// EXERCISE 3
	public void exercise3() {
		System.out.println("\n3)\n");
		int a = -5 + 8 * 6;
		System.out.println("a. -5 + 8 * 6 = "+a);
		int b = (55+9) % 9;
		System.out.println("b. (55+9) % 9 = "+b);
		int c = 20 + -3*5 / 8;
		System.out.println("c. 20 + -3 * 5 / 8"+c);
		int d = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3"+d);
	}
	
	// EXERCISE 4
	public void exercise4(int a, int b) {
		System.out.println("\n4)\n");
		System.out.println("Test Data: ");
		System.out.println("Input first number: "+a);
		System.out.println("Input second number: "+b);
		System.out.println("Expected Output: ");
		// addition
		int sum = a + b;
		System.out.println(a+" + "+b+" = "+sum);
		// multiply
		int product = a * b;
		System.out.println(a+" * "+b+" = "+product);
		// subtract
		int difference = a - b;
		System.out.println(a+" - "+b+" = "+difference);
		// divide
		int quotient = a / b;
		System.out.println(a+" / "+b+" = "+quotient);
		// remainder
		int remainder = a % b;
		System.out.println(a+" mod "+b+" = "+remainder);
	}
	
	// EXERCISE 5
	public void exercise5() {
		System.out.println("\n5)\n");
		System.out.println("Test Data: ");
		System.out.println("------------------USER INPUT NEEDED--------------------");
		System.out.println("Please Enter a Number to make a Multiplication Table:");
		int number = input.nextInt();
		System.out.println("Expected Output: ");
		for(int i=1; i<11; i++) {
			int product = number * i;
			System.out.println(number+" x "+i+" = "+product);
		}
	}
	
	// EXERCISE 6
	public void exercise6() {
		System.out.println("\n6)\n");
		String divisible3 = "";
		String divisible5 = "";
		String divisibleBoth = "";
		for(int i=1; i<101; i++) {
			Integer current = new Integer(i);
			if(i%3==0 && i%5==0) divisibleBoth += current.toString() + ", ";
			else if(i%5==0) divisible5 += current.toString() + ", ";
			else if(i%3==0) divisible3 += current.toString() + ", ";
		}
		System.out.println("Numbers divisible by 3: ");
		System.out.println(divisible3);
		System.out.println("Numbers divisible by 5: ");
		System.out.println(divisible5);
		System.out.println("Numbers divisible by BOTH: ");
		System.out.println(divisibleBoth);
	}
	
	// EXERCISE 7
	public void exercise7(int k) {
		System.out.println("\n7)\n");
		int loopCounter = k;
		int[] givenArray = {1, 4, 17, 7, 25, 3, 100};
		ArrayList<Integer> allElements = new ArrayList<Integer>();
		ArrayList<Integer> largestElements = new ArrayList<Integer>();
		for(int i: givenArray) {
			Integer number = new Integer(i);
			allElements.add(number);
		}
		Integer currentMax = allElements.get(0);
		System.out.println(k+" largest elements of the said array are: ");
		while(loopCounter > 0) {
			for(Integer iterator: allElements) {	
				boolean alreadyExists = largestElements.contains(iterator);
				if(!alreadyExists) {
					if(iterator > currentMax) currentMax = iterator;
				}
			}
			largestElements.add(currentMax);
			//CLEAR MAX
			currentMax = allElements.get(0);
			loopCounter--;
		}
		String answer = "";
		for(Integer Iterator: largestElements) {
			answer += Iterator + " ";
		}
		System.out.println(answer);
	}
	
	// EXERCISE 8
	public void exercise8() {
		System.out.println("\n8)\n");
		System.out.println("Test Data: ");
		System.out.println("------------------USER INPUT NEEDED--------------------");
		System.out.println("Input temperature degrees in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Expected Output");
		System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+" degrees Celsius");
	}
	
	// EXERCISE 9
	public void exercise9() {
		System.out.println("\n9)\n");
		System.out.println("------------------USER INPUT NEEDED--------------------");
		System.out.println("Enter month number: ");
		int monthNumber = input.nextInt();
		System.out.println("Enter year number: ");
		int yearNumber = input.nextInt();
		System.out.println("monthNumber: "+monthNumber+", yearNumber: "+yearNumber);
		YearMonth ymObj = YearMonth.of(yearNumber, monthNumber);
		int daysInMonth = ymObj.lengthOfMonth();
		String monthName = "";
		switch(monthNumber) {
		case 1:
			monthName = "January";
		case 2:
			monthName = "February";
		case 3: 
			monthName = "March";
		case 4:
			monthName = "April";
		case 5:
			monthName = "May";
		case 6:
			monthName = "June";
		case 7:
			monthName = "July";
		case 8:
			monthName = "August";
		case 9: 
			monthName = "September";
		case 10:
			monthName = "October";
		case 11:
			monthName = "November";
		case 12:
			monthName = "December";
		}
		String output = monthName+" "+yearNumber+" has "+daysInMonth+" days!";
		System.out.println(output);
	}
	
	// Exercise 10
	public void exercise10() {
		System.out.println("\n10)\n");
		int[] numArray = {6, 9, 3, 4, 1, 7, 8, 2, 5};
		String[] strArray = {"a", "f", "S", "k", "L", ";"};
		System.out.println("Given number array: ");
		System.out.println(Arrays.toString(numArray));
		System.out.println("Given string array: ");
		System.out.println(Arrays.toString(strArray));
		Arrays.sort(numArray);
		Arrays.sort(strArray);
		System.out.println("Sorted number array: ");
		System.out.println(Arrays.toString(numArray));
		System.out.println("Sorted string array: ");
		System.out.println(Arrays.toString(strArray));
	}
	
	// Exercise 11
	public void exercise11() {
		System.out.println("\n11)\n");
		int[] numArray = {6, 9, 3, 4, 1, 7, 8, 2, 5};
		System.out.println("Given number array: ");
		System.out.println(Arrays.toString(numArray));
		int max = numArray[0];
		int min = numArray[0];
		for(int itor: numArray) {
			if (itor > max) max = itor;
			if (itor < min) min = itor;
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
	
	// Exercise 12
	public void exercise12() {
		System.out.println("\n12)\n");
		String givenString = new String("example.com");
		StringBuffer sb1 = new StringBuffer("example.com");
		StringBuffer sb2 = new StringBuffer("Example.com");
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		boolean compare1 = givenString.equals(s1);
		boolean compare2 = givenString.equals(s2);
		System.out.println("Comparing "+givenString+" and "+sb1+": "+compare1);
		System.out.println("Comparing "+givenString+" and "+sb2+": "+compare2);
	}
	
	// EXERCISE 13
	public void exercise13() {
		// get current month, year
		LocalDate today = LocalDate.now();
		Month thisMonth = today.getMonth();
		int monthNumber = today.getMonthValue();
		// get length of month
		int monthLength = thisMonth.length(false);
		// get max length of month
		int monthMaxLength = thisMonth.maxLength();
		// get first month of quarter
		Month fmoq = thisMonth.firstMonthOfQuarter();
		String fmoqName = fmoq.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		System.out.println("\n13)\n");
		System.out.println("Integer value of the current month: "+monthNumber);
		System.out.println("Length of the month: "+monthLength);
		System.out.println("Maximum length of the month "+monthMaxLength);
		System.out.println("First Month of the Quarter: "+fmoqName);
	}
	
	// EXERCISE 14
	public void exercise14() {
		System.out.println("\n14\n");
		System.out.println("Test Data: ");
		System.out.println("------------------USER INPUT NEEDED--------------------");
		System.out.println("Input string to count vowels: ");
		String inputString = input.next();
		String vowels = "aeiou";
		int vowelCount = 0;
		for(char c: inputString.toCharArray()) {
			String singleChar = String.valueOf(c);
			if(vowels.contains(singleChar)) vowelCount++;
		}
		System.out.println("Number of vowels in the string: "+vowelCount);
	}
	
	// EXERCISE 15
	public void exercise15() {
		System.out.println("\n15\n");
		System.out.println("------------------USER INPUT NEEDED--------------------");
		System.out.println("Input the string to count words in sentence: ");
		String sentence = input.nextLine();
		System.out.println("Expected Output: ");
		int wordCount = sentence.split(" ").length;
		System.out.println("Number of words in the string: "+wordCount);
	}
	
	// EXERCISE 16
	public void exercise16() {
		System.out.println("\n16\n");
		// Get list of all files/directory names from c://Documents
		File DIR_Documents = new File("D:\\OneDrive\\Documents");
		String[] pathnames = DIR_Documents.list();
		for(String item: pathnames) {
			System.out.println(item);
		}
	}
	
	// EXERCISE 17
	public void exercise17() {
		System.out.println("\n17\n");
		String fileName = "temp.txt";
		// WRITE
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello World !");
			bw.close();
		}
		catch(IOException ex) {
			System.out.println("Error writing to file '"+fileName+"'");
			ex.printStackTrace();
		}
		// READ
		String line = null;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	// EXERCISE 18
	public void exercise18() {
		System.out.println("\n18\n");
		ArrayList<String> TEMP = new ArrayList<String>(Arrays.asList("A", "b", "C", "d"));
		for (String letter: TEMP) {
			System.out.println("ELEMENT ITERATED: "+letter);
		}
	}
	
	// EXERCISE 19
	public void exercise19() {
		System.out.println("\n19\n");
		Hashtable<Integer, String> HT1 = new Hashtable<Integer, String>();
		HT1.put(7, "And");
		HT1.put(8, "Hello");
		HT1.put(3, "No");
		Set<Integer> keys = HT1.keySet();
		Iterator<Integer> itor = keys.iterator();
		while(itor.hasNext()) {
			System.out.println(itor+", "+HT1.get(itor));
		}
	}
	
	// EXERCISE 20
	public int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i=0; i < n-1; i++) {
			for (int j=0; j<n-1-i; j++) {
				if(arr[j] > arr[i]) {
					// swap 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public void exercise20() {
		System.out.println("\n20\n");
		int[] array = {5, 8, 2, 9, 4, 3};
		System.out.println(bubbleSort(array));
	}
	
	// EXERCISE 21
	public int binarySearch(int[] arr, int l, int r, int x) {
		int a = 0;
		if(r >= 1) {
			int mid = 1 + (r - 1) / 2;
			if(arr[mid] ==x) return mid;
			if(arr[mid] > x) return binarySearch(arr, 1, mid - 1, x);
			if(arr[mid] < x) return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
	public void exercise21() {
		System.out.println("\n21\n");
		int[] temp = {13, 8, 4, 0, 23, 5, 99};
		int key = 23;
		int n = temp.length;
		Arrays.sort(temp);
		int res = binarySearch(temp, 0, n-1, key);
		System.out.println("Found: "+res);
	}
	
	// EXERCISE 22
	public void exercise22() {
		System.out.println("\n22\n");
		int key = 5;
		boolean found = false;
		int[] temp = {13, 8, 4, 0, 23, 5, 99};
		for(int itor: temp) {
			if (itor == key) found = true;
		}
		if (found) System.out.println("Match found!");
	}
		
	// EXERCISE 23
	public static int fib(int n) {
		if(n <= 1) return n;
		return fib(n-1) + fib(n-2);
	}
	public void exercise23() {
		System.out.println("\n23\n");
		assertEquals(0, fib(0));
		assertEquals(1, fib(1));
		assertEquals(1, fib(2));
		assertEquals(2, fib(3));
		assertEquals(3, fib(4));
		assertEquals(5, fib(5));
		assertEquals(8, fib(6));
		assertEquals(13, fib(7));
	}
		
	// EXERCISE 24
	public void exercise24() {
		System.out.println("\n24\n");
		Stringmanip testObj = new Stringmanip("hello world !");
		assertEquals("HELLO WORLD !", testObj.upperCase());
	}
	
	// EXERCISE 25
	public void exercise25() {
		System.out.println("\n25\n");
		Calc testObj = new Calc();
		assertEquals(10, testObj.add(2,  8));
		assertEquals(14, testObj.sub(28, 14));
	}
	
	
	public void runAllExercises() {
		exercise1();
		exercise2(74, 36);
		exercise3();
		exercise4(125, 24);
		exercise5(); // USER INPUT NEEDED
		exercise6();
		exercise7(3);
		exercise8(); // USER INPUT NEEDED
		exercise9(); // USER INPUT NEEDED
		exercise10();
		exercise11();
		exercise12();
		exercise13();
		exercise14(); // USER INPUT NEEDED
		exercise15(); // USER INPUT NEEDED
		exercise16();
		exercise17();
		exercise18();
		exercise19();
		exercise20();
		exercise21();
		exercise22();
		exercise23();
		exercise24();
		exercise25();
		System.out.println("-------------------END OF OUTPUT--------------------------");
	}
	public static void main(String[] args) {
		week2homework runner = new week2homework();
		//runner.runAllExercises();
		runner.exercise17();
	}

}
