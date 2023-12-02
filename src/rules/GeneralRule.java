package rules;

import java.util.ArrayList;

public class GeneralRule {
    private ArrayList<ArrayList<String>> dir = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> dirNum = new ArrayList<>();

    public GeneralRule() {
        dir.add(new ArrayList<>());
        dirNum.add(new ArrayList<>());
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
        if(dirNum.size()<=ruleNum) {
            dirNum.add(new ArrayList<>());
        }
        dirNum.get(ruleNum).add(num);
    }
    public void addDir(int ruleNum, String direction) {
        if(dir.size()<=ruleNum) {
            dir.add(new ArrayList<>());
        }
        dir.get(ruleNum).add(direction);
    }
}
