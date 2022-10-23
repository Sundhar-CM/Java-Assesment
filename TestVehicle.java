public class TestVehicle {
	public static void main(String[] args)
	{
		Audi a1=new Audi();
		Tesla t1=new Tesla();
		Honda h1=new Honda();
		Yamaha y1=new Yamaha();
		a1.Name();
		a1.Motors();
		a1.Engine();
		t1.Name();
		t1.Motors();
		t1.Engine();
		h1.Name();
		h1.Motors();
		h1.Engine();
		y1.Name();
		y1.Motors();
		y1.Engine();
	}
}
class Vehicle{
	public void Motors() {
	System.out.println(" Vehicle");
	}
}
class twoWheeler extends Vehicle{
	public void Engine()
	{
		System.out.println("Two Wheeler Engine Starts");
	}
}
class fourWheeler extends Vehicle{
	public void Engine()
	{
		System.out.println("Four Wheeler Engine Starts");
	}
}
class Honda extends twoWheeler{
	public void Name()
	{
		System.out.print("Honda");
	}
}
class Yamaha extends twoWheeler{
	public void Name()
	{
		System.out.print("Yamaha");
	}
}
class Tesla extends fourWheeler{
	public void Name()
	{
		System.out.print("Tesla");
	}
}
class Audi extends fourWheeler{
	public void Name()
	{
		System.out.print("Audi");
	}
}
