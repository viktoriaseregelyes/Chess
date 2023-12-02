package rules;

import java.util.ArrayList;

public class GeneralRule {
    private ArrayList<String> genRules = new ArrayList<>();
    private ArrayList<ArrayList<String>> dir = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> dirNum = new ArrayList<>();

    public GeneralRule() {
        dir.add(new ArrayList<>());
        dirNum.add(new ArrayList<>());
    }

    public void addGenRule(String rule) {
        genRules.add(rule);
    }
    public ArrayList<String> getGenRules() {
        return genRules;
    }
    public int size() {
        return dir.size();
    }
    public ArrayList<String> getDir(int i) {
        return dir.get(i);
    }
    public ArrayList<Integer> getDirNum(int i) {
        return dirNum.get(i);
    }
    public void addDirNum(int ruleNum, int num) {
        if(this.dirNum.size()<=ruleNum) {
            this.dirNum.add(new ArrayList<>());
        }
        this.dirNum.get(ruleNum).add(num);
    }
    public void addDir(int ruleNum, String direction) {
        if(this.dir.size()<=ruleNum) {
            this.dir.add(new ArrayList<>());
        }
        this.dir.get(ruleNum).add(direction);
    }
}
