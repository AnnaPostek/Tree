public class Deciduou extends Tree {

    public Deciduou() {
        super();
        System.out.println("Stwórz drzewo liściaste");
        this.branch = "liściaste";
        this.stump = "liściasty";
        this.leaves = "liściaste";
    }

    @Override
    public void grow() {
        System.out.println("Sprawdź jak rośnie drzewo liściaste!");
    }

    @Override
    public String toString() {
        return "Drzewo liściaste{" +
                "pień='" + stump + '\'' +
                ", gałąź='" + branch + '\'' +
                ", liście='" + leaves + '\'' +
                '}';
    }
}
