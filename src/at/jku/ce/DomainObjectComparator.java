package at.jku.ce; 
import java.util.Comparator; 

public class DomainObjectComparator implements Comparator<DomainObject> { 

	public int compare(DomainObject o1, DomainObject o2) {
	return o1.getName().compareTo(o2.getName()); 
	} 
}