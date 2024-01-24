package unibuc.TSS_Proiect;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TssProiectApplication_Mutant_2 {

	public static void main(String[] args) throws InvalidInputException {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();

		System.out.println("Introduceti intre 1 si 3 numere separate prin spatiu:");
		String input = scanner.nextLine();
		String[] numStrings = input.split(" ");

		for (String s : numStrings) {
			try {
				int num = Integer.parseInt(s);
				numbers.add(num);
			} catch (NumberFormatException e) {
				throw new InvalidInputException("Input invalid. Introduceti numere valide.");
			}
		}

		System.out.println(checkNumbers(numbers));
	}


	public static boolean isValidList(List<Integer> numbers) {
		return numbers.size() >= 1 && numbers.size() <= 3;
	}

	public static boolean hasSumGreater(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		//modified this
		return sum >= 30103;
	}

	public static String checkNumbers(List<Integer> numbers) {
		StringBuilder result = new StringBuilder();
		if (isValidList(numbers) && hasSumGreater(numbers)) {
			for (int num : numbers) {
				boolean isPalindrome = isPalindrome(num);
				boolean hasPrimeSum = hasPrimeSumOfDigits(num);
				if (isPalindrome && hasPrimeSum) {
					result.append("DA, ");
				} else {
					result.append("NU, ");
				}
			}
			if (result.toString().contains("NU")) {
				return "Conditie partial indeplinita";
			} else {
				return result.toString().substring(0, result.length() - 2);
			}
		} else {
			return "Conditii neindeplinite";
		}

	}

	public static boolean isPalindrome(int n) {
		int originalN = n;
		int reversedN = 0;
		while (n > 0) {
			int digit = n % 10;
			reversedN = reversedN * 10 + digit;
			n /= 10;
		}
		return originalN == reversedN;
	}

	public static boolean hasPrimeSumOfDigits(int n) {
//		int sum = 0;
//		while (n > 0) {
//			sum += n % 10;
//			n /= 10;
//		}
//		return isPrime(sum);
		//modifiend this
		return false;
	}


	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
