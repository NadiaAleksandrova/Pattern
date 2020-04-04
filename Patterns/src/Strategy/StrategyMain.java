package Strategy;

public class StrategyMain {
	public static void main (String[] args) {
		Context context = new Context (new OperationAdd());
		System.out.println("12 + 5 = " + context.executeStrategy(12, 5));
		
		context = new Context (new OperationMultiply());		
		System.out.println("6 * 4 = " + context.executeStrategy(6, 4));
		
		
		context = new Context (new OperationSubstract());
		System.out.println("18 - 5 = " + context.executeStrategy(18, 5));
		
		context = new Context (new OperationDivision());
		System.out.println("12 / 3 = " + context.executeStrategy(12, 3));
		
	}
	
	
}
