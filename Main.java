package CALCULATOR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CalculatorException {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputParts = input.split(" ");

        if (inputParts.length > 3) { throw new CalculatorException("Формат математической операции не удовлетворяет заданию."); }
        if (inputParts.length < 3) { throw new CalculatorException("Строка не является математической операцией."); }

        String[][] numbers = {{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                               "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                               "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                               "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
                               "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
                               "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
                               "61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
                               "71", "72", "73", "74", "75", "76", "77", "78", "79", "80",
                               "81", "82", "83", "84", "85", "86", "87", "88", "89", "90",
                               "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" },
                                    { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                                      "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                                      "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                                      "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                                      "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                                      "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                                      "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                                      "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                                      "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                                      "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C" }};

        int resultSwitcher1 = 0;
        int resultSwitcher2 = 0;

        switch (inputParts[0]) {
            case "I":
                inputParts[0] = "1";
                resultSwitcher1 = 1;
                break;
            case "II":
                inputParts[0] = "2";
                resultSwitcher1 = 1;
                break;
            case "III":
                inputParts[0] = "3";
                resultSwitcher1 = 1;
                break;
            case "IV":
                inputParts[0] = "4";
                resultSwitcher1 = 1;
                break;
            case "V":
                inputParts[0] = "5";
                resultSwitcher1 = 1;
                break;
            case "VI":
                inputParts[0] = "6";
                resultSwitcher1 = 1;
                break;
            case "VII":
                inputParts[0] = "7";
                resultSwitcher1 = 1;
                break;
            case "VIII":
                inputParts[0] = "8";
                resultSwitcher1 = 1;
                break;
            case "IX":
                inputParts[0] = "9";
                resultSwitcher1 = 1;
                break;
            case "X":
                inputParts[0] = "10";
                resultSwitcher1 = 1;
                break;
        }

        switch (inputParts[2]) {
            case "I":
                inputParts[2] = "1";
                resultSwitcher2 = 1;
                break;
            case "II":
                inputParts[2] = "2";
                resultSwitcher2 = 1;
                break;
            case "III":
                inputParts[2] = "3";
                resultSwitcher2 = 1;
                break;
            case "IV":
                inputParts[2] = "4";
                resultSwitcher2 = 1;
                break;
            case "V":
                inputParts[2] = "5";
                resultSwitcher2 = 1;
                break;
            case "VI":
                inputParts[2] = "6";
                resultSwitcher2 = 1;
                break;
            case "VII":
                inputParts[2] = "7";
                resultSwitcher2 = 1;
                break;
            case "VIII":
                inputParts[2] = "8";
                resultSwitcher2 = 1;
                break;
            case "IX":
                inputParts[2] = "9";
                resultSwitcher2 = 1;
                break;
            case "X":
                inputParts[2] = "10";
                resultSwitcher2 = 1;
                break;
        }

        int a = Integer.parseInt(inputParts[0]);
        int b = Integer.parseInt(inputParts[2]);
        int x;
        int i = 0;

        if (a > 10 || b > 10) { throw new CalculatorException("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более."); }
        if (resultSwitcher1 == 1) { throw new CalculatorException("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно."); }

        switch (inputParts[1]) {
            case "+":
                x = a + b;
                if (resultSwitcher1 + resultSwitcher2 == 2) {
                    while(x != Integer.parseInt(numbers[0][i])) {
                        i++;
                    }
                    System.out.println("Результат: " + numbers[1][i]);
                } else { System.out.println("Результат: " + x); }
                break;
            case "-":
                x = a - b;
                if (resultSwitcher1 + resultSwitcher2 == 2) {
                    while(x != Integer.parseInt(numbers[0][i])) {
                        i++;
                    }
                    System.out.println("Результат: " + numbers[1][i]);
                } else { System.out.println("Результат: " + x); }
                break;
            case "*":
                x = a * b;
                if (resultSwitcher1 + resultSwitcher2 == 2) {
                    while(x != Integer.parseInt(numbers[0][i])) {
                        i++;
                    }
                    System.out.println("Результат: " + numbers[1][i]);
                } else { System.out.println("Результат: " + x); }
                break;
            case "/":
                x = a / b;
                if (resultSwitcher1 + resultSwitcher2 == 2) {
                    while(x != Integer.parseInt(numbers[0][i])) {
                        i++;
                    }
                    System.out.println("Результат: " + numbers[1][i]);
                } else { System.out.println("Результат: " + x); }
                break;
        }
    }
}

class CalculatorException extends Exception{
    CalculatorException(String message) {
        super(message);
    }
}



