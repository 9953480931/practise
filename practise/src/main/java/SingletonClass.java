import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable<SingletonClass> {


	@Override
	public SingletonClass call() throws Exception {
		return SingletonClass.getMyInstance();
	}
	
}

class MyThread2 implements Callable<String> {


	@Override
	public String call() throws Exception {
		return "Success";
	}
	
}

enum SingletonEnum {
	myinstance;
}

public class SingletonClass {
	public static SingletonClass instance;
	
	private SingletonClass(){
		
	}
	public static synchronized SingletonClass getMyInstance(){
		if(instance==null){
			instance = new SingletonClass();
		}
		
		return instance;
		
	} 
	
	
	
public static void main(String[] args) throws InterruptedException, ExecutionException {	
	ExecutorService es = Executors.newFixedThreadPool(10);
		
	List<Future<SingletonClass>> results = new ArrayList<Future<SingletonClass>>();
	
	for(int  i = 0 ; i<=9 ; i++)
	results.add(es.submit(new MyThread()));
	
	for(Future<SingletonClass> result : results)
		System.out.println(result.get());
	
	es.shutdown();
	
}
}
