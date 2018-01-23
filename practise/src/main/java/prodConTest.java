import java.util.LinkedList;

class Proces {

	LinkedList<Integer> ll = new LinkedList<>();
	int capacity = 2;
	int value = 0;

	String str;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((ll == null) ? 0 : ll.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proces other = (Proces) obj;
		if (capacity != other.capacity)
			return false;
		if (ll == null) {
			if (other.ll != null)
				return false;
		} else if (!ll.equals(other.ll))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {

				if (ll.size() == capacity)
					wait();
				ll.add(value);
				System.out.println("Produced ----->  " + value);
				value++;
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {

		while (true) {

			synchronized (this) {

				if (ll.isEmpty())
					wait();
				int val = ll.removeFirst();

				System.out.println("consumed--------> " + val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}

public class prodConTest {

	public static void main(String[] args) throws InterruptedException {

		Proces p = new Proces();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					p.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
	
}
