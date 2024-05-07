package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {

	public static void main(String[] args) throws IOException {
		
		String 파일이름 = "practice.txt";
		
		//파일이 존재하는지 확인 
		File file = new File(파일이름);
		
		if(file.exists()) {
			System.out.println("파일이 존재합니다");
		}else {
			file.createNewFile();
			System.out.println("파일을 생성했습니다 ");
		}
		FileWriter 글쓰기 = new FileWriter(file);
			글쓰기.write("java \n");
			글쓰기.write("File \n");
			글쓰기.write("객체 \n");
			
			글쓰기.close();
			
			System.out.println("작성 끝.");
		
		
	}
	
	
}
