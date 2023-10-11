package antlr;

import java.util.HashSet;

public class BSType {
    private String name;
    private HashSet<BSType> parents;

    public BSType(String name) {
        this.name = name;
        this.parents = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public HashSet<BSType> getParents() {
        return parents;
    }

    public boolean inheritsFrom(BSType t) {
        return this == t || this.parents.stream().anyMatch(p -> p.inheritsFrom(t));
    }
}