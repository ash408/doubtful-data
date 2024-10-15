package DataModel;

import java.util.UUID;


public class Link extends BaseModel {
	UUID firstID;
	UUID secondID;

	Link(UUID firstID, UUID secondID) {
		this.firstID = firstID;
		this.secondID = secondID;
	}

	
	// PROPERTIES

	public UUID getFirstID() {
		return firstID;
	}

	public void setFirstID(UUID id) {
		firstID = id;
	}

	public UUID getSecondID() {
		return secondID;
	}

	public void setSecondID(UUID id) {
		secondID = id;
	}
}
