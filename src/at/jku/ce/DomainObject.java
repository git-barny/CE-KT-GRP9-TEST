package at.jku.ce;

public class DomainObject {

	private String name;
	private String uuid = UUID.randomUUID().toString()

	/**
	* Default constructor
	*/	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String name, String comment) { 
		super(); 
		this.uuid = name; 
	}
	
	public String getId() { 
		return uuid; 
	}
}
