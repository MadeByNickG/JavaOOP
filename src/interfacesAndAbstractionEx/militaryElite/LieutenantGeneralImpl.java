package interfacesAndAbstractionEx.militaryElite;

import java.util.List;

public class LieutenantGeneralImpl implements LieutenantGeneral{
    private List<PrivateImpl> privates;

    public LieutenantGeneralImpl(List<PrivateImpl> privates) {
        this.privates = privates;
    }

    @Override
    public void addPrivate(PrivateImpl privates) {
    }
}
