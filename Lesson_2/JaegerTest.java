public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		System.out.println("modelName = " + jaegerOne.getModelName());
		System.out.println("weight = " + jaegerOne.weight);
		jaegerOne.weight = 0;
		System.out.println("weight = " + jaegerOne.weight);
		System.out.println("mark = " + jaegerOne.mark);
		System.out.println("speed = " + jaegerOne.speed);
		System.out.println(jaegerOne.drift());
	}
}