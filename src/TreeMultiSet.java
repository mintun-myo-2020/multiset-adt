public class TreeMultiSet implements MultiSet {
    private Tree tree;

    public TreeMultiSet (Tree tree) {
        this.tree = tree;
    }
    public boolean add (Object item) {
        this.tree.insert(item);
        return true;
    }
    public void remove (Object item) {
        this.tree.delete_item(item);
    }
    public boolean contains (Object item) {
        return this.tree.contains(item);
    }
    public boolean is_empty () {
        return this.tree_is_empty;
    }
    public int count (Object item) {
        return this.tree.count();
    }
    public int size () {
        return this.tree.length();
    }
}
