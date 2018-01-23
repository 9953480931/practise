import java.io.IOException;

class MyThread5 extends Thread {
	
}
class MyException extends Exception{
	MyException(String str, Throwable c) throws IOException {
		throw new IOException(str,c);
	}
}
public class RunTest{

 public static void main(String[] args) throws IOException, MyException {
	int i=0;
	
	System.out.println("in main");
	try{
	i=5/0;
	}
	catch(Exception e){
		throw new MyException("IO Exception",e);	
	}
finally{
	
	}
	//System.out.println(i);
	
}
 static {System.out.println("static");}
}