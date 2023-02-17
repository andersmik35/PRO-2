package opgave1;

import javax.security.auth.Subject;

public class Opgave1 {
    public static int factorial(int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static int power(int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        } else {
            result = power(n, p - 1) * n;
        }
        return result;
    }

    public static int power2(int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        } else if (p > 0 && p % 2 == 1) {
            result = power(n, p - 1) * n;
        } else if (p > 0 && p % 2 == 0) {
            result = power(n * n, p / 2);
        }

        return result;
    }


    public static int product(int a, int b){
        int result = 0;
        if (a == 0){
            return result;
        } else{
            result = b + product(a-1,b);
            
        }
        return result;
    }

    public static int productRis(int a, int b){
        int result;
        if (a == 0){
            result = 0;
        } else if (a >= 0 && a%2 == 1) {
            result = productRis (a-1,b) +b;
        }else {
            result = productRis(a/2, b+b);
        }
        return result;
    }

    public static String reverse(String s){
        String resultat = " ";
        if (s.isEmpty()){
            return resultat;
        }
        else {
            return resultat = s.charAt(s.length() -1) + reverse(s.substring(0,s.length() -1));
        }

    }

    public static String omvaend (String s){
        if (s.length() == 1){
            return s;
        }else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }





    public static void main(String[] args) {
        System.out.println(power(4, 2));

        System.out.println(power2(4, 2));

        System.out.println(product(1, 2));

        System.out.println(productRis(19, 3));

        System.out.println(reverse("ab"));

        System.out.println(omvaend("Hej"));
    }

}
