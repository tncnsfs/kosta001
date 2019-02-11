// 재귀함수 쓰기

// *** A 디렉토리 ***
// - a File
// - b File
// - c Directory
// - ca File
// - cb File
// All print File
package kosta.io_01;

import java.io.File;

public class FileMission01 {
	static String path = "C:\\Users\\KOSTA\\Documents\\testF";
	static File f1 = new File(path);
	
	// 재귀함수 쓰기
	public static void fileList(File file) throws Exception {
		if (!file.exists() || !file.isDirectory()) {
			throw new Exception("디렉토리가 아닙니다.");
		}
		File[] list = file.listFiles(); // 객체를 불러왔음
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println();
				System.out.println("// ***" + list[i].getName() + " ***");
				fileList(list[i]);
			} else {
				System.out.println(" - " + list[i].getName());
			}
		}
	}

	public static void main(String[] args) {
		try {
			fileList(f1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
