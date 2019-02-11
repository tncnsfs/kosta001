package kosta.Mission_Dos;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Manager_cankao implements Serializable {
	private File current = new File("E:\\SLADKFJ\\work\\java_work\\study\\src");
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;

	public File cd(String path) throws Exception {
		File[] files = current.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().equals(path)) {
				setCurrent(files[i]);
				System.out.println(current.getPath());
				return current;
			}
		}

		File temp = new File(path);
		if (!temp.exists()) {
			throw new Exception("위치가 올바르지 않습니다.");
		}
		setCurrent(temp);
		System.out.println(current.getPath());
		return current;
	}

	public void is(File f) {
		System.out.println(f.getPath());
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}

	public File cdup(File f) {
		System.out.println(f.getParentFile().getPath());
		setCurrent(f.getParentFile());
		return current;
	}

	public void mkdir(File f) {
		f.mkdir();
		is(f.getParentFile());
	}

	public void copy(File f1, File f2) throws Exception {
		File[] file = f1.listFiles();
		f2.mkdir();

		if (!f1.exists()) {
			throw new Exception("대상이 없습니다.");
		}
		if (f1.isDirectory()) {
			for (int i = 0; i < file.length; i++) {
				if (file[i].isDirectory()) {
					File cre = new File(f2.getPath(), file[i].getName());
					copy(file[i], cre);
				} else {
					File s = new File(f2, file[i].getName());
					filecopy(file[i], s);
				}
			}
		} else {
			File n = new File(f2, f1.getName());
			filecopy(f1, n);
		}
	}

	public void filecopy(File f1, File f2) throws Exception {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		int count = 0;
		byte[] data = new byte[1024];

		fis = new FileInputStream(f1);
		fos = new FileOutputStream(f2);

		while ((count = fis.read(data)) != -1) {
			fos.write(data);
		}

		fis.close();
		fos.close();

	}

	public File getCurrent() {
		return current;
	}

	public void setCurrent(File current) {
		this.current = current;
	}

}
