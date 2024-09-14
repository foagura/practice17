public class Practice17 {
    public static void main(String[] args) {
        /* 制御文のネスト */
        for (int i = 0 ; i < 10 ; i++) {
            if ((i != 0) && (i % 4 == 0)) {
                System.out.println("iの値" + i + "は4の倍数です");
            } else {
                System.out.println("iの値：" + i);
            }
        }
    }
}
