package antlr;

import java.util.HashMap;

public class TypeSystem {
    private HashMap<String, BSType> types;

    public TypeSystem() {
        this.types = new HashMap<String, BSType>();
        initializeConstants();
    }
    public BSType NULL;
    public BSType ERROR;

    private void initializeConstants() {
        this.ERROR = new BSType("ErrorType");
        this.NULL = new BSType("NullType");
        this.ERROR.getParents().add(this.NULL);
        types.put(this.ERROR.getName(), this.ERROR);
        types.put(this.NULL.getName(), this.NULL);
    }

    public BSType get(String name) {
        if (this.types.containsKey(name))
            return types.get(name);
        return null;
    }

    public BSType createType(String name) {
        if (this.types.containsKey(name))
            return null;
        BSType type = new BSType(name);
        this.types.put(name, type);
        this.NULL.getParents().add(type);
        return type;
    }
}
