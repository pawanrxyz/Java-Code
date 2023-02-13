class AccessMem {
    int length,width;
    void getData(int x,int y) {
        length = x;
        width = y;
    }
    int rectArea() {
        int area = length*width;
        return (area);
    }
}
public class AccessClass {
    public static void main(String[] args) {
        int area1,area2;
        AccessMem m = new AccessMem();
        AccessMem m1 = new AccessMem();
        m.length = 23;
        m.width = 12;
        area1 = m.length*m.width;
        m1.getData(12,34);
        area2 = m1.rectArea(); 
        System.out.println("Area1:"+ area1);
        System.out.println("Area2:"+ area2);
    }    
}
