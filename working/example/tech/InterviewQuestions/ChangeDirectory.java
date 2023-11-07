package working.example.tech.InterviewQuestions;
import working.example.tech.interfaces.TestCaseRunner;
import java.util.Stack;
public class ChangeDirectory implements TestCaseRunner {
    private Stack<Character> mStk;
    public ChangeDirectory() {
        mStk = new Stack<>();
    }

    private void changeDirectory(String in) {
        char prevChar = '*';
        for (char ch : in.toCharArray()) {
            switch (ch) {
                case '.':
                    if (prevChar == '.') {
                        do {
                            mStk.pop();
                        } while(mStk.peek() != '/');
                    }
                    break;
                case '/':
                    if (!(prevChar == '/' || (!mStk.empty() && mStk.peek() == '/'))) {
                        mStk.push('/');
                    }
                    break;
                default:
                    mStk.push(ch);
                    break;
            }
            prevChar = ch;
        }
    }
    @Override
    public void RunTest() {
        changeDirectory("/working//exmaple/../././../is//blog");
        showOut();
    }

    @Override
    public void showOut() {
        StringBuilder stringBuilder = new StringBuilder();
        while(!mStk.empty()) {
            stringBuilder.append(mStk.peek());
            mStk.pop();
        }
        System.out.println("cd " + stringBuilder.reverse());
    }
}
