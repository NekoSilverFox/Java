public class Demo170UseClassVariate {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("AK-47");

        Hero hero = new Hero("Fox", 17, weapon);

        hero.attack();
    }
}
