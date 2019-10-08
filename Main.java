package sk.itsovy.dolinsky.family;

import sk.itsovy.dolinsky.other.FreeClass;

import java.util.Scanner;

/**
 * @author Martin Dolinsky
 */
public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person person1;
        person1 = new Person();
        Person meno = new Person();

        Mobile mobile1 = new Mobile("Apple", "iPhone XS", "+421 901 234 567");
        Mobile mobile2 = new Mobile("Samsung", "Galaxy Note 9", "+421 912 345 678");

        Car car1 = new Car("Audi", "A4", "PO111AA", 150);
        Car car2 = new Car("Audi", "A6", "PO222BB", 180);
        Car car3 = new Car("Mercedes", "Trieda E", "KE111AA", 200);
        Car car4 = new Car();

        Calculator calc1 = new Calculator("Casio FX-900");

        Person person2 = new Person();
        Person student = new Person("Oliver", 19, true, 1.88, 97, 's', mobile2, car1);
        Person studenttest = new Person();

        person1.setName("Dominik");
        person2.setName("Lucia");
        person1.setAge(25);
        System.out.println(person1);

        person1.setHeight(1.88);
        person1.setWeight(72);

        person1.setStatus('S');
        person1.setGender(true);
        person1.setCar(car2);
        person1.setCalc(calc1);
        person1.about();
        System.out.println("Your BMI: " + person1.calculateBMI());
        System.out.println("BMI status: " + person1.getBMIstatus());
        System.out.println("Birth year of " + person1.getName() + ": " + person1.getBirthYear());
        System.out.println("Age: " + person1.getAge());

        person1.setMobile(mobile1);
        System.out.println("Phone number: " + person1.getMobile().getPhoneNumber());

        if (studenttest.hasMobile()) {
            System.out.println("Phone number: " + studenttest.getMobile().getPhoneNumber());
        } else {
            System.out.println("Student has no mobile.");
        }

        person1.print();
        if (person1.hasCalculator()) {
            calc1.turnOn();
            System.out.println(person1.getCalc().add(2, 5));
            System.out.println(person1.getCalc().convertDecimalToBinary(85473));
        }
        person1.getCalc().turnOn();
        System.out.println(person1.getCalc().convertDecimalToBinary(85473));

        FreeClass freeClass = new FreeClass();
        freeClass.sayHello();
        System.out.println();
        System.out.println(freeClass.getEvenNumber(9));

        System.out.println(person1.getCalc().getAverage(1, 1, 2));
        System.out.println(freeClass.getLoan(60, 7.9f, 10000));
        System.out.println(person1.getCalc().getSphereVolume(2));

        //	freeClass.homework();

        System.out.println();
        System.out.println();
        //	freeClass.test();

        freeClass.doWhile();
        //	getName();

        //	getRectangle();
        //	getRectangleWithChar();
    //    getMonth();
        getQuadraticRoots();
    }

    public static void getName() {
        Scanner sc = new Scanner(System.in);
        String user = "Peter";
        int pass = 12345;

        System.out.print("Enter username: ");
        String usern = sc.nextLine();

        System.out.print("Enter password: ");
        int passw = sc.nextInt();

        if (user.equals(usern) && pass == passw) {
            System.out.println("Correct data.");
        } else {
            System.out.println("Incorrect data. ");
        }
    }

    public static void getRectangle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type rows: ");
        int rows = sc.nextInt();
        System.out.print("Type columns: ");
        int columns = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= rows; row++) {

            for (int column = 1; column <= columns; column++) {
                if (row == 1 || row == rows || column == 1 || column == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void getRectangleWithChar() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type your char: ");
        String znak = sc.nextLine();
        System.out.print("Type rows: ");
        int rows = sc.nextInt();
        System.out.print("Type columns: ");
        int columns = sc.nextInt();

        System.out.println();


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= rows; row++) {

            for (int column = 1; column <= columns; column++) {
                if (row == 1 || row == rows || column == 1 || column == columns) {
                    System.out.print(znak);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void getMonth() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1-12: ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("January");
        } else if (number == 2) {
            System.out.println("February");
        } else if (number == 3) {
            System.out.println("March");
        } else if (number == 4) {
            System.out.println("April");
        } else if (number == 5) {
            System.out.println("May");
        } else if (number == 6) {
            System.out.println("June");
        } else if (number == 7) {
            System.out.println("July");
        } else if (number == 8) {
            System.out.println("August");
        } else if (number == 9) {
            System.out.println("September");
        } else if (number == 10) {
            System.out.println("October");
        } else if (number == 11) {
            System.out.println("November");
        } else if (number == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid input.");
        }
        System.out.println("Via switch: ");

        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("March");
                break;
            case 5:
                System.out.println("April");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid input.");
        }

        System.out.println("Season:" );
        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.print("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("Autumn");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public static void getQuadraticRoots() {
        System.out.println("Hi I am program which helps you solve the quadratic equation!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        System.out.print("Enter b number: ");
        double b = sc.nextDouble();
        System.out.print("Enter c number: ");
        double c = sc.nextDouble();
        double dis = (b * b) - (4 * a * c);

        if (a==0) {
            System.out.println("This is not quadratic equation");
        }
        if (dis < 0) {
            System.out.println("Quadratic equation has no roots");
        }
        if (dis == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Quadratic euqation has one root: " + x1);
        }
        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("Quadratic equation has two roots " + x1 + " and " + x2);
        }
    }
}