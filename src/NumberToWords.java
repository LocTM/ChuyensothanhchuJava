import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số cần đọc
        System.out.print("Nhập số cần đọc (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        // Bước 2: Đọc số
        readNumber(number);

        scanner.close();
    }

    static void readNumber(int number) {
        if (number >= 0 && number < 10) {
            System.out.print(readOneDigit(number));
        } else if (number < 20) {
            System.out.print(readTwoDigitsLessThanTwenty(number));
        } else if (number < 100) {
            readTwoDigits(number);
        } else if (number < 1000) {
            readThreeDigits(number);
        } else {
            System.out.println("Out of ability");
        }
    }

    static String readOneDigit(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "Invalid digit";
        }
    }

    static String readTwoDigitsLessThanTwenty(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "Invalid number";
        }
    }

    static void readTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;

        if (tens > 0) {
            switch (tens) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
                default:
                    System.out.print("Invalid tens");
                    break;
            }
        }

        if (ones > 0) {
            System.out.print(" " + readOneDigit(ones));
        }
    }

    static void readThreeDigits(int number) {
        int hundreds = number / 100;
        int remainingTwoDigits = number % 100;

        System.out.print(readOneDigit(hundreds) + " hundred");

        if (remainingTwoDigits > 0) {
            System.out.print(" and ");
            readTwoDigits(remainingTwoDigits);
        }

        System.out.println();
    }
}
