package string_programs;

public class StringVsBuilderVsBuffer {
	    long startTime = 0l;
	    long endTime = 0l;
	    long timeDiff = 0l;
	    // Concatenate operation using String 
	    public void concatTest1(String website) 
	    { 
	        startTime = System.nanoTime();
	        website = website + ".com";
	        endTime = System.nanoTime();
	        timeDiff = endTime - startTime;
	        System.out.println("Concat time by String: " + timeDiff);
	    } 
	 
	    // Concatenate operation using StringBuilder 
	    public void concatTest2(StringBuilder website) 
	    {  
	        startTime = System.nanoTime();
	        website.append(".com"); 
	        endTime = System.nanoTime();
	        timeDiff = endTime - startTime;
	        System.out.println("Concat time by StringBuilder: " + timeDiff);
	    } 
	 
	    // Concatenate operation using StringBuffer 
	    public void concatTest3(StringBuffer website) 
	    { 
	        startTime = System.nanoTime();
	        website.append(".com");
	        endTime = System.nanoTime();
	        timeDiff = endTime - startTime;
	        System.out.println("Concat time by StringBuffer: " + timeDiff);
	    } 
	 
	    public static void main(String[] args) 
	    { 
	    	StringVsBuilderVsBuffer object = new StringVsBuilderVsBuffer();
	        String website1 = "w3schools"; 
	        object.concatTest1(website1);
	 
	        StringBuilder website2 = new StringBuilder("w3schools"); 
	        object.concatTest2(website2);
	 
	        StringBuffer website3 = new StringBuffer("w3schools"); 
	        object.concatTest3(website3); 
	    }

}
