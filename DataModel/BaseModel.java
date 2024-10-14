import java.util.UUID;


public class BaseModel {
	protected UUID id;

	public BaseModel() {
		id = UUID.randomUUID();
	{

	public UUID getID() {
		return id;
	}
}
