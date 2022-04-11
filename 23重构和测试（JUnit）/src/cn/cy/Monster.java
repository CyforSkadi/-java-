package cn.cy;

public class Monster {
    private int hitPoints;

    public Monster(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void hit(int attackPoints){
        if (attackPoints < 0){
            throw new IllegalArgumentException();
        }
        this.hitPoints -= attackPoints;
        this.hitPoints = (this.hitPoints < 0) ? 0 : this.hitPoints;
    }
}
