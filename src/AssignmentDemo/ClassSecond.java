package AssignmentDemo;

public class ClassSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1 = new Thread(new Runnable() {
			  // Here by run method
		    public void run() {
		    	
		      synchronized (String.class) {
		        System.out.println("Aquired lock on String.class object :Thread1");
		        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
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
		      synchronized (String.class) {
		        System.out.println("Aquired lock on String.class object: Thread2 ");
		        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // Sleep for 5 seconds
		        synchronized (Integer.class) {
		          System.out.println("Aquired lock on Integer.class object:Thread2");
		        }
		      }
		    }
		  });

		  th1.start();
		  th2.start();
	     }


	}
