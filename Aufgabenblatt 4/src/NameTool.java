public class NameTool {

    private static final int GRENZE = 15;
    public static String neuerName(String s1, String s2) {
        String s3 = s1 + " " + s2;
        if (s3.length() > GRENZE) {
            return s3.substring(0, GRENZE);
        }
        return s3;
    }
    public static void main(String[] args){
        System.out.println(neuerName("Murat", "Degermenci123"));

    }
}
