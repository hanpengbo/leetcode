package essy;



public class ReverseInteger {
    public int reverse(int x) {
        long r = 0;
        while(x != 0){
            r = r*10 + x%10;
            x /= 10;
        }
        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
            return (int)r;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-123));
    }
}