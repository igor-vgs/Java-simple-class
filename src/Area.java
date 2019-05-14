public class Area {
    private double leftBorder, rightBorder;

    public Area(double leftBorder, double rightBorder){
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
    }

    public boolean checkInclusion(Area other){
        return leftBorder < other.leftBorder && leftBorder < other.rightBorder && rightBorder > other.leftBorder && rightBorder > other.rightBorder;
    }
    public boolean checkIntersection(Area other){
        return !((other.leftBorder < leftBorder && other.rightBorder < leftBorder && other.leftBorder < rightBorder && other.rightBorder < rightBorder)||(other.leftBorder > leftBorder && other.leftBorder > rightBorder && other.rightBorder > leftBorder && other.rightBorder > rightBorder));
    }
    public boolean checkNumInArea(double n){
        return n > leftBorder && n < rightBorder;
    }

    public String toString(){
        return "(" + leftBorder +", " + rightBorder +")";
    }
}
