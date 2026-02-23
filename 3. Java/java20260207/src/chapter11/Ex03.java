package chapter11;

public class Ex03 {
	public static void main(String[] args) {
		Lion lion1 = new Lion();
		lion1.setName("무파사");
		
		Lion lion2 = new Lion();
		lion2.setName("심바");
		
		Rabbit rabbit = new Rabbit();
		rabbit.setName("버니");
		
		ZooKeeper zk = new ZooKeeper();
		
		zk.feed(lion1);
		zk.feed(rabbit);
	}
}








