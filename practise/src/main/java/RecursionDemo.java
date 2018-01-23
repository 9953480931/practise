
public class RecursionDemo {
	int result=1;
    int factorial(int number){
    	if(number==0)
    		return 1;
	if(number==1){
		return number;
	}
	result = number*factorial(number-1);
	return result;
}
    
    int factorial2(int num) {
    	if(num==0)
    		return 1;
    	while(num!=1){
    		result = result*num;
    		num--;
    		}
    	return result;
    }

	String reverse(String rev) {
		if(rev.length()==0)
			return "";
		return rev.charAt(rev.length()-1) + reverse(rev.substring(0, (rev.length()-1)));
	}
public static void main(String[] args) {
	RecursionDemo rd = new RecursionDemo();
	System.out.println(rd.factorial(5));
	System.out.println(rd.reverse("amit"));
}

}
