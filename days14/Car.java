package days14;

import days16.Engine;

public class Car {

	//필드
	String name;
	String gearType; //수동, 자동
	int door;
	//엔진 필요
	private Engine engine = null;
	//Engine engine= new Engine(); //명시적 초기화   // 결합력이 높은 코딩이다-> 나쁜 코딩이다.
	
	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	//생성자
	Car(){
		//this.engine = new Engine(); //생성자 초기화
	}
	
	
	//메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
		
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
		
	}
}
