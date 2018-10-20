public class Main {

    public static void main (String[] args){
        Cat cat_snilok = new Cat("red", 1.4f,"Сніжок");
        Cat cat_murchuk = new Cat("grey", 2f,"Мурчик");
        Cat cat_markiz = new Cat("grey", 1.0f,"Маркіз");

        System.out.println(cat_snilok.toString() + "\n" + cat_murchuk.toString() + "\n" + cat_markiz);
        cat_snilok.find_Food(0.5f);
        cat_murchuk.find_Food(1f);
        cat_markiz.find_Food(0.1f);

        System.out.println(cat_snilok.toString() + "\n" + cat_murchuk.toString() + "\n" + cat_markiz);
        cat_snilok.take_A_Walk(10);
        cat_snilok.take_A_Walk(100);
        cat_snilok.take_A_Walk(40);

        System.out.println(cat_snilok.toString() + "\n" + cat_murchuk.toString() + "\n" + cat_markiz);

        System.out.println(cat_markiz.give_A_Sound());
        System.out.println(cat_markiz.give_A_Sound());
        System.out.println(cat_murchuk.give_A_Sound());
        System.out.println(cat_markiz.mute_Cat());
    }
}
