public class NamedLoop {
    public static void main(String[] args) {
        outer:

        for (int i = 1; i <= 4; i++) {
            System.out.println("Outer Loop:"+i);

        for (int j = 1; j <= 4; j++) {
            System.out.println("InnerLoop:" + j);
                if (i == 3 && j == 2) {
                    break outer;
                }
            }
        }
    }
}