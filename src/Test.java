public class Test {
    public static void main(String[] args){
        Area firstArea = new Area(5.3 , 15.2);
        double num = 8.5;
        System.out.println("Is num in first area? " + firstArea.checkNumInArea(num));

        Area secondArea = new Area(4.8 , 10.6);
        System.out.println("Does first area include second area? " + firstArea.checkInclusion(secondArea));
        System.out.println("Does second area intersect second area? " + firstArea.checkIntersection(secondArea));

    }
}
