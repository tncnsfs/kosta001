package kosta.Mission_Dos;


import java.io.File;

public class Dos_Main_cankao {

	public static void main(String[] args) {
		Manager_cankao manager = new Manager_cankao();
		File current = new File("C:\\Users\\kosta\\Documents\\testF");
		for (;;) {
			System.out.print(">>");
			String keyin = "";
			keyin = Keybord.sc.nextLine();
			
			String menu, path;
			int n = keyin.length();
			if (keyin.matches("[\\w]+[ ]{1}[\\w]+")) {
				n = keyin.indexOf(" ");
			}
			menu = keyin.substring(0, n);
			path = keyin.substring(n).trim();
			
			
			System.out.println(menu);
			switch (menu) {
			case "cd":
				try {
					current = manager.cd(path);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "is":
				manager.is(current);
				break;
			case "cd..":
				current = manager.cdup(current);
				break;
			case "mkdir":
				manager.mkdir(new File(current.getPath(), path));
				break;
				
			case "cp":
				System.out.print("복사할 파일 위치 : ");
				String path1 = Keybord.sc.nextLine();
				System.out.print("복사 위치 : ");
				String path2 = Keybord.sc.nextLine();
				
				try {
					manager.copy(new File(path1), new File(path2));					
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}

		}

	}

}
