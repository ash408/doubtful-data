
public class Node extends BaseModel {
	private String name;

	public Node(String name) {
		this.name = name;
	}


	// PROPERTIES	

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}
