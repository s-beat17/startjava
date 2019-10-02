public class Jaeger{

	private String modelName = "Bracer Phoenex";
	private String mark = "Mark-5";
	private String origin = "USA";
	private float heght = 70.7f;
	private float weight = 2.1f;
	private int speed = 3;
	private int strength = 8;
	private int armor = 9;

	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		if(modelName == "") {
			System.out.println("Empety line");
		} else {
			this.modelName = modelName;
		}
	}

	public boolean drift() {
		System.out.println("You entered the drift mode");
		return true;
	}

	public void move() {
		System.out.println("You went 5 steps");
	}

	public String scanKaiju() {
		return "nothing";
	}

	public void useVortexCannon() {

	}


}