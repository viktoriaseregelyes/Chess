package rules;

public class Rule {
    private GeneralRule genRule;
    private SpecialRule specRule;
    private String top;

    public Rule() { }
    public Rule(String top, GeneralRule genRule, SpecialRule specRule) {
        this.top = top;
        this.genRule = genRule;
        this.specRule = specRule;
    }

    public GeneralRule getGenRule() {
        return genRule;
    }

    public SpecialRule getSpecRule() {
        return specRule;
    }

    public String getTypeOfPiece() {
        return top;
    }
}
