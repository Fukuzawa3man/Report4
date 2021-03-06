package jp.ac.uryukyu.ie.e165711;

/**
 * Created by e165711 on 2016/11/26.
 */
public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("ヨシヒコ", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("勇者%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.getIsDead() == false && enemy.getIsDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}
