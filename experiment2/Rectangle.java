public class Rectangle {
    public int length;
    public int width;

    public double getKeliling(){
        return 2 * (length + width);
    } 

    public double getLuas(){
        return length * width;
    }

    public void displayInfo(){
        System.out.println("Length      : "+ length);
        System.out.println("Width       : "+ width);
        System.out.println("Keliling    : "+ getKeliling());
        System.out.println("Luas        : "+ getLuas());
    }
}
