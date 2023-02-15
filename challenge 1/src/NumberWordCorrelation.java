public class NumberWordCorrelation {

    private Integer number;
    private String word;

        public NumberWordCorrelation(String word, Integer number){
            this.number = number;
            this.word = word;
        }

        public String getWord(){ return word; }

        public int getNumber(){ return number; }
}
