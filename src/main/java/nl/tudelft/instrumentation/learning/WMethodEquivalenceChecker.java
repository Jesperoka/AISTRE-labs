package nl.tudelft.instrumentation.learning;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class WMethodEquivalenceChecker extends EquivalenceChecker{

    private int w;
    private AccessSequenceGenerator accessSequenceGenerator;
    private DistinguishingSequenceGenerator distinguishingSequenceGenerator;
    private List<Word<String>> accessSequences;
    private List<Word<String>> distinguishingSequences;
    private List<Word<String>> wordsOfLengthW;

    public WMethodEquivalenceChecker(SystemUnderLearn sul, String[] inputSymbols, int w, DistinguishingSequenceGenerator dg, AccessSequenceGenerator ag) {
        super(sul, inputSymbols);
        this.w = w;
        this.distinguishingSequenceGenerator = dg;
        this.accessSequenceGenerator = ag;
    }

    @Override
    public Optional<Word<String>> verify(MealyMachine hypothesis) {
        if (wordsOfLengthW == null) wordsOfLengthW = wordsOverAlphabet(inputSymbols, w);

        accessSequences = accessSequenceGenerator.getAccessSequences();
        distinguishingSequences = distinguishingSequenceGenerator.getDistinguishingSequences();

        // Check all combinations of access sequences, words of length w, and distinguishing sequences
        for (Word<String> accessSequence : accessSequences) {
            for (Word<String> word : wordsOfLengthW) {
                for (Word<String> distinguishingSequence : distinguishingSequences) {
                    // Construct input word from access sequence, word, and distinguishing sequence
                    Word<String> inputWord = accessSequence.append(word).append(distinguishingSequence);

                    // Get outputs from hypothesis and system under learning
                    String[] hypothesisOutput = hypothesis.getOutput(inputWord);
                    String[] systemUnderLearnOutput = sul.getOutput(inputWord);

                    // If outputs don't match, return counterexample
                    for (int j = 0; j < hypothesisOutput.length; j++) {
                        if (!hypothesisOutput[j].equals(systemUnderLearnOutput[j])) {
                            return Optional.of(new Word<String>(inputWord.asList().subList(0, j + 1)));
                        }
                    }
                }
            }
        }
        // No counterexample found
        return Optional.empty();
    }

    // Helper method to generate all words of length w over an alphabet (WE'VE GOTTEN CORRECT RESULTS WITH THIS ONE)
    private List<Word<String>> wordsOverAlphabet(String[] alphabet, int w) {
        List<Word<String>> words = new ArrayList<>();
        if (w == 0) {
            words.add(new Word<String>(new String[] {}));
        } else {
            List<Word<String>> suffixes = wordsOverAlphabet(alphabet, w - 1);
            for (String symbol : alphabet) {
                for (Word<String> suffix : suffixes) {
                    words.add(suffix.append(symbol));
                }
            }
        }
        return words;
    }

    // Helper method to generate all words of length <= w over an alphabet (THIS IS THEORETICALLTY THE CORRECT ONE ACCORDING TO SLIDES, BUT THE WAY COUNTEREXAMPLES WORK MEANS THE ABOVE JUST WORKS)
    private static List<Word<String>> wordsOverAlphabet2(String[] alphabet, int w) {
        List<Word<String>> words = new ArrayList<>();
        words.add(new Word<String>(new String[] {})); // add empty word to allow for appending
        for (int i = 1; i <= w; i++) {
            List<Word<String>> newWords = new ArrayList<>();
            for (Word<String> word : words) {
                for (String symbol : alphabet) {
                    newWords.add(word.append(symbol));
                }
            }
            words.addAll(newWords);
        }
        words.remove((int) 0); // remove empty word, since its covered by access sequence
        return words;
    }
}
