package chapter6.examples.matchinghtmltags;

import mycollections.SinglyLinkedList;
import mycollections.Stack;

public class MatchingHTMLTags {
    public static boolean isMatchHTML(String html) {
        Stack<String> buffer = new SinglyLinkedList<>();
        int j = html.indexOf('<');      // find the first '<'
        while(j != -1) {        // while there are still '<' tags
            int k = html.indexOf('>', j + 1);
            if (k == -1) return false;
            String tag = html.substring(j + 1, k);
            if (!tag.startsWith("/")) {
                buffer.push(tag);
            } else  {
                if (buffer.isEmpty()) {
                    return false;
                }
                if (!tag.substring(1).equals(buffer.pop())) {
                    return false;
                }
            }
            j = html.indexOf('<', k + 1);
        }

        return buffer.isEmpty();
    }
}
