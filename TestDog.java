public class TestDog{
	public static void main(String[] args) {
		Labrador lr=new Labrador();
		lr.dogEat();
		lr.dogBark();
		Dog d1=new Dog();
		d1.dogBark();
		d1.dogEat();
	}
}
class Dog{
	public void dogBark()
	{
		System.out.println("Barking");
	}
	public void dogEat()
	{
		System.out.println("Eating");
	}
}
class Labrador extends Dog{
	public void dogBark()
	{
		System.out.println("Labrador Barking");
	}
	public void dogEat()
	{
		System.out.println("Labrador Eating");
	}
}
