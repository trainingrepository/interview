package interview;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name="kalaiyarasi";
         int lenth=name.length();
        System.out.println(lenth);
        for(int i=lenth-1; i>=0; i--)
                System.out.print(name.charAt(i));

}
}