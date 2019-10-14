package sk.itsovy.dolinsky.other;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Martin Dolinsky
 */
public class FreeClass {

    public void sayHello() {
        System.out.print("Hello");
    }

    public void sayNHello(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("Hello.");
        }
        System.out.println();
    }

    public void sayHi() {
        System.out.println("Hi.");
    }


    public void sayNHi(int number) {
        int i = 1;
        while (i <= number) {
            sayHi();
            i++;
        }
        System.out.println();

    }

    // prijme cislo a zaokruhli ho na parne
    public int getEvenNumber(int number) {

        return (number % 2 == 0) ? number : number + 1; // ternarny operator
        /*
        if (number % 2 == 0) {
            int numberInt = (int) number;
            return numberInt;
        }
        else {
            number++;
            int numberInt = (int) number;
            return numberInt;
        }
        */
    }

    public double getLoan(int months, float rate, float amount) {
        return (amount * (rate / 100) + amount) / months;

    }


    public void homework() {

        System.out.println("1. Numbers divisible by 615: ");
        for (int i = 1000; i < 9999; i++) {
            if (i % 615 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("2. 3-digit numbers where digits are from Z - A (like 321)");
        for (int i = 210; i < 987; i++) {
            int number3 = i % 10;
            int number2 = (i / 10) % 10;
            int number1 = (i / 100) % 10;
            if (number1 > number2 && number2 > number3) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("3. Sum of 2-digit number divisible by 3");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println();
        System.out.println("4. Divisor of 1 000 000");
        int count1 = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (1000000 % i == 0) {
                count1++;
            }

        }
        System.out.println(count1);

        System.out.println();
        System.out.println("5. Block dimensions: a = 45; b = 87; c = 37;");
        int a = 45;
        int b = 87;
        int c = 37;
        int area = 2 * (a * b + a * c + b * c);
        int volume = a * b * c;
        System.out.println("Area: " + area + " Volume: " + volume);

        System.out.println();
        System.out.println("6. Numbers from 10 to 2 with step = 0.5");
        for (double i = 10; i > 1.5; i = i - 0.5) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("7. Factorial of number 7");
        int factorial = 1;
        for (int i = 7; i > 0; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);

        System.out.println();
        System.out.println("8. 3 digit odd numbers divisible by 27 but not divisible by 13");
        for (int i = 101; i < 1000; i += 2) {
            if (i % 27 == 0 && i % 13 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("9. Multiples of 91 to 1 000 000");
        for (int i = 91; i < 1000000; i++) {
            if (i % 91 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("10. Palindrome numbers");

        for (int i = 10001; i < 99999; i++) {
            int number5 = i % 10;
            int number4 = (i / 10) % 10;
            int number3 = (i / 100) % 10;
            int number2 = (i / 1000) % 10;
            int number1 = (i / 10000) % 10;
            if (number1 == number5 && number2 == number4) {
                System.out.print(i + " ");
            }
        }


    }

    public void test() {
        System.out.println("2-digit numbers: ");
        for (int i = 10; i < 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("2-digit even: ");

        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("2-digit odd from Z to A: ");

        for (int i = 99; i > 10; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("3-digit not divisible by 11: ");

        for (int i = 100; i < 1000; i++) {
            if (i % 11 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("3-digit not divisible by but divided by 11: ");

        for (int i = 100; i < 1000; i++) {
            if (i % 11 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("2-digit divisible by 2 or 3");

        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("2-digit divisible by 2 or 3 but not divided by 10");

        for (int i = 10; i < 100; i++) {
            if ((i % 2 == 0 || i % 3 == 0) && i != 10) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("3-digit where digit sum is 10");

        for (int i = 109; i < 911; i++) {
            int number1 = i % 10;
            int number2 = (i / 10) % 10;
            int number3 = (i / 100) % 10;

            if (number1 + number2 + number3 == 10) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("3-digit where at least 2 digits are same");

        for (int i = 100; i < 1000; i++) {
            int number = i % 10;
            int number1 = (i / 10) % 10;
            int number2 = (i / 100) % 10;
            if (number == number1 || number == number2 || number2 == number1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("3-digit where only 2 digits are same");

        for (int i = 100; i < 1000; i++) {
            int number = i % 10;
            int number1 = (i / 10) % 10;
            int number2 = (i / 100) % 10;
            if (number == number1 && number != number2 || number == number2 && number != number1 || number1 == number2 && number != number1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("3-digit where are no digits same");

        for (int i = 100; i < 1000; i++) {
            int number = i % 10;
            int number1 = (i / 10) % 10;
            int number2 = (i / 100) % 10;
            if (number != number1 && number != number2 && number1 != number2) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("How many beautiful numbers are.");

        int count = 0;
        for (int i = 1; i < 500; i++) {

            int number = i % 10;
            int number1 = (i / 10) % 10;
            int number2 = (i / 100) % 10;
            int numbers = (number1 + number + number2);
            if (i % 2 != 0 && numbers < 6) {

                count++;

            }

        }

        System.out.print(count);

        System.out.println();
        System.out.println();

        // 1, 2, 3, 5, 6, 10, 15, 29, 30, 58, 87, 145, 174, 290, 435, 870
        int count1 = 0;
        int number = 870;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count1++;
            }
        }
        System.out.println(count);


        System.out.println();
        System.out.println();

        for (int i = 1; i < 100000; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("TESTOVA ULOHA");

        for (int i = 1000; i <= 9999; i++) {
            int number1 = i % 10;
            int number2 = (i / 10) % 10;
            int number3 = (i / 100) % 10;
            int number4 = (i / 1000) % 10;

            if ((i % 12 == 0) && (number4 > number1) && (number2 % 2 == 0)) {
                System.out.print(i + " ");
            }

        }

        System.out.println();
        System.out.println("Kolko dni, hodin, minut a sekund");

        int time = 514623; //sekundy
        int days = time / (86400);
        time = time % 86400;
        int hours = time / 3600;
        time = time % 3600;
        int minutes = time / 60;
        int seconds = time % 60;
        System.out.print("Dni:" + days + " " + "Hodiny: " + hours + " " + "Minuty " + minutes + " " + "Seconds: " + seconds);


        System.out.println();
        System.out.println("Sum of numbers");
        int sum = 0;
        for (int i = 0; i < 159; i++) {
            sum += i;
        }
        System.out.print(sum);

        System.out.println();
        System.out.println("Sum of cents gotten per month");

        int sum1 = 0;
        int value = 1;
        for (int i = 1; i < 31; i++) {
            sum1 = sum1 + value;
            value = value * 2;
        }
        System.out.print(sum1 / 100.0);


        System.out.println();
        System.out.println("Sum of numbers like 1 + 1/2 + 1/3...1/100");

        double sum2 = 0;
        double value1 = 1;
        for (int i = 1; i < 100; i++) {
            value1 = (double) 1 / i;
            sum2 = sum2 + value1;
        }
        System.out.println(sum2);

        System.out.println();
        System.out.println();

        int nu = 10000;
        while (nu < 99999) {
            int number1 = nu % 10;
            int number2 = (nu / 10) % 10;
            int number3 = (nu / 100) % 10;
            int number4 = (nu / 1000) % 10;
            int number5 = (nu / 10000) % 10;
            if (number1 + number2 + number3 + number4 + number5 == 43) {
                System.out.println(nu);
            }
            nu++;
        }

        System.out.println();
        System.out.println();

        int m = 99999;
        int i = 10000;
        while (m % 613 != 0) {
            m--;
            if (m % 613 == 0) {
                System.out.println(m);
            }
        }

        int a = 6;
        int b = 8;
        while (b % a != 0) {
            b += 8;
        }
        System.out.println(b);


        System.out.println();
        System.out.println("Delitel");

        int a1 = 96;
        int b1 = 27;
        int temp = 0;

        if (a1 < b1) {
            temp = a1;
            a1 = b1;
            b1 = temp;
        }
        while (a1 % b1 != 0) {
            if (a1 < b1) {
                temp = a1;
                a1 = b1;
                b1 = temp;
            }
            temp = b1;
            b1 = a1 - b1;
            a1 = temp;

        }
        System.out.println(b1);


    }

    public void doWhile() {
        /**
         *      *****
         *      *****
         *      *****
         */
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /**
         *      *
         *      **
         *      ****
         */
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        /**
         *      ***
         *      **
         *      *
         */
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        /**
         *      *
         *     **
         *    ***
         */
        for (int row = 1; row <= 5; row++) { //rows
            for (int spaces = 1; spaces <= 5 - row; spaces++) { //spaces //vymazat 2 pre celu pyramidu
                System.out.print(" ");
            }
            for (int chars = 1; chars <= row; chars++) { //columns
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        /**
         *      ***
         *       **
         *        *
         */
        for (int row = 5; row >= 0; row--) { //rows
            for (int spaces = 1; spaces <= 5 - row; spaces++) { //spaces //vymazat 2 pre celu pyramidu
                System.out.print(" ");
            }
            for (int chars = 1; chars <= row; chars++) { //columns
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        /**
         *      *
         *     ***
         *    *****
         */
        int o = 5;
        for (int row = 1; row <= o; row++) {
            for (int space = o - 1; space >= row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println();


        /**
         *      *
         *     * *
         *    * * *
         */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

        System.out.println();

        /**
         *      ###
         *      # #
         *      ###
         */
        int size = 5;
        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= size; column++) {
                if (row == 1 || row == size || column == 1 || column == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        /**
         *      #####
         *      # # #
         *      #####
         */
        int size1 = 5;
        for (int row = 1; row <= size1; row++) {

            for (int column = 1; column <= size1 * 2; column++) {
                if (row == 1 || row == size1 || column == 1 || column == size1 || column == size1 * 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("Sum of digits of number:");
        int c = 82654139;
        int sum = 0;
        int i = 1;
        while (i < 10) {
            int s = c % 10;
            sum = sum + s;
            c = c / 10;
            i++;
        }
        System.out.println(sum);

        int c1 = 82654139;
        int sum1 = 0;
        do {
            int s = c1 % 10;
            sum1 = sum1 + s;
            c1 = c1 / 10;
            i++;
        } while (c1 > 0);
        System.out.println(sum1);


        int g = 99999;
        for (int j = 1; j < g; j++) {
            if (g % 613 != 0) {
                g--;
            }
        }
        System.out.println("G je: " + g);
    }

    public void getPyramideUpsideDown() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int row = n; row >= 1; row--) {
            for (int space = n - 1; space >= row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("%");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void getRandomNumber() {
        Random rnd = new Random();
        int a = rnd.nextInt(6) + 1;
        int b;
        int c;

        do {
            b = rnd.nextInt(6) + 1;
        } while (a == b);

        do {
            c = rnd.nextInt(6) + 1;
        } while (b == c || a == c);

        System.out.println(a + " " + b + " " + c);

    }



    /**
     * @author Martin Dolinsky
     * @date 11.10.2019
     * @param n length of the password
     * @param rules if true, then 6<length<31, minvar least one digit, upper, lower letter
     * @description
     */
    public String getRandomPassword(int n,boolean rules) {
        if (rules == true && n < 6 || n > 30)
            n = 10;
        Random rnd = new Random();
        String password = "";
        int countOfLetters = 0;
        int upper = 0;
        int lower = 0;
        int numbers = 0;
        int number = 0;
        if (rules == false) {
            numbers = upper = lower = 1;
        }

        do {
            int type = rnd.nextInt(3);
            switch (type) {
                case 0: number = rnd.nextInt(10) + 48; numbers++; break;
                case 1: number = rnd.nextInt(26) + 65; upper++; break;
                case 2: number = rnd.nextInt(26) + 97; lower++; break;
            }
            char c = (char) number;
            password += c;
            countOfLetters++;
            if (countOfLetters == n && (numbers == 0 || upper == 0 || lower == 0)) {
                countOfLetters = 0;
                upper = 0;
                lower = 0;
                numbers = 0;
                password = "";
            }


        } while (countOfLetters < n);

        return password;
    }


    /**
     * Random will be sum of results + 1
     * and plus starting number of interval
     *  <a;b> = (b-a+1) + a;
     */
    public void getRandomNumbers() {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int a = rnd.nextInt(26) + 97;
        int b = rnd.nextInt(10) + 48;
        int c = rnd.nextInt(101) + 100;
        int d = rnd.nextInt(21) + -10;
        int e = rnd.nextInt(4) + -1;
        int f = rnd.nextInt(503) + 113;


        int g = 5 * (rnd.nextInt(11));

        int h = 2 * (rnd.nextInt((45) + 5));

        int ch = 2 * (rnd.nextInt(45) + 5) + 1;

        int k = 11 * (rnd.nextInt(81) + 10); //10 90 90-10 + 1 = 81 + 10

        int l = (rnd.nextInt(9000)+1000); //1000;9999 9999 - 1000 + 1 = 9000 + 1000

        int prime;
        int div;

        do {
            prime = rnd.nextInt(4500) + 500;
            prime = 2 * prime + 1;
            div = 0;
            for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    div ++;
                }
            }
        } while (div > 0);
        System.out.println(prime);
        System.out.println();
    }

    // Display how many correct and incorrect answers you had and how long did it take
    public void Captcha() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Captcha");
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " test is ready!");
        int o;
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        Date start = new Date();
        long startTime = start.getTime();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ ".task");
            int m = rnd.nextInt(90) + 10;
            int n = rnd.nextInt(90) + 10;
            int p = rnd.nextInt(4);
            switch (p) {
                case 0 :
                case 1 :
                    System.out.print(m + " + " + n + " = ");

                    break;
                case 2 :
                    System.out.print(m + " - " + n + " = ");
                    break;
                case 3 :
                    System.out.print(m + " * " + n + " = ");
                    break;
            }

            o = sc.nextInt();

            if ((p == 0 && o == (m+n)) || (p == 1 && o ==(m+n)) || (p == 2 && o == (m - n)) || (p == 3 && o == (m*n))) {
                System.out.println("Correct.");
                correctAnswers++;
            }
            else {
                System.out.println("Incorrect.");
                incorrectAnswers++;
            }
        }
        Date end = new Date();
        long endTime = end.getTime();
        long resultTimes = endTime - startTime;
        long minutes = 0;
        long seconds = 0;
        System.out.println(end.getTime());
        System.out.println("Correct answers: " + correctAnswers + " Incorrect answers: " + incorrectAnswers);
        resultTimes = resultTimes/1000L;
        if (resultTimes >= 60L) {
            minutes++;
            seconds = resultTimes - 60L;
        }
        else {
            seconds = resultTimes;
        }
        System.out.println("Minutes: " + minutes + " Seconds: " + seconds);

    }


    public void getRhombus(int size) {

        for (int rows = 1; rows <= size; rows++) {
            for (int spaces = 1; spaces <= size - rows; spaces++) {
                System.out.print(" ");
            }
            for (int chars = 1; chars <= size; chars++) {
                System.out.print("#");
            }

            System.out.println();

        }

    }
}

