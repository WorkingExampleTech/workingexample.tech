package working.example.tech.AmazonMovieSearch;

import java.util.*;

public class NotMemoryOptimizedTrie implements working.example.tech.interfaces.TestCaseRunner{
    Map<Character, Integer> mSymbols;
    TrieNode mRoot;
    private class TrieNode {
        List<TrieNode> list;
        boolean endOfWord;
        String word;
        TrieNode() {
            list = new ArrayList<>(mSymbols.size());
            for(int i = 0 ; i < mSymbols.size(); i++) {
                list.add(i, null);
            }
            endOfWord = false;
            word = null;
        }
    }
    public NotMemoryOptimizedTrie(Map<Character,Integer> symbols) {
        mSymbols = symbols;
        mRoot  = new TrieNode();
    }

    public void trieDelete(String in) {
        TrieNode temp = mRoot;
        for(char character : in.toCharArray()) {
            int index = mSymbols.get(character);
            temp = temp.list.get(index);
        }
        if(temp != null) {
            temp.word = null;
            temp.endOfWord = false;
        }
    }
    public void trieSearch(String in) {
        TrieNode temp = mRoot;
        for(char character : in.toCharArray()) {
            int index = mSymbols.get(character);
            temp = temp.list.get(index);
            if(null == temp) break;
        }
        System.out.println();
        if(null == temp) {
            System.out.println("Key not found");
        } else {
            searchTrieSubtree(temp);
        }
    }
    public void trieInsert(String in) {
        int index;
        TrieNode temp = mRoot;
        if (in == null) {
            return;
        }
        for(char character : in.toCharArray()) {
            index = mSymbols.get(character);
               if (temp.list.get(index) == null) {
                   temp.list.add(index, new TrieNode());
                   temp = temp.list.get(index);
                } else {
                   temp = temp.list.get(index);
                }
        }
        temp.word = in;
        temp.endOfWord = true;
    }

    public void searchTrieSubtree(TrieNode node) {
        if(null == node) return;
        if (node.endOfWord) {
            System.out.print(node.word + " ");
        }
        for(TrieNode n : node.list) {
            searchTrieSubtree(n);
        }
    }

    @Override
    public void RunTest() {
        Vector<String> dictonary = new Vector<>();
        dictonary.add("watch");
        dictonary.add("pen");
        dictonary.add("pencil");
        dictonary.add("rubber");
        dictonary.add("scale");
        dictonary.add("score");
        for(String str : dictonary) {
            trieInsert(str);
        }
        showOut();
        System.out.println();
        System.out.println("Searching pen");
        trieSearch("pen");
        System.out.println();
        System.out.println("Delete pen");
        trieDelete("pen");
        showOut();
    }

    @Override
    public void showOut() {
        searchTrieSubtree(mRoot);
    }
}
