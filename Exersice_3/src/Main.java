public class Main {

    public static void main (String[] args){
        Vector3d vector1 = new Vector3d(2,3,4,-1,-4,4);
        Vector3d vector2 = new Vector3d(5,-3,-1,1,1,1);
        Vector3d vector3 = new Vector3d(10,4,-4, 5,7,3);

        System.out.println("Vector1" + vector1.getBegin_XYZ() + "  " + vector1.getEnd_XYZ()  +
                " \n Сложения : " + vector1.addition().toString() +
                "\n Скалярне произведения : " + vector1.scalar_Point() +
         " \n Векторне произаедения вектора : " + vector1.product_Of_Vectors());

        System.out.println("Vector2" + vector2.getBegin_XYZ() + "  " + vector2.getEnd_XYZ() +
                " \n Сложения : " + vector2.addition().toString() +
                "\n Скалярне произведения : " + vector2.scalar_Point() +
                " \n Векторне произаедения вектора : " + vector2.product_Of_Vectors());

        System.out.println("Vector3" + vector3.getBegin_XYZ() + "  " + vector3.getEnd_XYZ()
                + " \n Сложения : " + vector3.addition().toString() +
                "\n Скалярне произведения : " + vector3.scalar_Point() +
                " \n Векторне произаедения вектора : " + vector3.product_Of_Vectors());
    }
}
