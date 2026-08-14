class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean end = false;
}

class PrefixTree {
    private TrieNode root;

    public PrefixTree() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = this.root;

        for(char c : word.toCharArray()){
            if(!cur.children.containsKey(c)) cur.children.put(c, new TrieNode());
            cur = cur.children.get(c);
        }

        cur.end = true;
    }

    public boolean search(String word) {
        TrieNode cur = this.root;

        for(char c : word.toCharArray()){
            if(!cur.children.containsKey(c)) return false;
            cur = cur.children.get(c);
        }
        
        return cur.end;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = this.root;

        for(char c : prefix.toCharArray()){
            if(!cur.children.containsKey(c)) return false;
            cur = cur.children.get(c);
        }

        return true;
    }
}
