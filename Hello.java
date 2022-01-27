
public class Hello {
	public static void main(String[] args) {
		
		int i1 = 0b0000_0000_0000_0000_0000_0000_0000_0011;
		int i2 = 0b1111_1111_1111_1111_1111_1111_1111_1100;
		int i3 = 0b1111_1111_1111_1111_1111_1111_1111_1101;
		
		long l1 = 0b0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0101;
		long l2 = 0x00_00_00_00_00_00_00_01;
		long l3 = 0b0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000;

		char c1 = '\ubc15';
		
		//System.out.println(i1);
		//System.out.println(i2);
		//System.out.println(i3);
		
		//System.out.println(l1 + l2);
		//System.out.println(l2);
		//System.out.println(l3);
		
		System.out.println(c1);
	}
}
