package antlr;

public class Symbol {
    private String name;
    private BSType type;

    public Symbol(String name, BSType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public BSType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " : " + type.getName();
    }
}
