package ClassExample;

public class CasinoAverage {

	public static void main(String[] args) {
		int rollTimes=0;
		int numberOfTimes=1000000;
		for(int i=0;i<numberOfTimes;i++) {
			int sum=0;
			while(sum!=7) {
				int dice1=(int)(1+Math.random()*6);
				int dice2=(int)(1+Math.random()*6);
				sum=dice1+dice2;
				rollTimes++;
			}
		}
		double average=(rollTimes*1.0)/numberOfTimes;
		System.out.print("On average: "+average+" times.");
	}
}
