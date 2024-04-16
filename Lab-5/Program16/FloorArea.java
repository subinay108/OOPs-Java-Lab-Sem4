class FloorArea {
    double length, breadth;
    
    FloorArea(double l, double b){
        length = l;
        breadth = b;
    }

    double getArea(){
        return length * breadth;
    }
}