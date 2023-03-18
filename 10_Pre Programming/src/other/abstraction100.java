package other;


interface Insta{
	
abstract public void login(); //semi-collon is only for abstract method 

}


class Instagram implements Insta
{
	public void login()			//Not run in eclipse
								// Execute in notepad, cmd
	{
	System.out.println("abc achived ");
	}
	
	
}
class abstraction100{
public static void main(String[] args) {
	Insta ref= new Instagram();
	ref.login();
	
	
}
}


