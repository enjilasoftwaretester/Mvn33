package Second_Script;

import org.testng.annotations.Test;

public class HomePage {
  @Test
  public void SearchOption() 
  {
	  System.out.println("The user is able to search product through search bar");
  }
  
  @Test
  public void Product() 
  {
	 System.out.println("The product image is displayed in correct order"); 
  }
  
  @Test
  public void Menue() 
  {
	 System.out.println("The menue table have all required features "); 
  }
  
  @Test
  public void CustomerLinks() 
  {
	  System.out.println("The links are clickable ");
  }
}
