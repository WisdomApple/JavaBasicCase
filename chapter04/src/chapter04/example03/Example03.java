package chapter04.example03;

// ���������
public class Example03 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����һ��Dog����
		dog.shout(); // ����dog������д��shout()����
		dog.printName(); // ����dog����ĵ�printName()����
	}
}

// ����Animal��
class Animal {
	String name = "����";

	// ���嶯��еķ���
	void shout() {
		System.out.println("���﷢������");
	}
}

// ����Dog��̳ж�����
class Dog extends Animal {
	String name = "Ȯ��";

	// ��д�����shout()����
	void shout() {
		super.shout(); // ���ʸ���ĳ�Ա����
	}

	// �����ӡname�ķ���
	void printName() {
		System.out.println("name = " + super.name); // ���ʸ���ĳ�Ա����
	}
}
