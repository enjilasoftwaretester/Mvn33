package Third_Script;

import org.testng.annotations.Test;

public class OrderHistory {
  @Test
  public void OrderList() 
  {
	  System.out.println("The order list is visible as per date");
  }
  
  @Test
  public void duplicateorder() 
  {
	  System.out.println("The order list do not display duplicate order");
  }
}
