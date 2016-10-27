import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class houses {
public static void main(String[] args) {
	Tortoise.getBackgroundWindow();
Tortoise.setX(100);
Tortoise.setY(400);
Tortoise.show();
	Tortoise.penDown();
	Tortoise.setSpeed(10);
	for (int i = 0; i < 10; i++) {
	drawHouse("small");
	
	}
}
static void drawHouse(String height, String color){
	
	int high = 0;
	if (height.equals("small")){
		high =60;
	}
	if(height.equals("medium")){
		high =120;
	}
	if(height.equals("large")){
		high= 250;
	}
	if(color.equals("Black")){
		Tortoise.setPenColor(Color.BLACK);}
	if (color.equals("blue")) {
		Tortoise.setPenColor(Color.BLUE);}
	if (color.equals(anObject)) {
		
	}
		
		
		
		Tortoise.move(high);
		Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(high);
	Tortoise.turn(270);
	Tortoise.move(20);
	Tortoise.turn(-90);
	


}


}
/*6. Make the method take a color as well as a height. The houses are drawn in that color.


[optional] Set the scene to night time by setting the background to black using Tortoise.getBackgroundWindow().setColor


7. Give the houses peaked roofs


8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.


9. make large houses have flat rooves
*/
