package chapter10;

public class Notebook extends Computer {
	private int beterry;
	
	public void charging() {
		System.out.println("충전 중입니다");
	}
	
	@Override
	public void printComputerInfo() {
		System.out.println("<< 노트북의 정보 >>");
		System.out.println("CPU = " + getCpu());
		// ...
		System.out.println("BETERRY = " + beterry);
	}

	public int getBeterry() {
		return beterry;
	}
	public void setBeterry(int beterry) {
		this.beterry = beterry;
	}
}
