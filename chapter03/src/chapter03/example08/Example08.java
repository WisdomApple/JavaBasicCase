package chapter03.example08;

public class Example08 {
	public static void main(String[] args) {
		Person p = new Person(); // 实例化 Person对象
	}
}

class Person {
    int age;

    /*
     * 当类中定义了有参的构造方法时，还需要定义一个无参的构造方法，
     * 如果不定义无参构造方法，会报出构造方法未定义的错误
     */
    public Person() {
    } //无参构造

    public Person(int x) { //有参构造
        age = x;
    }
}

