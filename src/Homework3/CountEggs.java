package Homework3;

public class CountEggs {

	public static void main(String[] args) {
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			if((i%1==0)&&(i%2==1)&&(i%3==0)&&(i%4==1)&&(i%5==1)&&(i%6==3)&&(i%7==0)&&(i%8==1)&&(i%9==0)) {
				System.out.print(i);
				break;
			}
		}
	}
}
