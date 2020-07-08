package eby;

public class Main {

    public static void main(String[] args) {
        PlaneFactory factory = new ProductionFactory();

        Plane p1 = factory.productPlane("TPX100");
        System.out.println(p1);

        Plane p2 = factory.productPlane("TPX200");
        System.out.println(p2);

        Plane p3 = factory.productPlane("TPX300");
        System.out.println(p3);
    }
}