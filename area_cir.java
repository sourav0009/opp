class Area{
    void area_cir(float r){
        double area=3.14*r*r;
        System.out.println(area);
    }
}
public class area_cir {
    public static void main(String[] args) {
        Area obj=new Area();
        obj.area_cir(5.6f);
    }
}