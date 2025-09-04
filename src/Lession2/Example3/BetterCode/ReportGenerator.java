package Lession2.Example3.BetterCode;

import java.util.List;

public class ReportGenerator {

    public void generateReport(List<Generator> generate){
        for(Generator gen: generate){
            gen.generate();
        }
    }
}
