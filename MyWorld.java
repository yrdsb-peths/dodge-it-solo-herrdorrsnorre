import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        HEro hero = new HEro();
        addObject(hero, 100, 100);
        
        banana banan = new banana();
        addObject(banan, 600, 100);
    }
}
