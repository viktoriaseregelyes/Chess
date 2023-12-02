package rules;

import java.util.ArrayList;

public class SpecialRule {
    private ArrayList<String> specRules = new ArrayList<>();

    public void addSpecRule(String rule) {
        specRules.add(rule);
    }
    public int size() {
        return specRules.size();
    }
    public String get(int i) {
        return specRules.get(i);
    }
}
