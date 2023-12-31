package edu.hitsz.bullet;

import edu.hitsz.bombAct.bombActivate;

/**
 * @Author hitsz
 */
public class EnemyBullet extends BaseBullet implements bombActivate {

    public EnemyBullet(int locationX, int locationY, int speedX, int speedY, int power) {
        super(locationX, locationY, speedX, speedY, power);
    }


    @Override
    public void update() {
        this.vanish();
    }
}
