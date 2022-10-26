package AbstractClasses.Challenge;

public class SearchTree {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }


    private void performRemoval(ListItem item, ListItem parent) {
        return false
    }

    @Override
    public void traverse(ListItem root) {

    }

}
