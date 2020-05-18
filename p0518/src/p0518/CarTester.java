package p0518;

import java.util.Scanner;

class Car {
	private String name;
	private String num;
	private int w;
	private int h;
	private int l;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;// 연비

	Car(String name, String num, int w, int h, int l,double tankage, double fuel, double sfc){
		this.name = name;
		this.num = num;
		this.w = w;
		this.h = h;
		this.l = l;
		this.tankage = tankage;
		this.fuel = (fuel <= tankage) ? fuel : tankage;// 참이면 a 거짓이면b값을 넣겠다.
		this.sfc = sfc;
		x = y = 0.0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	void setNum(String num) {
		this.num = num;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getTankage() {
		return tankage;
	}
	public void setTankage(double tankage) {
		this.tankage = tankage;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public double getSfc() {
		return sfc;
	}
	public void setSfc(double sfc) {
		this.sfc = sfc;
	}
	void putSpect() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + num);
		System.out.println("전폭 : " + w + "mm");
		System.out.println("전고 : " + h + "mm");
		System.out.println("전장 : " + l + "mm");
		System.out.println("탱크 : " + tankage + "리터");
		System.out.println("연비 : " + sfc + "km/리터");
	}
	boolean move(double dx, double dy) {// 남은 연료:현재연료-이동-남은연료-급유
		double dist = Math.sqrt(dx * dx + dy * dy);// 이동거리:삼각함수
		double f = dist / sfc;// 이동에 소요된 연료=이동거리/연비(1km당 소요되는 연료)

		if (f > fuel) {// 필요연료>현재연료
			return false;// 이동 불가
		} else {// 현재 연료가 충분하다면
			fuel = fuel - f;// 연료=연료-필요연료
			x += dx;// x=x+dx
			y += dy;
			return true;
		}
	}
	void refuel(double df) {// 급유 메서드
		if (df > 0) {// 보충연료>0(연료를 보충한다면)
			fuel += df;// 연료+연료보충
			if (fuel > tankage) {// 보충된 연료가 탱크용량을 초과한다면
				fuel = tankage;
			}
		}
	}
}

public class CarTester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("차량 데이터를 입력하세요.");
		System.out.print("이름 : ");
		String name = s.next();
		System.out.print("번호 : ");
		String num = s.next();
		System.out.print("전폭 : ");
		int w = s.nextInt();
		System.out.print("전고 : ");
		int h = s.nextInt();
		System.out.print("전장 : ");
		int l = s.nextInt();
		System.out.print("탱크용량 : ");
		double tankage = s.nextDouble();
		System.out.print("연료량 : ");
		double fuel = s.nextDouble();
		System.out.print("연비 : ");
		double sfc = s.nextDouble();

		Car c1 = new Car(name, num, w, h, l, tankage, fuel, sfc);

		while (true) {// 반복: 현재위치,남은연료,이동유무
			System.out.printf("현재위치 : (%.2f,%.2f)\n", c1.getX(), c1.getY());
			System.out.printf("남은연료 : %.2f\n", c1.getFuel());//
			System.out.print("이동하시겠습니까?[0:No / 1:Yes] : ");

			if (s.nextInt() == 0) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.print("x 방향으로 이동 거리 : ");
				double dx = s.nextDouble();
				System.out.print("y 방향으로 이동 거리 : ");
				double dy = s.nextDouble();

				if (!c1.move(dx, dy)) {// 연료가 부족하다면(false)->
					System.out.println("연료부족!!");//참일때 이 문장이 실행되기때문에 not을 붙여준다.
					System.out.print("주입할 연료량 입력 : ");
					double a=s.nextDouble();//변수는 내가 여기서 지정(아무거나)
					c1.refuel(a);//입력받은 값을 메서드에 적용시킴
					System.out.printf("현재연료:%.2f",c1.getFuel());
				}
			}
		}
		s.close();
	}

}
