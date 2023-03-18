package other;
import javax.swing.tree.AbstractLayoutCache;


	
		abstract class insta{
			
		abstract public void login(); //semi-collon is only for abstract method 
		
		}
		
		
		class instagram extends insta
		{
			public void login()
			{
			System.out.println("abc achived ");
			}
			
			
		}
		class abc{
		public static void main(String[] args) {
			insta ref= new instagram();
			ref.login();
			
			
		}
	}


