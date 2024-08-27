package interfacesAndAbstractionEx.collectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable {

    @Override
    public String remove() {
        return super.getItems().removeLast();
    }

    @Override
    public int add(String item) {
        super.getItems().addFirst(item);
        return 0;
    }
}
