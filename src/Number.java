import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number (<999): ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0: System.out.println("zero");
                    break;
                case 1: System.out.println("one");
                    break;
                case 2: System.out.println("two");
                    break;
                case 3: System.out.println("three");
                    break;
                case 4: System.out.println("four");
                    break;
                case 5: System.out.println("five");
                    break;
                case 6: System.out.println("six");
                    break;
                case 7: System.out.println("seven");
                    break;
                case 8: System.out.println("eight");
                    break;
                case 9: System.out.println("nine");
                    break;
                case 10: System.out.println("ten");
                    break;
                case 11: System.out.println("eleven");
                    break;
                case 12: System.out.println("twelve");
                    break;
                case 13: System.out.println("thirteen");
                    break;
                case 14: System.out.println("fourteen");
                    break;
                case 15: System.out.println("fifteen");
                    break;
                case 16: System.out.println("sixteen");
                    break;
                case 17: System.out.println("seventeen");
                    break;
                case 18: System.out.println("eighteen");
                    break;
                case 19: System.out.println("nineteen");
                    break;
            }
        }
         else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int units = number % 10;
            String tensStr = "";
            String unitsStr = "";
            switch (tens) {
                case 2: tensStr = "twenty";
                        break;
                case 3: tensStr = "thirty";
                        break;
                case 4: tensStr = "forty";
                        break;
                case 5: tensStr = "fifty";
                        break;
                case 6: tensStr = "sixty";
                        break;
                case 7: tensStr = "seventy";
                        break;
                case 8: tensStr = "eighty";
                        break;
                case 9: tensStr = "ninety";
                        break;
            }

            if (units > 0) {
                switch (units) {
                    case 1: unitsStr = "one";
                            break;
                    case 2: unitsStr = "two";
                            break;
                    case 3: unitsStr = "three";
                            break;
                    case 4: unitsStr = "four";
                            break;
                    case 5: unitsStr = "five";
                            break;
                    case 6: unitsStr = "six";
                            break;
                    case 7: unitsStr = "seven";
                            break;
                    case 8: unitsStr = "eight";
                            break;
                    case 9: unitsStr = "nine";
                            break;
                }
                System.out.println(tensStr + " " + unitsStr);
            } else {
                System.out.println(tensStr);
            }
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            String hundredsStr = "";
            String remainderStr = "";

            switch (hundreds) {
                case 1: hundredsStr = "one hundred";
                        break;
                case 2: hundredsStr = "two hundred";
                        break;
                case 3: hundredsStr = "three hundred";
                        break;
                case 4: hundredsStr = "four hundred";
                        break;
                case 5: hundredsStr = "five hundred";
                        break;
                case 6: hundredsStr = "six hundred";
                        break;
                case 7: hundredsStr = "seven hundred";
                        break;
                case 8: hundredsStr = "eight hundred";
                        break;
                case 9: hundredsStr = "nine hundred";
                        break;
            }

            if (remainder >= 10 && remainder < 20) {
                switch (remainder) {
                    case 10: remainderStr = "ten";
                            break;
                    case 11: remainderStr = "eleven";
                            break;
                    case 12: remainderStr = "twelve";
                            break;
                    case 13: remainderStr = "thirteen";
                            break;
                    case 14: remainderStr = "fourteen";
                            break;
                    case 15: remainderStr = "fifteen";
                            break;
                    case 16: remainderStr = "sixteen";
                            break;
                    case 17: remainderStr = "seventeen";
                            break;
                    case 18: remainderStr = "eighteen";
                            break;
                    case 19: remainderStr = "nineteen";
                            break;
                }
            } else if (remainder >= 20) {
                int tens = remainder / 10;
                int units = remainder % 10;
                String tensStr = "";
                String unitsStr = "";

                switch (tens) {
                    case 2: tensStr = "twenty";
                            break;
                    case 3: tensStr = "thirty";
                            break;
                    case 4: tensStr = "forty";
                            break;
                    case 5: tensStr = "fifty";
                            break;
                    case 6: tensStr = "sixty";
                            break;
                    case 7: tensStr = "seventy";
                            break;
                    case 8: tensStr = "eighty";
                            break;
                    case 9: tensStr = "ninety";
                            break;
                }

                if (units > 0) {
                    switch (units) {
                        case 1: unitsStr = "one";
                                break;
                        case 2: unitsStr = "two";
                                break;
                        case 3: unitsStr = "three";
                                break;
                        case 4: unitsStr = "four";
                                break;
                        case 5: unitsStr = "five";
                                break;
                        case 6: unitsStr = "six";
                                break;
                        case 7: unitsStr = "seven";
                                break;
                        case 8: unitsStr = "eight";
                                break;
                        case 9: unitsStr = "nine";
                                break;
                    }
                    remainderStr = tensStr + " " + unitsStr;
                } else {
                    remainderStr = tensStr;
                }
            } else if (remainder > 0) {
                switch (remainder) {
                    case 1: remainderStr = "one";
                            break;
                    case 2: remainderStr = "two";
                            break;
                    case 3: remainderStr = "three";
                            break;
                    case 4: remainderStr = "four";
                            break;
                    case 5: remainderStr = "five";
                            break;
                    case 6: remainderStr = "six";
                            break;
                    case 7: remainderStr = "seven";
                            break;
                    case 8: remainderStr = "eight";
                            break;
                    case 9: remainderStr = "nine";
                            break;
                }
            }

            if (remainder > 0) {
                System.out.println(hundredsStr + " and " + remainderStr);
            } else {
                System.out.println(hundredsStr);
            }
        } else {
            System.out.println("out of ability");
        }

        scanner.close();
    }
}
