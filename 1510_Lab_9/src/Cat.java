
public class Cat {
	
	private final String name;
	private int age;
	
	public Cat(String name, int age) {
		String trimmedName = name.trim();
		if (trimmedName.equals("")) {
			this.name = "Cleo";
		} else {
			this.name = name;
		}
		
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	

}
