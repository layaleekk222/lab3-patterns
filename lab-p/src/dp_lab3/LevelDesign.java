/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_lab3;

 interface GameLevelPrototype extends Cloneable {
    GameLevelPrototype clone()throws CloneNotSupportedException;
    void modify();
}


 class CloneFactory1{
    public GameLevelPrototype getClone(GameLevelPrototype d) throws CloneNotSupportedException{
        return d.clone();
    }
}

 class Enemy implements GameLevelPrototype {
    @Override
    public GameLevelPrototype clone() throws CloneNotSupportedException {
        try {
            return (GameLevelPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for Enemy", e);
        }
    }

    @Override
    public void modify() {
        System.out.println("Modifying the Enemy placement in the game level...");
        // Additional modification logic for Enemy
    }
}

 class Obstacle implements GameLevelPrototype {
    @Override
    public GameLevelPrototype clone() throws CloneNotSupportedException {
        try {
            return (GameLevelPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for Obstacle", e);
        }
    }

    @Override
    public void modify() {
        System.out.println("Modifying the Obstacle in the game level...");
        // Additional modification logic for Obstacle
    }
}
 class Terrain implements GameLevelPrototype {
    @Override
    public GameLevelPrototype clone() throws CloneNotSupportedException {
        try {
            return (GameLevelPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for Terrain", e);
        }
    }

    @Override
    public void modify() {
        System.out.println("Modifying the Terrain in the game level...");
        // Additional modification logic for Terrain
    }
}
public class LevelDesign {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        GameLevelPrototype terrain = new Terrain();
        GameLevelPrototype obstacle = new Obstacle();
        GameLevelPrototype enemy = new Enemy();

      
        CloneFactory1 factory = new CloneFactory1();

        GameLevelPrototype modifiedTerrain = factory.getClone(terrain);
        modifiedTerrain.modify();

        GameLevelPrototype modifiedObstacle = factory.getClone(obstacle);
        modifiedObstacle.modify();

        GameLevelPrototype modifiedEnemy = factory.getClone(enemy);
        modifiedEnemy.modify();

     
        System.out.println("Original Terrain Hash Code: " + System.identityHashCode(terrain));
        System.out.println("Cloned Terrain Hash Code: " + System.identityHashCode(modifiedTerrain));

        System.out.println("Original Obstacle Hash Code: " + System.identityHashCode(obstacle));
        System.out.println("Cloned Obstacle Hash Code: " + System.identityHashCode(modifiedObstacle));

        System.out.println("Original Enemy Hash Code: " + System.identityHashCode(enemy));
        System.out.println("Cloned Enemy Hash Code: " + System.identityHashCode(modifiedEnemy));
    }
}
