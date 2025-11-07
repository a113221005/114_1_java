// 檔案：Main.java
// 說明：示範使用 SwordsMan（所有輸出與註解以繁體中文顯示）
public class Main {
    public static void main(String[] args) {
        SwordsMan a = new SwordsMan("亞瑟", 100, 15);
        SwordsMan b = new SwordsMan("莉亞", 80, 20);

        System.out.println("戰鬥開始！");
        int round = 1;
        while (a.isAlive() && b.isAlive()) {
            System.out.println("第 " + round + " 回合：");

            a.attack(b);
            if (!b.isAlive()) {
                System.out.println(b.getName() + " 被擊敗！");
                break;
            }

            b.attack(a);
            if (!a.isAlive()) {
                System.out.println(a.getName() + " 被擊敗！");
                break;
            }

            System.out.println(a.getName() + " 生命：" + a.getHealth() + "，" + b.getName() + " 生命：" + b.getHealth());
            round++;
        }

        System.out.println("戰鬥結束。");
    }
}

