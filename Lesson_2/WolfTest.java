public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setGender("werewolf");
		System.out.println("Gender = " + wolfOne.getGender());
		wolfOne.setAlias("Wolf");
		System.out.println("Name = " + wolfOne.getAlias());
		wolfOne.setWeight(20);
		System.out.println("Weight = " + wolfOne.getWeight());
		wolfOne.setAge(15);
		System.out.println("Age = " + wolfOne.getAge());
		wolfOne.setColor("Black");
		System.out.println("Color = " + wolfOne.getColor());
		System.out.println(wolfOne.move());
		System.out.println("Seat = " + wolfOne.seat());
		System.out.println(wolfOne.run());
		System.out.println("Cry = " + wolfOne.call());
		System.out.println("Hunted = " + wolfOne.hunt());
	}
}