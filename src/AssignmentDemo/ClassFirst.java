package AssignmentDemo;

public class ClassFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1 = new Thread(new Runnable() {
			
			  //Here below this is run method.
		    public void run() {
		    	
		      synchronized (String.class) {
		        System.out.println("Aquired lock on String.class object :Thread1");
		        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}     
		        synchronized (Integer.class) {
		          System.out.println("Aquired lock on Integer.class object:Thread1");
		        }
		      }
		    }
		  });

		  Thread th2 = new Thread(new Runnable() {
		    public void run() {
		      synchronized (Integer.class) {
		        System.out.println("Aquired lock on Integer.class object: Thread2 ");
		        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} 
		        synchronized (String.class) {
		          System.out.println("Aquired lock on String.class objec :Thread2");
		        }
		      }
		    }
		  });

		  th1.start();
		  th2.start();
	  }

	}
