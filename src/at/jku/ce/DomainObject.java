package at.jku.ce;

public class DomainObject {

	private String name;
	
	public String uuid = UUID.randomUUID().toString()

	/**
	* Default constructor
	*/	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id) { 
		super(); 
		this.uuid = id; 
	}
	
	public String getId() { 
		return uuid; 
	}
}
