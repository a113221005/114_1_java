public class Role {
    //角色名稱
    private String name;
    //生命值
    private int health;
    //攻擊力
    private int attactkPower;
    //建構子
    public Role(String name, int health, int attactkPower) {
        this.name = name;
        this.health = health;
        this.attactkPower = attactkPower;
    }
    //取得名稱
    public String getName() {
        return name;
    }
    //取得生命值
    public int getHealth() {
        return health;
    }
    //取得攻擊力
    public int getAttactkPower() {
        return attactkPower;
    }
    //設定生命值
    public void setHealth(int health) {
        this.health = health;
    }

    //檢查是否存活
    public boolean isAlive() {
        return health > 0;
    }
    public String toString() {
        return "角色名稱: " + name + ", 生命值: " + health ;
    }
}
