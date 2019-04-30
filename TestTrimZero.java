import java.io.*;

public class TestTrimZero {
	public static void main (String args[]) {
				
        int i = 0; 
        while (i < args[0].length()-1 && args[0].charAt(i) == '0') 
            i++;
  
        /**
		int i = 0;
		
        for (int j=0; j<args[0].length(); j++) 
		{
			if(args[0].charAt(j) == '0')
				i++;
		}**/
		
        StringBuffer tempSB = new StringBuffer(args[0]);  
        tempSB.replace(0, i, ""); 
        		
		System.out.println(tempSB.toString());
	}
}