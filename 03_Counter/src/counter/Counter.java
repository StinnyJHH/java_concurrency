package counter;

public class Counter {
	private int count;
	private Object lock = new Object();
	/**
	 * Multiple threads share the counter object, and they 
	 * may call the inc() methods concurrently.
	 */
	public void inc(){	
	    //		synchronized(this) {
			count++;
			//	}
	}
	
	public  int get(){
		return count;
	}

}
