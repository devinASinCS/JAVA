
public class Republican extends MazeEscaper {

	@Override
	public void walkDownCurrentSegment() {
		// TODO Auto-generated method stub
		if(frontIsClear() & !rightIsClear()) {
			move();
		}else if(rightIsClear()) {
			turnRight();
			move();
		}return;
	}

	@Override
	public void turnToTheNextSegment() {
		// TODO Auto-generated method stub
		if(!frontIsClear() & !rightIsClear()) {
			turnLeft();
		}
	}

}
