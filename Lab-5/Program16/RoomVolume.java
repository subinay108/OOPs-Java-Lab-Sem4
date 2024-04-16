
class RoomVolume extends FloorArea{
    double height;
    RoomVolume(double l, double b, double h){
        super(l, b);
        height = h;
    }

    double getVolume(){
        return length * breadth * height;
    }
}
