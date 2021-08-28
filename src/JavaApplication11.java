public class JavaApplication11 {

    public static void main(String[] args) {


        Rect r1 = new Rect(2,3,-4,2, "Rectangle-0");
        Circle c1 = new Circle(10,2,-1,"Circle-0");

//        System.out.println(r1);
//        System.out.println(c1);

        Shape[] shapes = {
                r1, c1, new Rect(1,2,3,4, "Rectangle-1")
        };

        for (Shape shape: shapes) {
            System.out.println(shape);
        }


        printAreas (shapes);

//        for (Shape shape: shapes) {
//            System.out.println(shapes.);
//        }

    }

    private static void printAreas(Shape[] shapes) {
        for (Shape shape:shapes) {
            if(shape instanceof Rect)
                System.out.println(((Rect)shape).area());
            else if(shape instanceof Circle)
                System.out.println(((Circle)shape).area());
        }
    }

}
