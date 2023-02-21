public class Playing_Cat {
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        if (summer){
         if (temperature >=25 && temperature<=45){
             return true;
         }
         else{
             return false;
         }
    }
        else {
            if (temperature >=25 && temperature<=35){
                return true;
            }
            else{
                return false;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 20));
    }
}
