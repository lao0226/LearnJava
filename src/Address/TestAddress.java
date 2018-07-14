package Address;

public class TestAddress {

	public static void main(String args[]) {
		Address addr1=new Address(666,"Zhongguancun Street", 802,"Beijing", "Beijing",100086);
		Address addr2=new Address(2955,"Atlantic Ave",802,"Coquitlam","British Columbia");
		Address addr3=addr2;
		
		System.out.println(addr1.returnAddress3line());
		System.out.println();
		System.out.println(addr3.returnAddress3line());
		System.out.println();
		System.out.println(addr2.comesBefore(addr1));
		
	}
}
