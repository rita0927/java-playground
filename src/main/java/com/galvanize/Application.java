package com.galvanize;

public class Application {

    public static void main(String[] args) {

//        if (args.length == 0) return;

//        int x = 5;
//        int y = 8;
//
////        if (x<0){
////            System.out.println("x is negative");
////        } else if (x > 0) {
////            System.out.println("x is positive");
////        } else {
////            System.out.println("x is zero");
////        }
//        if (y % 2 == 0) {
//            System.out.println("y is even number");
//        }
//
//        boolean isTrue = false;
//
//        if (isTrue) {
//            System.out.println("It's true");
//        } else {
//            System.out.println("It's false");
//        }
//
//
//        if (x==y) {
//            System.out.println("x equals y");
//        }
//
//        String foo = "foo";
//        String bar = "bar";
//
//        if (foo.equals(bar)) {
//            System.out.println("foo equals bar");
//        }
//
//        boolean isSingleDigit = x > 0 && x < 10;
//        String color = "green";
//
//        if (color.equals("blue") || color.equals("red")) {
//            System.out.println("Found the color");
//        } else if (isSingleDigit) {
//            System.out.println("x is single digit");
//        }


//        double i = 2.0;
//        while (i > 0.5) {
//            System.out.println(i);
//            i /= 2.0;
//        }
//
//        for (int j = 0; j < 3; j++) {
//            System.out.println(j);
//        }

//        int i = 45;
//
//        while (i < 51) {
//            System.out.println(i);
//            i++;
//        }


//        for (int i = 2; i <= 6; i+=2) {
//            System.out.println(i);
//
//        }

//        if (args.length != 2) {
//            System.out.println("You must enter two arguments");
//            System.exit(1);
//        }
//
//        int a =Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        System.out.println(a + b);

        if (args.length < 1) {
            System.out.println("Please specify a name and email");
        } else if (args.length < 2) {
            System.out.println(String.format("Please specify an email for %s", args[0]));
        } else {
            System.out.println(args[0] + " <" +  args[1] + ">");
        }

    }

}