public class Triagle {
    private double line_A;
    private double line_B;
    private double line_C;

    public Triagle(double line_A,double line_B, double line_C){
        this.line_A = line_A;
        this.line_B = line_B;
        this.line_C = line_C;
    }
    public double triangle_Area (){
        if((line_A + line_B) > line_C && (line_A + line_C) > line_B && (line_C + line_B) > line_A) {
            double half_Perimeter = (line_A + line_B + line_C) / 2;
            return Math.sqrt(half_Perimeter * (half_Perimeter - line_A) * (half_Perimeter - line_B) * (half_Perimeter - line_C));
        }else
            return 0;

    }
}
