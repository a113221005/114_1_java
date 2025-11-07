public class RPG {
    public static void main(String[] args) {
        // 建立劍士和魔法師角色（注意：SwordsMan 目前建構子需要 4 個參數，第四個可設定為 0）
        SwordsMan swordsMan_light = new SwordsMan("光之劍士", 30, 150, 0);
        SwordsMan swordsMan_dark = new SwordsMan("暗之劍士", 25, 180, 0);
        Magician magician_light = new Magician("光之魔法師", 20, 100, 15);
        Magician magician_dark = new Magician("暗之魔法師", 22, 120, 18);

        // 戰鬥過程（示範：劍士攻擊、魔法師治療另一位魔法師、魔法師反擊）
        System.out.println("戰鬥開始");
        swordsMan_light.attack(swordsMan_dark);
        // 暗之魔法師治療 光之魔法師，使用暗之魔法師的治療力
        magician_dark.heal(magician_light, magician_dark.getHealthPower());
        magician_light.attack(magician_dark);
    }
}
