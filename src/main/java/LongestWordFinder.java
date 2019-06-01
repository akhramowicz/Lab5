import java.util.List;

public class LongestWordFinder {
    public String find(final List<String> words){
        return words.get(findLongestWordIdx(words,1,0));
    }

    private int findLongestWordIdx(List<String> words,int currentIdx, int longestWordIdx) {
        return currentIdx == words.size() ?
                longestWordIdx : words.get(currentIdx).length() > words.get(longestWordIdx).length() ?
                findLongestWordIdx(words,++currentIdx,--currentIdx):findLongestWordIdx(words,++currentIdx,longestWordIdx);
    }
}
