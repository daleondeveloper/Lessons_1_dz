public class Vector3d {
    private VectorXYZ begin_XYZ;
    private VectorXYZ end_XYZ;

    public Vector3d(double begin_X, double begin_Y,double begin_Z, double end_X , double end_Y, double end_Z){
        begin_XYZ = new VectorXYZ(begin_X,begin_Y,begin_Z);
        end_XYZ = new VectorXYZ(end_X,end_Y,end_Z);
    }

    public VectorXYZ addition(){
        return new VectorXYZ(begin_XYZ.X +end_XYZ.X, begin_XYZ.Y + end_XYZ.Y, begin_XYZ.Z + end_XYZ.Z);
    }

    public double scalar_Point(){
        return (begin_XYZ.X * end_XYZ.X + begin_XYZ.Y * end_XYZ.Y + begin_XYZ.Z * end_XYZ.Z);
    }
    public VectorXYZ product_Of_Vectors(){
        return new VectorXYZ(begin_XYZ.Y * end_XYZ.Z - begin_XYZ.Z * end_XYZ.Y,
                begin_XYZ.Z * end_XYZ.X - begin_XYZ.X * end_XYZ.Z,
                begin_XYZ.X * end_XYZ.Y - begin_XYZ.Y *end_XYZ.X);
    }
    public VectorXYZ getBegin_XYZ() {
        return begin_XYZ;
    }

    public VectorXYZ getEnd_XYZ() {
        return end_XYZ;
    }
}
