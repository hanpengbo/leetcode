package essy;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        String[] split = s.split("");
        for (int i=0;i<split.length;i++){
            if (split[i].equals("I")){
                if (i+1<split.length && (split[i+1].equals("V")||split[i+1].equals("X"))){
                    continue;
                }
               result +=1;
            }else if (split[i].equals("V")){
                if (i-1>=0 && split[i-1].equals("I")){
                    result +=4;
                }else {
                    result +=5;
                }
            }else if (split[i].equals("X")){
                if (i+1<split.length && (split[i+1].equals("L")||split[i+1].equals("C"))){
                    continue;
                }
                if (i-1>=0 && split[i-1].equals("I")){
                    result +=9;
                }else {
                    result +=10;
                }
            }else if (split[i].equals("L")){
                if (i-1>=0 && split[i-1].equals("X")){
                    result +=40;
                }else {
                    result +=50;
                }
            }else if (split[i].equals("C")){
                if (i+1<split.length &&(split[i+1].equals("D")||split[i+1].equals("M"))){
                    continue;
                }
                if (i-1>=0 && split[i-1].equals("X")){
                    result +=90;
                }else {
                    result +=100;
                }
            }else if (split[i].equals("D")){
                if (i-1>=0 && split[i-1].equals("C")){
                    result +=400;
                }else {
                    result +=500;
                }
            }else if (split[i].equals("M")){
                if (i-1>=0 && split[i-1].equals("C")){
                    result +=900;
                }else {
                    result +=1000;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("III"));
    }
}
