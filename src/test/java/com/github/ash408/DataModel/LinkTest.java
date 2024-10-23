import com.github.ash408.DataModel.BaseModel;
import com.github.ash408.DataModel.Link;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LinkTest {
	
	@Test
	public void shouldCreateLink() {
		BaseModel test1 = new BaseModel();
		BaseModel test2 = new BaseModel();

		Link testLink = Link.createLink(test1, test2);
		
		assertTrue(testLink.getFirstID() == test1.getID());
		assertTrue(testLink.getSecondID() == test2.getID());
	}

	@Test
	public void shouldChangeLink() {
		BaseModel test1 = new BaseModel();
		BaseModel test2 = new BaseModel();
		BaseModel test3 = new BaseModel();
		BaseModel test4 = new BaseModel();

		Link testLink = Link.createLink(test1, test2);
		testLink.changeLink(test3, test4);

		assertTrue(testLink.getFirstID() == test3.getID());
		assertTrue(testLink.getSecondID() == test4.getID());
	}
}
