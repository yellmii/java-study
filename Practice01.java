
public class Practice01 {

	public static void main(String[] args) {
		
		String name = "최예림";
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		for(int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++) {
			if(name.charAt(0) == (char)i) {
				n1 = i;
			}
			if(name.charAt(1) == (char)i) {
				n2 = i;
			}
			if(name.charAt(2) == (char)i) {
				n3 = i;
			}
		}
		
		System.out.printf("0x%X,0x%X,0x%X", n1, n2, n3);
		
		
		
/*
        char n1 = '림';
        char n2 = '예';
        char n3 = '최';
        
        String h1 = "";
        String h2 = "";
        String h3 = "";

        for(int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++)
        {
            if(n1 == i) 
            {
            	h1 = Integer.toHexString(i);
            	System.out.printf("0x%s",h1.toUpperCase() + ", ");
            }
            else if(n2 == i)
            {
            	h2 = Integer.toHexString(i);
            	System.out.printf("0x%s",h2.toUpperCase() + ", ");
            }
            else if(n3 == i)
            {
            	h3 = Integer.toHexString(i);
            	System.out.printf("0x%s",h3.toUpperCase());
            }
        }
*/
	}

}
