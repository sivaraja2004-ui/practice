class TrieNode {
    boolean flag;
    TrieNode[] child;
    public TrieNode() {
        flag = false;
        child = new TrieNode[26];
    }
}

class Solution {
    TrieNode root;
    public Solution(){
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            if(cur.child[ch-'a']==null) {
                cur.child[ch-'a'] = new TrieNode();
            }
            cur= cur.child[ch-'a'];
        }
        cur.flag = true;
    }

    public String longestCommonPrefix(String[] strs) {
        root = new TrieNode();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<strs.length;i++) {
            insert(strs[i]);
        }
        TrieNode cur= root;
        while(cur!=null) {
            int childcount = 0;
            TrieNode next = null;
            int index=-1;
            for(int i=0;i<26;i++) {
                if(cur.child[i]!=null) {
                    childcount++;
                    next = cur.child[i];
                    index = i;
                }
            }
            if(childcount>1 || cur.flag)
            break;
            res.append((char)('a' + index));
            cur = next;
        }
        return res.toString();

    }
}