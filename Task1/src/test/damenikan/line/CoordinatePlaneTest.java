package test.damenikan.line;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.damenikan.line.creator.LineCreator;
import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;

@RunWith(Parameterized.class)
public class CoordinatePlaneTest {
  	private Point startLine;
  	private Point endLine;
   
  	public  CoordinatePlaneTest (Point startLine, Point endLine){
  		this.startLine = startLine;
  		this.endLine = endLine;
  	}
  	
  	@Parameters
  	public static Collection<Object[]> data() {
  		return Arrays.asList(new Object[][]{
  			{new Point(1,1,2), new Point(2,2,2)}
  		});
    }
 
  	@Test
   public void TestCoordinatePlane() {	 
  		
  		Line line = LineCreator.createLine(this.startLine, this.endLine);
  		
  		Point vector = line.geVector();

  		assertEquals(Collections.frequency(Arrays.asList(new Object[] { vector.getX(), vector.getY(), vector.getZ()}), 0d), 1);
  		
   }
}
