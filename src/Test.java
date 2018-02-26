import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
	String buyListPath="/tesco-now/buyListGroup/buyList";
		String[] buyListPaths = buyListPath.split("/", 5);
            /* buyList path is constructed as below
            /tenant/buyListGroup/buyList/segment
            */
		int startIndex=0;
            if(buyListPaths.length>2&&buyListPaths[1].equalsIgnoreCase("TESCO-NOW")) {
            	startIndex=2;
			}

		for (int i = startIndex; i < buyListPaths.length; i++) {
			System.out.println(i+":"+buyListPaths[i]);

		}


	}

}
