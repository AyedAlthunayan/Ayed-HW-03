public class Exercise04 {
    public static void main(String[] args) {
        String array[] = {
                "Ahmed", "Khaled", "Adnan", "Ayed", "Yousef",
                  "Mobark", "Amgd", "Salem","Frhan", "Meshal"
        };
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == 'A'){
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
