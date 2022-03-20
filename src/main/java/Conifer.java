public class Conifer extends Tree{

    public Conifer() {
        super();
        System.out.println("Stwórz drzewo iglaste");
        this.branch="iglasta";
        this.stump="iglasty";
        this.leaves="iglaste";
    }

    @Override
    public void grow() {
        System.out.println("Sprawdź jak rośnie drzewo iglaste!");
    }


    @Override
    public String toString() {
        return "Drzewo iglaste{" +
                "pień='" + stump + '\'' +
                ", gałąź='" + branch + '\'' +
                ", liście='" + leaves + '\'' +
                '}';
    }
}
