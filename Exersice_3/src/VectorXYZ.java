public class VectorXYZ {

    public double X;
    public double Y;
    public double Z;

    public VectorXYZ(double X,double Y,double Z){
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }
    public String toString(){
        return "{" + X + "," + Y + "," + Z + "}";
    }

}
