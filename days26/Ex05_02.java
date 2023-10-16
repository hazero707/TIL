package days26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		int [] score = {
				//번호 국  영  수
				1,100,90,90,
				2,90,90,10,
				3,100,100,10,
				4,70,60,80,
				5,70,90,100
		};
		//성적 정보 
		String name = ".\\src\\days26\\score.dat";
		String mode = "rw";
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			
			for(int i =0; i<score.length;i++) {
				long fp = raf.getFilePointer();
				System.out.printf(">현재파일 포인터 : %d -[%d]\n",fp, score[i]);
				raf.writeInt(score[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("> 엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available() );

		/*
		//[문제]
		//모든 학생의 번호, 국, 영, 수 성적 정보를 출력... 
		System.out.printf("번호:%d, 국어:%d ,국어:%d,국어:%d,국어:%d 평균:%.2f\n");
		*/
		int no,kor,eng,mat;
		int tot;
		double avg;
        try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			//현재 FP:0
	        
	        // 현재 FP :4
	       
	        
	        int 학생수 =score.length/4;
	        for (int i = 0; i < 학생수; i++) {
	        	no = raf.readInt();
	        	 kor =raf.readInt();
	 	        eng=raf.readInt();
	 	        mat=raf.readInt();
	 	        tot = kor+eng+mat;
	 	        avg= (double)tot/3;
	 	        System.out.printf("번호:%d, 국어:%d ,국어:%d,국어:%d,국어:%d 평균:%.2f\n", no, kor, eng, mat, tot,avg);
			}
	        
			}
			
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//[문제]
		//3번학생의 수학점수(100->20)으로 수정하는 코딩하세요 
		
		//[문제]
		//3번 학생의 번,국,영,수,총,등 만 출력하는 코딩하세요 
		 try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			 long pos = (4*4)*2; //3번 학생의 수학위치; //44
			 raf.seek(pos);
		     //raf.writeInt(20);
		     no = raf.readInt();
        	 kor =raf.readInt();
 	        eng=raf.readInt();
 	        mat=raf.readInt();
 	        tot = kor+eng+mat;
 	        avg= (double)tot/3;
 	        System.out.printf("번호:%d, 국어:%d ,국어:%d,국어:%d,국어:%d 평균:%.2f\n", no, kor, eng, mat, tot,avg);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		System.out.println("end");
		}

}
