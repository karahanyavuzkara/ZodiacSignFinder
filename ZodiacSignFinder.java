package patika;
import java.util.Scanner;
public class ZodiacSignFinder {

	public static void main(String[] args) {
		
		int month , day ; 
		Scanner input = new Scanner(System.in);
           
		  System.out.print("Enter your birth month by date : ");
          month = input.nextInt();
          
          System.out.print("Enter your birth day : ");
          day = input.nextInt();
          
         switch (month) {
         
            case 1 :
        	    if( day <= 21 ) { 
        	        System.out.print("You are a Capricorn !!! ");
        	       }
        	    else
        	        System.out.print("You are an Aquarius !!! ");
        	    break;
        	  
            case 2 : 
                if ( day <= 19 ) {
            	    System.out.print("You are an Aquarius !!! ");
            	  }
                 else 
            	    System.out.print("You are a Pisces !!! ");
                break;
                
            case 3 :
            	if (day <= 20 ) {
            		System.out.print("You are a Pisces !!! " );
            	}
            	else 
            		System.out.print("You are an Aries !!! ");
            	break;
            	
            case 4 : 
            	if (day <= 20 ) {
            		System.out.print("You are an Aries !!!");
            	}
            	else 
            		System.out.print("You are a Taurus !!!");
            	break;
            	
            case 5 :
            	if ( day <= 21 ) {
            		System.out.print("You are a Taurus !!!");
            	}
            	else 
            		System.out.print("You are a Gemini !!!");
            	break;
            	
            case 6 : 
            	if ( day <= 22 ) {
            		System.out.print("You are a Gemini !!!");
            	}
            	else 
            		System.out.print("You are a Cancer !!!");
            	break;
            	
            case 7 : 
            	if ( day <= 22 ) {
            		System.out.print("You are a Cancer !!!");
            	}
            	else 
            		System.out.print("You are a Leo !!!");
            	break;
            	
            case 8 : 
            	if ( day <= 22 ) {
            		System.out.print("You are a Leo !!!");
            	}
            	else 
            		System.out.print("You are a Virgo !!!");
            	break;
            	
            case 9 : 
            	if ( day <= 22 ) {
            		System.out.print("You are a Virgo !!!");
            	}
            	else 
            		System.out.print("You are a Libra !!!");
                break;
                
            case 10 : 
            	if ( day <= 22 ) {
            		System.out.print("You are a Libra !!!");
            	}
            	else 
            		System.out.print("You are a Scorpio !!!");
                break;
           
            case 11 : 
            	if ( day <= 21 ) {
            		System.out.print("You are a Scorpio !!!");
            	} 
            	else 
            		System.out.print("You are a Sagittarius !!!");
                break;
            
            case 12 : 
            	if ( day <= 21 ) {
            		System.out.print("You are a Sagittarius !!!");
                }
            	else 
            		System.out.print("You are a Capricorn !!!");
                 break;
         
         }      
	} 
}
 

