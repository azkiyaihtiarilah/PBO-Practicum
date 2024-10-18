public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 5;
        rectangle1.width = 3;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 10;
        rectangle2.width = 6;

        Rectangle rectangle3 = new Rectangle();
        rectangle3.length = 16;
        rectangle3.width = 8;

        System.out.println("Rectangle1");
        rectangle1.displayInfo();
        rectangle1.getLuas();
        rectangle1.getKeliling();

        System.out.println();
        System.out.println("Rectangle2");
        rectangle2.displayInfo();
        rectangle2.getLuas();
        rectangle2.getKeliling();

        System.out.println();
        System.out.println("Rectangle3");
        rectangle3.displayInfo();
        rectangle3.getLuas();
        rectangle3.getKeliling();
    }
}
