public class SwordsMan  extends Role {
    // 建構子
    public SwordsMan(String name, int health, int attackPower, int healPower) {
        super(name, health, attackPower);
    }

    // 攻擊對手
    public void attack(SwordsMan opponent) {
        opponent.setHealth(opponent.getHealth() - this.getAttactkPower());
        System.out.println(this.getName() + " 攻擊 " + opponent.getName() + " 造成" + this.getAttactkPower() + " damage."+ opponent);
    }

}
