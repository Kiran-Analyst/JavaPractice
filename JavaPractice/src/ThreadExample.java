
public class ThreadExample extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Thread t1 = new Thread(new ThreadExample());
			t1.start();
			t1.run();
			t1.wait();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void start(){
		System.out.println("Thread Started");		
	}
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
	}

}
