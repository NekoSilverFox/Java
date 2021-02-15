public class Demo171Game {
    public static void main(String[] args) {
        Hero hero = new Hero("Fox", new Skill() {
            @Override
            public void useSkill() {
                System.out.println("yyy");
            }
        });

        hero.attack();

        System.out.println("==============");

        Hero hero2 = new Hero();
        hero2.setName("Fox-2");
        hero2.setSkill(new SkillImpl());
        hero2.attack();

        System.out.println("==============");

        Skill skill = new Skill() {
            @Override
            public void useSkill() {
                System.out.println("Yiff yiff");
            }
        };

        Hero hero3 = new Hero("Fox-3", skill);
        hero3.attack();
    }
}
