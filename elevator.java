
/**
 * Write a description of class elevator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elevator
{
    // instance variables - replace the example below with your own
    private int current_floor;
    private int top_floor;

   public elevator ()
   
  {
     current_floor = 0;
      top_floor = 11;
    }
    
    public void ascend ()
    
    {
        
       if (current_floor < top_floor) {
           current_floor = current_floor + 1;
           
    }
    else {
      System.out.println("You are already at the top floor! Please go down!");  
        
    }
}
}
