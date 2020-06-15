import java.util.Scanner;

public class lab1{

	public static void main(String[] args){
		Point3d p1 = new Point3d(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
		Point3d p2 = new Point3d(Double.parseDouble(args[3]),Double.parseDouble(args[4]),Double.parseDouble(args[5]));
		Point3d p3 = new Point3d();

		System.out.println(computeArea(p1, p2, p3));

	}

	public static double computeArea(Point3d p1, Point3d p2, Point3d p3){
		if(p1.Equal(p2) || p2.Equal(p3) || p3.Equal(p1)){
			return 0;
		} else{
			double a = p1.distanceTo(p2), b = p2.distanceTo(p3), c = p3.distanceTo(p1);
            double p = (a+b+c)/2;
            return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		}
	}

/* Perhaps i will use this code

	public static void TowD(){
		
		Point2d myPoint = new Point2d ();//создает точку (0,0)
		Point2d myOtherPoint = new Point2d (5,3);//создает точку (5,3)
		Point2d aThirdPoint = new Point2d ();

		System.out.println(myOtherPoint.getX()+" "+myOtherPoint.getY());

	}
*/
}