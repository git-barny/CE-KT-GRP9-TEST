package at.jku.ce;

public class DomainObject {

	private String name;
	private String uuid = UUID.randomUUID().toString()
	private String comment;
	
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
	
	public String getComment() { 
		return comment; 
	} 
	
	public void setComment(final String comment) { 
		this.comment = comment; 
	}
	
	public String getName() { 
		return name; 
	} 
	
	public void setName(final String name) { 
		this.name = name; 
	}

	public String toString() { 
		return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]"; 
	}

	public boolean equals(Object obj) { 
		if (!(obj instanceof DomainObject)) { 
			return false; 
		} 

		DomainObject domainObj = (DomainObject) obj; 
		return uuid.equals(domainObj.getUuid()); }

}
