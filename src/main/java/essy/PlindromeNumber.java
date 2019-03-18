package essy;

public class PlindromeNumber {
        public boolean isPalindrome(int x) {
           int a =0;
           int b = x;
           if (b<=0)return false;
          while (x !=0){
              a = a*10+x%10;
              x= x/10;
          }
            System.out.println("a:"+a);
            System.out.println("b:"+b);
         if (a == b){
             return true;
         }
          return false;
        }

    public static void main(String[] args) {
        System.out.println(new PlindromeNumber().isPalindrome(121));
    }
}
