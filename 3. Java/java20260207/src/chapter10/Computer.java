package chapter10;

public class Computer {
	private String cpu;
	private String gpu;
	private int ram;
	private int hdd;
	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void typing() {
		System.out.println("타이핑을 합니다.");
	}
	
	public void printComputerInfo() {
		System.out.println("<< 컴퓨터의 정보 >>");
		System.out.println("CPU = " + cpu);
		System.out.println("GPU = " + gpu);
		System.out.println("RAM = " + ram);
		System.out.println("HDD = " + hdd);
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
}
