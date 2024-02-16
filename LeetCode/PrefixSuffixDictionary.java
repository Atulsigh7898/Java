import java.util.ArrayList;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    TrieNode() {
        children = new TrieNode[26]; // Assuming only lowercase alphabets
        isEndOfWord = false;
    }
}

public class PrefixSuffixDictionary {
    private TrieNode root;

    public PrefixSuffixDictionary() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public List<String> searchByPrefixAndSuffix(String prefix, String suffix) {
        List<String> result = new ArrayList<>();
        TrieNode prefixNode = searchPrefix(prefix);
        if (prefixNode != null) {
            searchBySuffix(prefixNode, suffix, prefix, result);
        }
        return result;
    }

    private TrieNode searchPrefix(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return null;
            }
            current = current.children[index];
        }
        return current;
    }

    private void searchBySuffix(TrieNode node, String suffix, String word, List<String> result) {
        if (node.isEndOfWord && word.endsWith(suffix)) {
            result.add(word);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            TrieNode child = node.children[c - 'a'];
            if (child != null) {
                searchBySuffix(child, suffix, word + c, result);
            }
        }
    }

    public static void main(String[] args) {
        PrefixSuffixDictionary dictionary = new PrefixSuffixDictionary();
        dictionary.insert("apple");
        dictionary.insert("banana");
        dictionary.insert("apricot");
        dictionary.insert("apex");
        dictionary.insert("ball");
        dictionary.insert("cat");
        
        String prefix = "ap";
        String suffix = "e";
        
        List<String> words = dictionary.searchByPrefixAndSuffix(prefix, suffix);
        System.out.println("Words with prefix \"" + prefix + "\" and suffix \"" + suffix + "\": " + words);
    }
}
