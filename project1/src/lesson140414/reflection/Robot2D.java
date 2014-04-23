package lesson140414.reflection;

public class Robot2D implements Robot {

	int _x;
	int _y;
	// int _vx;
	// int _vy;
	final static int VX = 10;
	final static int VY = 10;
	boolean _moving;

	// начальные координаты
	public Robot2D(int x, int y) {

		_x = x;
		_y = y;
	}

	@Override
	public void forward() {

		_moving = true;
		// _x += _vx;
		_y -= VY;

	}

	@Override
	public void back() {

		_moving = true;
		// _x-=_vx;
		_y += VY;

	}

	@Override
	public void stop() {

		_moving = false;

	}

	@Override
	public void Left() {

		_x -= VX;

	}

	@Override
	public void right() {

		_x += -VX;

	}

}
