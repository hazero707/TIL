package days26;

import java.io.File;

public class Ex06_05 {

	public static void main(String[] args) {
		//days26 폴더 안에 upload 폴더 유무 확인 후 
		// 없으면 폴더 생성 
		String pathName = ".\\src\\days26";
		File dir = new File(pathName, "upload");
		
		System.out.println(dir.exists());  // false - 없다는 소리 
		//1. boolean createNewFile() : 파일 새로 생성 
		//                           이미 생성할 파일이 존재하면 false
		
		//2. File  creatTempFile ("work","tmp"): 임시파일 생성 
        //           c:\\windows\\TEMP 파일생성 
		
		//3.delete() : 파일 삭제 
		//3-2 deleteOnExit() : 응용프로그램이 종료 할때 파일 삭제 
		//                         (임시파일 삭제)
		
		//4.boolean renameTo(File) : 파일명을 변경 
		//5. mkdir() : make directory 폴더생성
	    //    boolean mkdirs() :        폴더들 생성
		
		//               days26\\temp\\upload
		//                            부모폴더 먼저 생성 
		
		
		if (!dir.exists()) {
			System.out.println( dir.mkdir()); //true
			//dir.mkdirs();
		}else {
			dir.delete();  // 존재하지 않으면 삭제해라 
		}
		

	}

}
