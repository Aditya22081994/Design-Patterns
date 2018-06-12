package creationalPatterns;

class TestClass {
	
	private TestClass() {
	}
	
	private static TestClass testClass = null;
	
	public static TestClass getTestClass() {
		if(testClass == null) {
			return new TestClass();	
		} else {
			return testClass;
		}
	}
}

public class SingletonPattern {
	// This line would give us a compilation error
//	TestClass testClass = new TestClass();
	
	TestClass testClass = TestClass.getTestClass();
}
