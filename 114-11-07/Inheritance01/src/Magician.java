public class Magician extends Role {
    //治療力
    private int healPower ; // 每次治療恢復的生命值
    //建構子
    public Magician(String name, int health, int attactkPower, int healPower) {
        super(name, health, attactkPower);
        this.healPower = healPower; // 預設治療力為 10
    }

    //取得治療力
    public int getHealthPower() {
        return healPower;
    }
    //攻擊對手
    public void attack(Magician opponent) {
        opponent.setHealth(opponent.getHealth() - this.getAttactkPower());
        System.out.println(this.getName() + " 使用魔法攻擊 " + opponent.getName() + "，造成 " + this.getAttactkPower() + " 點傷害。" + opponent);

    }
    //治療隊友
    public void heal(Magician ally, int healAmount) {
        ally.setHealth(ally.getHealth() +this.healPower);
            System.out.println(this.getName() + " 治療 " + ally.getName() + "，恢復 " + healPower + " 點生命值。");
    }
    @Override
    public String toString() {
        return super.toString() + ", 治療力: " + healPower;
    }

}

