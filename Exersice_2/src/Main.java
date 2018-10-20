public class Main{

    public static void main ( String[] args) {
        Triagle triagle1 = new Triagle(1.1,2,3);
        Triagle triagle2 = new Triagle(0.4, 0.3, 4);// трикутник неможливий
        Triagle triagle3 = new Triagle(10,15,6);

        System.out.println("Площа першого трикутник:  " + triagle1.triangle_Area());
        System.out.println("Площа другого трикутник:  " + triagle2.triangle_Area());
        System.out.println("Площа третього трикутник:  " + triagle3.triangle_Area());
    }
}
