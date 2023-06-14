package homeworkFour.shields;

public class Buckler implements Shield{

    @Override
    public int protect() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Buckler -> Protect: %d",protect());
    }
}
