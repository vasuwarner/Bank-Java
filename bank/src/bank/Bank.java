package bank;

import java.util.Scanner;
import java.util.Random;

public class Bank {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Register a = new Register();
        Login b = new Login();
        System.out.println("\t\t\tWelcome to FEDERAL BANK");
        int r=1;
        char s;
        do{
        System.out.println("What is your optional");
        System.out.println("press r for register AND l for Login");
        char w = x.next().charAt(0);
        if (w == 'r') {
            a.home();
        } else {
            b.customer();
        }
   
    System.out.println("Do you want to continue press (y/n) :");
    s = x.next().charAt(0);
    }while(s=='y');
}
}

class Register {

    String uname;
    String pw1;

    void home() {

        Scanner ob = new Scanner(System.in);
        System.out.println("\t\t\tWelcome to FEDERAL BANK");
        System.out.println("Enter your Name :");
        String name = ob.next();
        System.out.println("Enter your User Name :");
        uname = ob.next();
        System.out.println("Enter your email id :");
        String email = ob.next();
        System.out.println("Enter your password :");
        pw1 = ob.next();
        System.out.println("Re-enter your password :");
        String pw2 = ob.next();
        if (pw1.equals(pw2)) {
            System.out.println("Enter your Mobile Number :");
            long mobile = ob.nextLong();
            System.out.println("Enter your date of birth :");
            String dob = ob.next();
        } else {
            System.out.println("Passwords are Mis-matching");
        }
        Random ram = new Random();
        String z = "1234567890";
        String b = "abcdefghijklmnopqrstuvwxyz";
        String c = "!@#$%^&*()";
        String d = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int e = z.length();
        int f = b.length();
        int g = c.length();
        int h = d.length();

        int i = ram.nextInt(e);
        int j = ram.nextInt(f);
        int k = ram.nextInt(g);
        int l = ram.nextInt(h);

        String m = String.valueOf(z.charAt(i));
        String n = String.valueOf(b.charAt(j));
        String o = String.valueOf(c.charAt(k));
        String p = String.valueOf(d.charAt(l));

        String q = "";
        q += m + n + o + p;
        System.out.println("Captcha : " + q);
        System.out.println("Enter the given Captcha : ");
        String r = ob.next();
        if (q.equals(r)) {
            System.out.println("Registered Successfully");
            System.out.println("Now you can login your account");
        } else {
            System.out.println("Entered captcha doesn't correct");
            System.out.println("Refresh the page and Re-enter your Information");
        }
    }
}

class Login extends Register {

    void customer() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the user name :");
        String unam = obj.next();
        if (unam.equals(uname)) {
            System.out.println("Enter the password :");
            String pw = obj.next();
            if (pw.equals(pw1)) {
                System.out.println("Login successful");
            } else {
                System.out.println("Entered password is wrong");
            }
        } else {
            System.out.println("Invalid user name");
        }

    }
}
