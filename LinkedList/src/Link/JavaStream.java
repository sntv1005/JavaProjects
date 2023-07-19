package Link;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStream {
	
	
	public static void main(String[] args) {
		List<Product> ProductList= new ArrayList();
		ProductList.add(new Product(1,"HP laptop",18000f));
		ProductList.add(new Product(2,"Lenovo laptop",25000f));
		ProductList.add(new Product(3,"dell laptop",30000f));
		ProductList.add(new Product(4,"Asus laptop",15000f));
		ProductList.add(new Product(5,"MI laptop",20000f));
		System.out.println(ProductList);
		List<Float> collect = ProductList.stream().filter(p->p.price>=25000).map(p->p.price).collect(Collectors.toList());
	System.out.println(collect);	
	
	List<Integer> collect2 = ProductList.stream().filter(p->p.id>=2).map(p->p.id).collect(Collectors.toList());
	System.out.println(collect2);
	
    Set<Integer> set= new HashSet();
    set.add(10);
    set.add(10);
    set.add(9);
    set.add(198);
    set.add(3);
    set.add(1);
    set.add(5);
    set.add(4);
    System.out.println(set);
    
    
	}

}
