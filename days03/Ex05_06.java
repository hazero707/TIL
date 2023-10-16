package days03;


/**
 * @author 정하영
 * @date 2023. 7. 17. - 오후 2:40:41
 * @subjct 단항연산자   ++      --
 * @contents   ㄴ       증감연산자
 */
public class Ex05_06 {

	public static void main(String[] args) {
		// 어떤 기억 공간의 값을 1ㄴ증가 시키는 코딩.
		// 어떤 기억 공간의 값을 1감소 시키는 코딩.
		// 어떤 기억 공간의 값을 3증가 시키는 코딩.
		
		int n =10;
		System.out.println(n);  //10
		
		//n=11;
		//1)n=n+1;
		//2)n += 1; //복합대입연산자 +=
		//3)n++; 후위형 증감연산자 
		//4) ++n; 정위형 증감연산자
	
		
		//1)n=n-1;
		//2)n -=1;       //같은코딩
		//3)n--;
		// 4)-- n;
		
		//n=n+3;
		//n +=3;
		System.out.println(n); //11
		
       //this.textbook1.text =this.textbox1.text; (??)

	}

}
