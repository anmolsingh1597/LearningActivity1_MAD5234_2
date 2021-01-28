public class LearningActivity1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.Divide(2,2));
	}

}


class Calculator{
	
	private float result;
	
	public float Add(float a, float b) {
		result = a + b;
		return result;
		
	}	
	
	public float Substract(float a, float b) {
		result = a - b;
		return result;
		
	}	
	
	public float Multipy(float a, float b) {
		result = a * b;
		return result;
		
	}	
	
	public float Divide(float a, float b) {
		result = a / b;
		return result;
		
	}
	
}