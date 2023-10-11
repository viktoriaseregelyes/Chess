package antlr;

import java.util.HashMap;
import java.util.Map;

public class Env {
    public Env Previous;
    public Map<String, Symbol> table;

    public Env(Env previous) {
        this.table = new HashMap<>();
        this.Previous = previous;
    }

    public Env() {
        this(null);
    }

    public Symbol get(String name) {
        return this.table.containsKey(name) ? this.table.get(name) : this.Previous != null ? this.Previous.get(name) : null;
    }

    public void setValueIfNameExists(String name, Symbol value) throws Exception {
        if (this.table.containsKey(name)) {
            throw new Exception("name " + name + " is already in scope");
        }
        this.table.put(name, value);
    }

    public void set(String name, Symbol value) throws Exception {
        if (this.table.containsKey(name)) {
            throw new Exception("name " + name + " is already in scope");
        }
        this.table.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        if (Previous != null) {
            bld.append(this.Previous.toString());
        }
        bld.append("--------------\n");
        for (Symbol symbol : this.table.values()) {
            bld.append(symbol.toString()).append("\n");
        }
        return bld.toString();
    }
}
