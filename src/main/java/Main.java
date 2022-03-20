public class Main {

    public static void main(String[] args) {
        Tree tree1 = new Conifer();
        Tree tree2 = new Deciduou();
        tree1.grow();
        tree2.grow();
        System.out.println(tree1);
        System.out.println(tree2);
    }
}
