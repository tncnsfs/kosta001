package phoneArray_ksh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Manager {
	private String major = null;
	private String studentNo = null;
	private String dept = null;
	private String position = null;
	PhoneInfo arr[];
	int input;
	List<PhoneInfo> phone = new ArrayList<PhoneInfo>();
	University u = new University();
	Company c = new Company();
	int count = 0;

	public Manager() {
	}

	public void read() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("list.txt"));
			for (int i = 0; i < phone.size(); i++) {
				phone.set(i, (PhoneInfo) ois.readObject());
				System.out.println(phone.get(i));
			}
			System.out.println("역직렬화 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
			}
		}
	}

	public void write() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
			for (int i = 0; i < phone.size(); i++) {
				oos.writeObject(phone.get(i)); // 파일의 직렬화
			}
			System.out.println("직렬화 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
			}
		}
	}

	public void addPhoneInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 :");
		String name = DataInput.sc.nextLine();
		System.out.print("전화 번호를 입력하세요 : ");
		String phoneNum = DataInput.sc.nextLine();
		System.out.print("생년월일을 입력하세요 (예 911104) : ");
		String birth = DataInput.sc.nextLine();

		phone.add(count, new PhoneInfo(name, phoneNum, birth));
		// name,ADD phoneNum, birth를 입력 받아서 아래처럼 생성자 인자 값을 집어넣어도됨.
		// arr[count++] = new PhoneInfo(name,phoneNum,birth);
		count++;
	}

	public void addInformation() {
		Scanner sc = new Scanner(System.in);
		// unver[count] = new University();
		// comp[count] = new Company();
		System.out.print("학생이면 1, 직장인이면 2를 누르세요 : ");
		input = sc.nextInt();

		System.out.print("이름을 입력하세요 :");
		String name = DataInput.sc.nextLine();
		System.out.print("전화 번호를 입력하세요 : ");
		String phoneNum = DataInput.sc.nextLine();
		System.out.print("생년월일을 입력하세요 (예 911104) : ");
		String birth = DataInput.sc.nextLine();

		if (input == 1) {
			System.out.print("과를 입력하세요  : ");
			major = DataInput.sc.nextLine();
			System.out.print("학번을 입력하세요 : ");
			studentNo = DataInput.sc.nextLine();
			u = new University(name, phoneNum, birth, major, studentNo);
			phone.add(count, u);

		} else if (input == 2) {
			System.out.print("부서를 입력하세요: ");
			dept = DataInput.sc.nextLine();
			System.out.print("직책을 입력하세요: ");
			position = DataInput.sc.nextLine();
			c = new Company(name, phoneNum, birth, dept, position);
			phone.add(count, c);

		} else
			System.out.println("번호를 잘못 입력하셨습니다.");

		// name, phoneNum, birth를 입력 받아서 아래처럼 생성자 인자 값을 집어넣어도됨.
		// arr[count++] = new PhoneInfo(name,phoneNum,birth);
		count++;
	}

	public void listPhoneInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("대학생을 출력하고 싶으면 1, "
										+ "직장인을 출력하고 싶으면 2, "
										+ "전체를 출력하고 싶으면 3을 입력하세요.");
		int input = sc.nextInt();
		for (int i = 0; i < count; i++) {

			if (input == 1) {
				if (phone.get(i) instanceof University) {
					phone.get(i).show();
				}
			} else if (input == 2) {
				if (phone.get(i) instanceof Company) {
					phone.get(i).show();
				}
			} else {
				phone.get(i).show();
			}

		}

	}

	public void searchPhoneInfo() {
		int index = -1;

		String name;
		System.out.print("검색하실 회원의 이름을 입력하세요 : ");
		name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (phone.get(i).getName().equals(name)) {
				System.out.println(phone.get(i).getName() + "회원의 전화번호는 " + phone.get(i).getPhoneNum() + " 생년월일은 "
						+ phone.get(i).getBirth() + "입니다. ");
				break;
			}
			if (index == -1) {
				System.out.println("찾는 회원이 없습니다.");
			}
		}
	}

	public void updatePhoneInfo() {
		String name;
		int index = -1;
		System.out.print("변경할 회원의 이름을 입력하세요 : ");
		name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (phone.get(i).getName().equals(name)) {
				index = i;
				System.out.print("변경하실 번호를 입력하세요 : ");
				String num = DataInput.sc.nextLine();
				phone.get(index).setPhoneNum(num);
				System.out.println("변경 된 번호는 " + phone.get(index).getPhoneNum() + "입니다.");
			}
		}

		if (index == -1) {
			System.out.println("찾는 회원이 없습니다.");
		}
	}

	public void deletePhoneInfo() {
		String name;
		int index = -1;
		System.out.print("삭제할 회원의 이름을 입력하세요 : ");
		name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (phone.get(i).getName().equals(name)) {
				phone.remove(i);
				System.out.println("삭제되었습니다.");
			}

			else if (index == -1)
				System.out.println("찾는 회원이 없습니다.");
			// count--;
		}

	}

	public void sortPhoneInfo() {

		Collections.sort(phone, new Comparator<PhoneInfo>() {

			@Override
			public int compare(PhoneInfo o1, PhoneInfo o2) {
				int n = o1.getName().compareTo(o2.getName());
				if (n > 0)
					return 1;
				else if (n < 0)
					return -1;
				return 0;
			}
		});
		for (int i = 0; i < phone.size(); i++)
			phone.get(i).show();
	}

}
