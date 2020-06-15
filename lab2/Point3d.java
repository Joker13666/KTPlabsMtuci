import static java.lang.Math.*;

public class Point3d {

	private double CoordX;
	private double CoordY;
	private double CooedZ;

	//Default constructor
	public Point3d(){
		this(0, 0, 0);
	}

	//Constructor
	public Point3d(double x, double y, double z){
		this.CoordX = x;
		this.CoordY = y;
		this.CooedZ = z;
	}

	//Function will check equivalence
    public boolean Equal(Point3d p) {
        if (this.CoordX == p.getX()) {
            if (this.CoordY == p.getY()) {
                if (this.CooedZ == p.getZ()) {
                    return true;
                }
            }
        }
        return false;
    }

    //Funcrion colculate distace between points
    public double distanceTo(Point3d p) {
        return sqrt(pow(p.getX() - this.CoordX, 2) + pow(p.getY() - this.CoordY, 2) + pow(p.getZ() - this.CooedZ, 2));
    }

	public double getX () {
		return CoordX;
	}

	public double getY () {
		return CoordY;
	}

	public double getZ () {
		return CooedZ;
	}

	public void setX ( double val) {
		CoordX = val;
	}

	public void setY ( double val) {
		CoordY = val;
	}

	public void setZ ( double val) {
		CooedZ = val;
	}

}