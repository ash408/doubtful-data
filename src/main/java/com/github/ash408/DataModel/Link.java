package com.github.ash408.DataModel;

import java.util.UUID;


public class Link extends BaseModel {
	private UUID firstID;
	private UUID secondID;

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


	// METHODS

	public static Link createLink(BaseModel model1, BaseModel model2) {
		return new Link(model1.id, model2.id);
	}

	public void changeLink(BaseModel model1, BaseModel model2) {
		firstID = model1.id;
		secondID = model2.id;
	}
}
