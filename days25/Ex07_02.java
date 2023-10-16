package days25;

import java.io.File;
import java.io.FileWriter;

public class Ex07_02 {

	public static void main(String[] args) {
		//프로 그램 시행 - 파일에 저장할 각 문자열 - 
		//실행수 
		//1. 저장할 파일명 입력? kenik.txt 엔터
		//2. 저장할 문자열 (Data) 입력? 내일은 금요일.. 엔타 
		//     계속?  n
		//파일을 저장하고 출력 받아오는 
		//내일시험 - 입력받아와서 저장 
		
		//파일[저장]
		String pathname = ".\\src\\days25\\sample.txt";
				File file = new File( pathname);
		//파일의 존재 유뮤를 true falso 반화 
		//System.out.println(file.exists()); 골전도 
		// 파일 + 문자 출력용 스트림               
		//파일 새로생성 + 덮어쓰기                                       // true 속성으로 계속 추가 
				try (FileWriter fw = new FileWriter(file, true)){
					/*
					fw.append('a');
					fw.append("append_string");     //append 추가
					
					fw.write(98);                   //wrtie 쓰기 
					fw.write("wrtie_string");
					*/
					fw.write("새로 실행해서 텍스트 추가 ");
					
					//쓰기 + 추가 fr.출력용 스트림에 쓰기 + 추가 ****
					//fw.flush();   //스트림에 있는걸 비워라   
					//fw.close(); //  close 하게 되면 자동적으로 먼저 flush가 일어남 
					
					 System.out.println(" end ");

					
				} catch (Exception e) {
					e.printStackTrace();
				}
	         

	}

}
