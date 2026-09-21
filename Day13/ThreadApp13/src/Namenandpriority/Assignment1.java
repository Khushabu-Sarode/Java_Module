package Namenandpriority;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Thread t = Thread.currentThread();
//           System.out.println(t.getName()); // main
//           System.out.println(t.getPriority()); // 5
           
           t.setName("App");
//           t.setPriority(0);
           
           t.setPriority(Thread.MAX_PRIORITY);
           
           System.out.println(t.getName());
           System.out.println(t.getPriority());            
           
           
	}

}
