
public class Democrat extends MazeEscaper {

	@Override
	public void walkDownCurrentSegment() {
		// TODO Auto-generated method stub
		if(!leftIsClear() & frontIsClear()) {
			move();
		}else if(leftIsClear()) {
			turnLeft();
			move();
		}return;
	}

	@Override
	public void turnToTheNextSegment() {
		// TODO Auto-generated method stub
		if(!leftIsClear() & !frontIsClear()) {
			turnRight();
		}return;
	}

}