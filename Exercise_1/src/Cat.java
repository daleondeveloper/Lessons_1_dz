public class Cat {

        private String color;
        private String name;
        private float weigth;
        private boolean sound;


        public Cat(String color, float weigth,  String name){
            this.color = color;
            this.weigth = weigth;
            this.name = name;
        }

        public String give_A_Sound(){
            if(!sound){
                sound = true;
                return "Кіт " + this.name + " почав мяукати";
            }else
                return "Кіт " + this.name + " уже мяукає";

        }

        public String mute_Cat() {
            if (sound) {
                sound = false;
                return "Кіт " + this.name + " перестав мяукати";
            }
            return "Кіт " + this.name + " уже мовчить";
        }
        public void find_Food(float weigth){
            this.weigth += weigth;
            System.out.println(name + " ситий");
        }
        public void take_A_Walk(int second){
            this.weigth -= second*0.1;
            if(weigth < 0.1){
                this.weigth = 0.1f;
            }
            System.out.println(name + " голодний");
        }

        @Override
        public String toString(){
            return "Кіт" + this.name + " вага: " + this.weigth + " колір: " + this.color;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public float getWeigth() {
            return weigth;
        }


}
