package eby;

public class Main {

    public static void main(String[] args) {

        PlaneFactory factory1 = new OtherProductionFactory();

        Plane p1 = factory1.productPlane("TPX100");
        System.out.println(p1+"\n");


        PlaneFactory factory2 = new EurasiaProductionFactory();

        Plane p2 = factory2.productPlane("TPX200");
        System.out.println(p2+"\n");


        PlaneFactory factory3 = new DomesticProductionFactory();

        Plane p3 = factory3.productPlane("TPX300");
        System.out.println(p3+"\n");
    }
}