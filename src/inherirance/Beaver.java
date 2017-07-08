package inherirance;

 class Rodent {
	 protected static Integer chew() throws Exception {
	 System.out.println("Rodent is chewing");
	 return 1;
	 }
	}
	public class Beaver extends Rodent {
	 public static Integer chew() throws RuntimeException {
	 System.out.println("Beaver is chewing on wood");
	 return 2;
	 }
	}