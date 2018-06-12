package creationalPatterns;

interface InterfaceOne {
	public void methodOne();
	public void methodTwo();
}

class ClassOne implements InterfaceOne {
	@Override
	public void methodOne() {
	}
	@Override
	public void methodTwo() {
	}
}

class ClassTwo implements InterfaceOne {
	@Override
	public void methodOne() {
	}
	@Override
	public void methodTwo() {
	}
}

class FactoryClass {
	public InterfaceOne getClassMethod(String className) {
		if(className.equalsIgnoreCase("ClassOne")) {
			return new ClassOne();
		} else if(className.equalsIgnoreCase("ClassTwo")) {
			return new ClassTwo();
		} else {
			return null;
		}
	}
}

public class FactoryPattern {
	public static void main(String[] args) {
		FactoryClass factoryClass = new FactoryClass();
		InterfaceOne interfaceOne = factoryClass.getClassMethod("ClassOne");
		interfaceOne.methodOne();
	}
}
