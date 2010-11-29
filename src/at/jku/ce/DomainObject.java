package at.jku.ce;

public class DomainObject {

	private String name;
	
	public String id;

	/**
	* Default constructor
	*/	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id) { 
		super(); 
		this.id = id; 
	}

}
