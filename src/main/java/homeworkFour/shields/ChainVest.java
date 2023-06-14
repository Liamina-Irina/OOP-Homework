package homeworkFour.shields;

public class ChainVest implements Shield{

    @Override
    public int protect() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("ChainVest -> Protect: %d",protect());
    }
}
