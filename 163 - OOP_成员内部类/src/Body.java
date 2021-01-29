public class Body {
    public class Heart {
        public void beat() {
            System.out.println("啪叽啪叽！");
            System.out.println("我叫" + name); // 正确写法！
        }
    }

    // 外部类的成员变量
    private String name;

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    // 外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
