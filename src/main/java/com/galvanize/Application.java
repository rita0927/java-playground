package com.galvanize;

public class Application {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please specify a name and email");
        } else if (args.length < 2) {
            System.out.println(String.format("Please specify an email for %s", args[0]));
        } else {
            System.out.println(args[0] + " <" +  args[1] + ">");
        }

//        int x = Integer.parseInt(args[0]);
//        String res = "";
//
//        if (x % 3== 0  && x % 5 ==0) {
//            res = "FizzBuzz";
//        } else if (x % 3 == 0) {
//            res = "Fizz";
//        } else if (x % 5 == 0) {
//            res = "Buzz";
//        } else {
//            res = args[0];
//        }
//        System.out.println(res);
    }

}