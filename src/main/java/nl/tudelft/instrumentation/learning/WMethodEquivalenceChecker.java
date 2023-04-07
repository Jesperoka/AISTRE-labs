package nl.tudelft.instrumentation.learning;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class WMethodEquivalenceChecker extends EquivalenceChecker{

    private int w;
    private AccessSequenceGenerator accessSequenceGenerator;
    private DistinguishingSequenceGenerator distinguishingSequenceGenerator;

    public WMethodEquivalenceChecker(SystemUnderLearn sul, String[] inputSymbols, int w, DistinguishingSequenceGenerator dg, AccessSequenceGenerator ag) {
        super(sul, inputSymbols);
        this.w = w;
        this.distinguishingSequenceGenerator = dg;
        this.accessSequenceGenerator = ag;
    }

    @Override
    public Optional<Word<String>> verify(MealyMachine hypothesis) {
        List<Word<String>> accessSequences = accessSequenceGenerator.getAccessSequences();
        List<Word<String>> distinguishingSequences = distinguishingSequenceGenerator.getDistinguishingSequences();

        // Check all combinations of access sequences, words of length w, and distinguishing sequences
        for (Word<String> accessSequence : accessSequences) {
            for (Word<String> word : wordsOverAlphabet(inputSymbols, w)) {
                for (Word<String> distinguishingSequence : distinguishingSequences) {
                    // Construct input word from access sequence, word, and distinguishing sequence
                    Word<String> inputWord = accessSequence.append(word).append(distinguishingSequence);

                    // Get outputs from hypothesis and system under learning
                    Word<String> hypothesisOutput = new Word<>(hypothesis.getOutput(inputWord));
                    Word<String> systemUnderLearnOutput = new Word<>(sul.getOutput(inputWord));

                    // If outputs don't match, return counterexample
                    if (!hypothesisOutput.equals(systemUnderLearnOutput)) {
                        return Optional.of(inputWord);
                    }
                }
            }
        }
        // No counterexample found
        return Optional.empty();
    }

    // Helper method to generate all words of length w over an alphabet
    private List<Word<String>> wordsOverAlphabet(String[] alphabet, int w) {
        List<Word<String>> words = new ArrayList<>();
        if (w == 0) {
            // words.add(new Word<String>(Collections.emptyList()));
            return words;
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

}
