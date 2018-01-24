import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class VentureProduct {

	static List<VentureProduct> productss = new ArrayList<VentureProduct>();
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

	public VentureProduct(String sku, String ufc, String pname) {
		super();
		this.sku = sku;
		this.ufc = ufc;
		this.pname = pname;
	}

	public VentureProduct() {

	}

	static {
		productss.add(new VentureProduct("123", "8", "A"));
		productss.add(new VentureProduct("123", "7", "B"));
		productss.add(new VentureProduct("123", "6", "C"));
		productss.add(new VentureProduct("124", "8", "A"));
		productss.add(new VentureProduct("124", "6", "C"));
		productss.add(new VentureProduct("125", "6", "C"));
		productss.add(new VentureProduct("126", "6", "C"));
		productss.add(new VentureProduct("125", "6", "C"));
		productss.add(new VentureProduct("127", "6", "C"));
	}

	List<ParentGroup> buildparent(List<VentureProduct> products) {
		HashMap<String,List<VentureProduct>> hm = new HashMap<String,List<VentureProduct>>();
		List<VentureProduct> adnew;
		List<ParentGroup> pgList = new ArrayList<ParentGroup>();
		for (VentureProduct p : products) {
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
		//List<Entry<String, List<VentureProduct>>> listOfParentGroup = new LinkedList<>(hm.entrySet());
		Set<Entry<String, List<VentureProduct>>> listOfParentGroup = hm.entrySet();
		
		for(Entry<String, List<VentureProduct>> parentGroup :listOfParentGroup){
			pgList.add(new ParentGroup(parentGroup.getKey(), parentGroup.getValue()));
		}
		return pgList;
	}

	public static void main(String[] args) {
		VentureProduct v = new VentureProduct();
		List<ParentGroup> ppg = v.buildparent(productss);
		System.out.println(ppg);
	}
}

class ParentGroup {
	String sku;
	List<VentureProduct> products = new ArrayList<>();

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public List<VentureProduct> getProducts() {
		return products;
	}

	public void setProducts(List<VentureProduct> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ParentGroup [sku=" + sku + ", products=" + products + "]";
	}

	public ParentGroup() {
		
	}

	public ParentGroup(String sku, List<VentureProduct> products) {
		super();
		this.sku = sku;
		this.products = products;
	}

	
}
