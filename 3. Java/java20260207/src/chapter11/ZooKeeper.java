package chapter11;

public class ZooKeeper {
	private String name;
	
	public void feed(Animal animal) {
		if(animal instanceof Lion) {
			System.out.println(animal.getName() + "에게 생고기를 준다.");
		} else if(animal instanceof Rabbit) {
			System.out.println(animal.getName() + "에게 당근을 준다.");
		} else {
			System.out.println(animal.getName() + "에게 먹이를 준다.");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
