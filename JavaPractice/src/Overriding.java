
public class Overriding {

	   
	    Integer method(int i)
	    {
	    	System.out.println("Object"+i);
	        return 10;
	    }
	    
	    Integer method(int... i)
	    {
	    	System.out.println("Premitive"+i);
	        return 10;
	    }
	    public static void main(String[] args) {
	    	Overriding b =new Overriding();
			b.method(10);
		}
	}

