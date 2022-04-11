package cn.cy._22javafx;

public class Monster {
    private Integer healthpoints;

    public Monster (Integer healthpoints){
        this.healthpoints = healthpoints;
    }

    public Integer getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(Integer healthpoints) {
        this.healthpoints = healthpoints;
    }

    @Override
    public String toString() {
        return "remain:" + this.healthpoints;
    }
}
