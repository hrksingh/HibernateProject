package p;
import java.io.IOException;

/**
 * @author Ash
 * @version 1.0
 * @since 2020-07-05
 * 
 */
public class Javadoc_example {

	/**
	 * simply displays "Hello World!" to the standard output.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Javadoc_example j = new Javadoc_example();
		try {
			System.out.println(j.addNum(1,3));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * simply adds two numbers
	 * @param numA
	 * @param numB
	 * @return int This returns sum of numA and numB.
	 * @throws IOException
	 * @see IOException
	 * {@link https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html}
	 */
	public int addNum(int numA, int numB) throws IOException {
	      return numA + numB;
	   }
	
	/**
	 * @deprecated I decided to to deprecate it
	 * @code num*num
	 * 
	 * @literal{ hi just testing literal }
	 */
	public int addSquare(int numA){
	      return numA * numA;
	   }
	
}
