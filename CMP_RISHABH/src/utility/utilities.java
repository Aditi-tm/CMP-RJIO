package utility;

public class utilities {
	
	
/*    public String generateRandomAlphabet(){
    	String randStr = new String();
   	for (int i = 0; i < 5; i++) {
         randStr = RandomStringUtils.randomAlphabetic(10);
        }
        return randStr.toString();
   
   	retrun "";}
   	
   	
   	
*/
	
	
	
	   public String Find_pathforlabels(String label,String fieldtype)
	   { 
		
		   if (fieldtype.equalsIgnoreCase("label"))
		   {
			   
		   String labelxpath = ("//span[contains(text(), '"+label+"')]"); 
		   return labelxpath;

		   } else 

		   {
	    System.out.println("Label not found");
		
		}
		return fieldtype;
}
	
}
