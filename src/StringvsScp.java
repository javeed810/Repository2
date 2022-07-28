
public class StringvsScp {
	public static void main(String[] args) {
	String s1 = "Java";  
	String s2="Python";
	String s3 = "Java";  
	String s4 = new String("Java"); 
	String s5 = new String("Python").intern();
	//String s4 = new String("Java").intern();  
	System.out.println((s1 == s2)+" :->s1 == s2"); //  false
	System.out.println((s1 == s3)+" :->s1 == s3"); // true
	System.out.println((s1 == s4)+" :->s1 == s4"); //  false
	System.out.println((s1 == s5)+" :->s1 == s5"); //  true
	System.out.println((s4 == s5)+" :->s4 == s5"); //  true
	System.out.println((s2 == s5)+" :->s2 == s5"); //  false
	}  
}
