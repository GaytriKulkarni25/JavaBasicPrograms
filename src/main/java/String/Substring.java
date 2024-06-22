package String;

public class Substring {
    public static void main(String[] args) {

        String main="my name is gayatri";

        String sub="name";
        System.out.println(main.matches("(.*)"+ sub+ "(.*)"));



    }
}
