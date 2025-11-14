public class ShieldSwordsMan extends SwordsMan {
    private int defenceCapacity;

    // 建構子：初始化劍士的名稱、生命值和攻擊力
    public ShieldSwordsMan(String name, int health, int attackPower, int defenceCapacity) {
        super(name, health, attackPower);
        this.defenceCapacity = defenceCapacity;
    }

    // 攻擊對手(劍客/魔法師)，父類別的參考指到子類別的物件
    @Override
    public void attack(Role opponent) {
        int reducedDamage = this.getAttackPower() - 5; // 減少5點傷害
        opponent.setHealth(opponent.getHealth() - reducedDamage);
        System.out.println(this.getName() + " 使用盾牌攻擊 " + opponent.getName() + " 造成 " +
                reducedDamage + " 點傷害。" + opponent);
    }

    public int getDefenceCapacity() {
        return defenceCapacity;
    }

    public void defence() {
        this.setHealth(this.getHealth() + defenceCapacity);
        System.out.println(this.getName() + " 使用盾牌防禦，增加 " + defenceCapacity + " 點生命值。" + this);
    }
}



