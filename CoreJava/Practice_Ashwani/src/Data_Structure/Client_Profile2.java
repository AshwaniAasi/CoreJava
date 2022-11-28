package Data_Structure;

public class Client_Profile2 
{
	String name;
	int age;
	String dob;
	String city;
	Client_Profile2(String name, String dob, int age, String city, String pho)
	{
		this.name=name;
		this.age=age;
		this.dob=dob;
		this.city=city;
	}
	void details2()
	{
		System.out.println("Welcome : "+ name);
		System.out.println("age : "+ age);
		System.out.println("dob : "+ dob);
		System.out.println("city : "+ city);
		
	}
}
