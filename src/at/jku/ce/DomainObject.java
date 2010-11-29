package at.jku.ce;

public class DomainObject {

	private String name;
	
	public String id = UUID.randomUUID().toString()

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
	
	public String getId() { 
		return id; 
	}
}
