public abstract class Tree {

    protected String stump;
    protected String branch;
    protected String leaves;

    public Tree() {
        System.out.println("Stwórz drzewo");
    }

    public abstract void grow();

    public String getStump() {
        return stump;
    }

    public void setStump(String stump) {
        this.stump = stump;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }
}
