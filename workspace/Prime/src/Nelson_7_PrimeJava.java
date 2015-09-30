
public class Nelson_7_PrimeJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(i % 2 != 0) {
				if(i % 3 != 0) {
					if(i % 5 != 0) {
						System.out.println(i +" is Prime");
					}
				}
			}
		}
	}
}
