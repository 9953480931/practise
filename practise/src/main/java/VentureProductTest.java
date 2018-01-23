import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class VentureProductTest {

	static List<VentureProductTest> productss = new ArrayList<VentureProductTest>();
	String sku;
	String ufc;
	String pname;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUfc() {
		return ufc;
	}

	public void setUfc(String ufc) {
		this.ufc = ufc;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "VentureProductTest [sku=" + sku + ", ufc=" + ufc + ", pname=" + pname + "]";
	}

	public VentureProductTest(String sku, String ufc, String pname) {
		super();
		this.sku = sku;
		this.ufc = ufc;
		this.pname = pname;
	}

	public VentureProductTest() {

	}

	static {
		productss.add(new VentureProductTest("123", "8", "A"));
		productss.add(new VentureProductTest("123", "7", "B"));
		productss.add(new VentureProductTest("123", "6", "C"));
		productss.add(new VentureProductTest("124", "8", "A"));
		productss.add(new VentureProductTest("124", "6", "C"));
		productss.add(new VentureProductTest("125", "6", "C"));
		productss.add(new VentureProductTest("126", "6", "C"));
		productss.add(new VentureProductTest("125", "6", "C"));
		productss.add(new VentureProductTest("127", "6", "C"));
	}

	List<ParentGroup> buildparent(List<VentureProductTest> products) {
		HashMap<String,List<VentureProductTest>> hm = new HashMap<String,List<VentureProductTest>>();
		List<VentureProductTest> adnew;
		List<ParentGroup> pgList = new ArrayList<ParentGroup>();
		for (VentureProductTest p : products) {
			if(hm.containsKey(p.getSku())){
				adnew=hm.get(p.getSku());
			    adnew.add(p);
				hm.put(p.getSku(), adnew);
			}
		else{
			adnew =new ArrayList<>();
			adnew.add(p);
			hm.put(p.getSku(),adnew);
		}
			
		}
		List<Entry<String, List<VentureProductTest>>> listOfParentGroup = new LinkedList<>(hm.entrySet());
		
		for(Entry<String, List<VentureProductTest>> parentGroup :listOfParentGroup){
			pgList.add(new ParentGroup(parentGroup.getKey(), parentGroup.getValue()));
		}
		return pgList;
	}

	public static void main(String[] args) {
		VentureProductTest v = new VentureProductTest();
		List<ParentGroup> ppg = v.buildparent(productss);
		System.out.println(ppg);
	}
}

class ParentGroup {
	String sku;
	List<VentureProductTest> products = new ArrayList<>();

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public List<VentureProductTest> getProducts() {
		return products;
	}

	public void setProducts(List<VentureProductTest> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ParentGroup [sku=" + sku + ", products=" + products + "]";
	}

	public ParentGroup() {
		
	}

	public ParentGroup(String sku, List<VentureProductTest> products) {
		super();
		this.sku = sku;
		this.products = products;
	}

	
}
