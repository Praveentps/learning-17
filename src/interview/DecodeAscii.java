package interview;

public class DecodeAscii {

    public static void main(String[] args) {
        String encode = "729799107101114328297110107";
        int counter=2;
        for (int i = 0; i < encode.length() - 1; i = i + counter) {
            counter=2;
            String str = encode.substring(i, i + 2);
            int n = Integer.parseInt(str);
            if (n >= 65 && n <= 122) {
               // System.out.print("n: " + str + " ");
                char c = (char) n;
                 System.out.print(Character.toString(c));
            } else {
                counter=2;

                str = encode.substring(i, i + 3);
                n = Integer.parseInt(str);
                //System.out.print("n: " + str + " ");
                char c = (char) n;
                i=i+1;
                System.out.print(Character.toString(c));
            }
        }
    }
}
