package rules;

import java.util.ArrayList;

public class GeneralRule {
    private ArrayList<String> genRules = new ArrayList<>();

    public void addGenRule(String rule) {
        genRules.add(rule);
    }

    public ArrayList<String> getGenRules() {
        return genRules;
    }

    public int size() {
        return genRules.size();
    }

}
