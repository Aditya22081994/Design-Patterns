package creationalPatterns;

interface InterfaceTwo {
	public void methodOne();
}

class ClassThree implements InterfaceTwo {
	@Override
	public void methodOne() {
	}
}

abstract class FactoryOne {
	public void performAction(String className) {
		InterfaceTwo interfaceTwo = getClassMethod(className);
		interfaceTwo.methodOne();
	}
	protected  abstract InterfaceTwo getClassMethod(String className);
}

public class FactoryMethodPattern extends FactoryOne {
	public static void main(String[] args) {
		FactoryMethodPattern factoryMethodPattern = new FactoryMethodPattern();
		factoryMethodPattern.performAction("ClassThree");
	}

	@Override
	protected InterfaceTwo getClassMethod(String className) {
		if(className.equalsIgnoreCase("ClassThree")) {
			return new ClassThree();
		} else {
		return null;
		}
	}

}
