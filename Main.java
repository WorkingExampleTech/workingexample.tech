import working.example.tech.AmazonMovieSearch.NotMemoryOptimizedTrie;

import working.example.tech.interfaces.TestCaseRunner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*TestCaseRunner wVideoHist = new WatchedVideoDayHistory();
        wVideoHist.RunTest();
        TestCaseRunner youTubeContoller = new YoutubeAppController();
        youTubeContoller.RunTest();
        ChangeDirectory cd = new ChangeDirectory();
        cd.RunTest();
        TestCaseRunner lesserElm = new LesserElementBST();
        lesserElm.RunTest();
        TestCaseRunner mergeKlist = new MergeKSortedList();
        mergeKlist.RunTest();
        TestCaseRunner reverse = new ReverseSLL();
        reverse.RunTest();*/
        Map<Character, Integer> symbols= new HashMap<Character,Integer>(){{
            put('a',0);put('b',1);put('c',2);
            put('d',3);put('e',4);put('f',5); put('g',6);
            put('h',7);put('i',8);put('j',9);
            put('k',10);put('l',11);put('m',12);put('n',13);put('o',14);
            put('p',15);put('q',16);put('r',17);put('s',18);put('t',19);put('u',20);
            put('v',21);put('w',22);put('x',23);put('y',24);
            put('z',25);
        }};
        TestCaseRunner noOpTrie = new NotMemoryOptimizedTrie(symbols);
        noOpTrie.RunTest();
    }
}