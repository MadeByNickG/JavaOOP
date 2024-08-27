package interfacesAndAbstractionEx.collectionHierarchy;

public class MyListImpl extends Collection implements MyList{

    @Override
    public int getUsed() {
        return super.getItems().size();
    }

    @Override
    public String remove() {
        return super.getItems().removeFirst();
    }

    @Override
    public int add(String item) {
        super.getItems().addFirst(item);
        return 0;
    }
}
