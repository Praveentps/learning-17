import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Stack {
        public static void main(String[] args) throws InterruptedException {
            List<String> inputByLine = new ArrayList<String>();
            try {
                // Get the object of DataInputStream
                InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String line = "";
                while ((line = br.readLine()) != null){
                    inputByLine.add(line.toString());
                }

                for (String line2 : inputByLine)
                    System.out.println(line2);
                isr.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
    }
}
