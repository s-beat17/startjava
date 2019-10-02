public class Wolf {

	private String gender = "wolfdog";
	private String alias = "Akela";
	private float weight = 25.6f;
	private int age = 5;
	private String color = "gray";

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	public String getAlias() {
		return alias;
	}

	void setAlias(String alias) {
		this.alias = alias;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if(age > 8) {
			System.out.println("Incorrect age!!!");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public boolean move() {
		System.out.println("Walked 500 meters");
		return true;
	}

	public boolean seat() {
		return false;
	}

	public boolean run() {
		System.out.println("Ran 1000 meters");
		return true;
	}

	public String call() {
		return "Wu-u-u-u";
	}

	public boolean hunt() {
		return true;
	}
}