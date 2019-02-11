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
			System.out.println("������ȭ ����");
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
				oos.writeObject(phone.get(i)); // ������ ����ȭ
			}
			System.out.println("����ȭ ����");
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

		System.out.print("�̸��� �Է��ϼ��� :");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ ��ȣ�� �Է��ϼ��� : ");
		String phoneNum = DataInput.sc.nextLine();
		System.out.print("��������� �Է��ϼ��� (�� 911104) : ");
		String birth = DataInput.sc.nextLine();

		phone.add(count, new PhoneInfo(name, phoneNum, birth));
		// name,ADD phoneNum, birth�� �Է� �޾Ƽ� �Ʒ�ó�� ������ ���� ���� ����־��.
		// arr[count++] = new PhoneInfo(name,phoneNum,birth);
		count++;
	}

	public void addInformation() {
		Scanner sc = new Scanner(System.in);
		// unver[count] = new University();
		// comp[count] = new Company();
		System.out.print("�л��̸� 1, �������̸� 2�� �������� : ");
		input = sc.nextInt();

		System.out.print("�̸��� �Է��ϼ��� :");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ ��ȣ�� �Է��ϼ��� : ");
		String phoneNum = DataInput.sc.nextLine();
		System.out.print("��������� �Է��ϼ��� (�� 911104) : ");
		String birth = DataInput.sc.nextLine();

		if (input == 1) {
			System.out.print("���� �Է��ϼ���  : ");
			major = DataInput.sc.nextLine();
			System.out.print("�й��� �Է��ϼ��� : ");
			studentNo = DataInput.sc.nextLine();
			u = new University(name, phoneNum, birth, major, studentNo);
			phone.add(count, u);

		} else if (input == 2) {
			System.out.print("�μ��� �Է��ϼ���: ");
			dept = DataInput.sc.nextLine();
			System.out.print("��å�� �Է��ϼ���: ");
			position = DataInput.sc.nextLine();
			c = new Company(name, phoneNum, birth, dept, position);
			phone.add(count, c);

		} else
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");

		// name, phoneNum, birth�� �Է� �޾Ƽ� �Ʒ�ó�� ������ ���� ���� ����־��.
		// arr[count++] = new PhoneInfo(name,phoneNum,birth);
		count++;
	}

	public void listPhoneInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���л��� ����ϰ� ������ 1, "
										+ "�������� ����ϰ� ������ 2, "
										+ "��ü�� ����ϰ� ������ 3�� �Է��ϼ���.");
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
		System.out.print("�˻��Ͻ� ȸ���� �̸��� �Է��ϼ��� : ");
		name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (phone.get(i).getName().equals(name)) {
				System.out.println(phone.get(i).getName() + "ȸ���� ��ȭ��ȣ�� " + phone.get(i).getPhoneNum() + " ��������� "
						+ phone.get(i).getBirth() + "�Դϴ�. ");
				break;
			}
			if (index == -1) {
				System.out.println("ã�� ȸ���� �����ϴ�.");
			}
		}
	}

	public void updatePhoneInfo() {
		String name;
		int index = -1;
		System.out.print("������ ȸ���� �̸��� �Է��ϼ��� : ");
		name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (phone.get(i).getName().equals(name)) {
				index = i;
				System.out.print("�����Ͻ� ��ȣ�� �Է��ϼ��� : ");
				String num = DataInput.sc.nextLine();
				phone.get(index).setPhoneNum(num);
				System.out.println("���� �� ��ȣ�� " + phone.get(index).getPhoneNum() + "�Դϴ�.");
			}
		}

		if (index == -1) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		}
	}

	public void deletePhoneInfo() {
		String name;
		int index = -1;
		System.out.print("������ ȸ���� �̸��� �Է��ϼ��� : ");
		name = DataInput.sc.nextLine();
		for (int i = 0; i < count; i++) {
			if (phone.get(i).getName().equals(name)) {
				phone.remove(i);
				System.out.println("�����Ǿ����ϴ�.");
			}

			else if (index == -1)
				System.out.println("ã�� ȸ���� �����ϴ�.");
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
