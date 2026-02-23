package chapter11;

public class Ex04 {
	public static void main(String[] args) {
		Car c1 = new Car();
		FireEngine c2 = new FireEngine();
		FireEngine c3 = null;
		
		c1 = (Car) c2;
		c3 = (FireEngine) c1;
		
		Object c4 = (Object) c3;
		
		if(c4 instanceof Ambulance) {
			Ambulance c5 = (Ambulance) c4;
		} else {
			System.out.println("c4가 가지고 있는 값을 Ambulance 타입 객체에 저장 할 수 없습니다.");
		}
	}
}












