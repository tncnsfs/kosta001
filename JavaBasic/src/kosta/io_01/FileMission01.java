// ����Լ� ����

// *** A ���丮 ***
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
	
	// ����Լ� ����
	public static void fileList(File file) throws Exception {
		if (!file.exists() || !file.isDirectory()) {
			throw new Exception("���丮�� �ƴմϴ�.");
		}
		File[] list = file.listFiles(); // ��ü�� �ҷ�����
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
