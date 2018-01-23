
class Testapp{
	int a , b;
	Object obj = new Object();
	
	void setData(int c, int d){
		a=c;
		b=d;
	}
	void showData(){
		System.out.println(a+"----"+b);
	}
	}

public class TestVar {
	public static void main(String[] args) {
		Testapp t = new Testapp();
		t.setData(5, 6);
		t.showData();
		Testapp t2 = new Testapp();
		t2.setData(5, 6);
		t2.showData();
	}
}