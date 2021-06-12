package xiaoyi;

public class Person {

	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
//		System.out.println("Person - finalize");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		//如果左边是Person类型，那么就把它强制转换成person，再去比较年龄是否相等
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return this.age == person.age;
		}
		return false;//传入的是其它类型
	}
}
