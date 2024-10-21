package com.github.ash408.DataModel;

import java.util.UUID;


public class BaseModel {
	protected UUID id;

	public BaseModel() {
		id = UUID.randomUUID();
	}

	public UUID getID() {
		return id;
	}
}
