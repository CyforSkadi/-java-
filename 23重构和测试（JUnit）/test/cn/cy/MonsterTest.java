package cn.cy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonsterTest {

    Monster monster;

    //Before/After后的方法会在每个测试函数运行前/后执行
    @BeforeEach
    void setUp() {
        this.monster = new Monster(100);
    }

    @AfterEach
    void tearDown() {
        this.monster = null;
    }

    @Test
    public void test1(){
        this.monster.hit(20);
        this.monster.hit(60);
        this.monster.hit(30);
        assertEquals(0, this.monster.getHitPoints());
    }

    @Test
    public void test2() {
        this.monster.hit(20);
        this.monster.hit(60);
        this.monster.hit(30);
        assertEquals(0, this.monster.getHitPoints());
    }

    @Test //(expected = IllegalArgumentException.class) //添加测试的异常检测或者时间要求
    void test3() {
        this.monster.hit(-20);
    }
}