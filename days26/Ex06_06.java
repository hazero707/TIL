package days26;

import java.io.File;

public class Ex06_06 {

	public static void main(String[] args) {
		// days26
		//  ㄴ [temp ]
		//    ㄴ temp_a
		//        ㄴ xxx
		//        ㄴ yyy
		//     ㄴtemp_b

		String pathname = ".\\src\\days26\\temp";
		File dir = new File(pathname);
		
		if (dir.exists()) { 
			//then the directory must be empty inorder to be deleted.  하위 디렉토리가 없어야 삭제할 수 있다.
			//System.out.println(dir.delete()); // false 
			//deleteFolders(dir);
		//deleteAll(dir);
			
		}//if
	}//main
	private static void directoryDelete(File f) {
		//f 삭제 되지 않았을 경우 while 반복 
		while ( !f.delete()) {// true, false
			
			File[] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if(list[i].delete()) {
					System.out.printf("%s 삭제 완료!!!\n", list[i]);
					
				}else {
					directoryDelete(list[i]);
				}
			}
			
		}
	}

/*[1]이걸로 
private static void deleteFolders(File dir) {
    
    File[] childList = dir.listFiles(); //폴더 또는 파일 
    
    
    if (childList != null) {
       for (int i = 0; i < childList.length; i++) {
          File child = childList[i]; //temp_a 
          deleteFolders(child);         
          System.out.printf("> %s 를 삭제했습니다.\n", child);
       }
    }
    dir.delete(); 
    System.out.printf("> %s 를 삭제했습니다.\n", dir);
 }
*/
	//[2]
	/*
private static void deleteAll(File file) {
    File[] files = file.listFiles();
    //temp_a, temp_b 
    for (int i = 0; i < files.length; i++) {
    	
    	//
       if(files[i].isDirectory()) {
          deleteAll(files[i]);         
       }
       files[i].delete();
    } // for
 }*/
	
}
