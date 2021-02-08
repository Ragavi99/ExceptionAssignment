package ExceptionAssignment;

class AgeException extends RuntimeException
{
	String age;

	public AgeException(String age) {
		super("age");
		this.age = age;
		System.out.println("this is constructor "+age);
	}

	@Override
	public String toString() {
		return "AgeException [age=" + age + "]";
	}	             
}

class User
{
	void CheckAge(int age)
	{
		if(age<18)
		{
			throw new AgeException("you are not eligible");
		}
		else
		{
			System.out.println("you are  eligible");
		}
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		
		User u = new User();
		u.CheckAge(16);
		 
		

	}

}
