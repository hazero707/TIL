package days16;

public class Ex08 {

public static void main(String[] args) {
		
	} // main

} // class

// 자바   ~~~~able 인터페이스
interface Movable{
	
	// 1. 상수
	// 2. 추상메서드
	// 3. default메서드
	// 4. static 메서드	
	void move(int x, int y);  //  public abstract
	
}

interface Attackable{
	void attack(Unit unit); //	
}

// 인터페이스 끼리 상속이 가능하고
// 다중 상속도 가능하다. 
interface Fightable extends Attackable, Movable{
	// 추상메서드	
}

abstract class Unit{
	int currentHP; // 현재 유닛의 체력
	int x;  // 유닛의 위치(x좌표)
	int y;  // 유닛의 위치(y좌표)
}

// 하늘 유닛
class AirUnit extends Unit{
	
}

// 땅 유닛
class GroundUnit extends Unit{
	//
}

// 군인
class Fighter implements Fightable{

	@Override
	public void attack(Unit unit) {
		// 총,칼 공격등등
	}

	@Override
	public void move(int x, int y) {
		// 걷기		
	}
	
}

// 수리가 가능한 유닛
// 상수X, 추상메서드X, 
interface Repairable{}


class Tank extends GroundUnit implements Fightable, Repairable{

	@Override
	public void attack(Unit unit) {
		 // 포 쏘는 공격
	}

	@Override
	public void move(int x, int y) {
		 // 무브 
	}
	
}

// SCV 
// 수리 가능   : Repairable 인터페이스를 구현한 클래스 ,Tank, SCV
// 수리 불가능 : Fighter
class SCV extends GroundUnit implements Repairable{
	
	SCV(){}
	
	// 건물 짖기 메서드
	// 다른 유닛 수리하는 메서드 
	void repair(Repairable unit) {
		
		if (unit instanceof Tank) {
			// Tank 수리 코딩.
		} else if ( unit instanceof SCV) {
			// SCV 수리 코딩.
		} else if ( unit instanceof DropShip) {
			// DropShip 수리 코딩.
		}// if
		
	} 
	
}

// 탱크, 군인, 무기 등등 수송선
class DropShip extends AirUnit implements Fightable, Repairable{

	@Override
	public void attack(Unit unit) {
		 
	}

	@Override
	public void move(int x, int y) {
		 
	}
	
}
