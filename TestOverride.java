public class TestOverride {
	public void sayHello(String par)
	{
		System.out.println("hello "+par);
	}
	public void sayHello()
	{
		System.out.println("Hello GHF");
	}
	public static void main(String[] args) {
		String s="hi";
		TestOverride t1=new TestOverride();
		t1.sayHello();
		t1.sayHello(s);
		
	}
}
