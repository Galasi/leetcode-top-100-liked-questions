package toplikedquestions;

/*
 * 提交时把类名、构造函数名从Problem_0208_Trie改为Trie
 *
 * 208. 实现 Trie (前缀树) 【中等】
 * https://leetcode-cn.com/problems/implement-trie-prefix-tree/
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。

示例:
Trie trie = new Trie();
trie.insert("apple");
trie.search("apple");   // 返回 true
trie.search("app");     // 返回 false
trie.startsWith("app"); // 返回 true
trie.insert("app");
trie.search("app");     // 返回 true
说明:
你可以假设所有的输入都是由小写字母 a-z 构成的。
保证所有输入均为非空字符串。
 * */
public class Problem_0208_Trie {

	public static class Node {
		public boolean end;
		public Node[] nexts;

		public Node() {
			end = false;
			nexts = new Node[26];
		}
	}

	private Node root;

	public Problem_0208_Trie() {
		root = new Node();
	}

	public void insert(String word) {
		if (word == null) {
			return;
		}
		char[] str = word.toCharArray();
		Node node = root;
		int path = 0;
		for (int i = 0; i < str.length; i++) {
			path = str[i] - 'a';
			if (node.nexts[path] == null) {
				node.nexts[path] = new Node();
			}
			node = node.nexts[path];
		}
		node.end = true;
	}

	public boolean search(String word) {
		if (word == null) {
			return false;
		}
		char[] chs = word.toCharArray();
		Node node = root;
		int index = 0;
		for (int i = 0; i < chs.length; i++) {
			index = chs[i] - 'a';
			if (node.nexts[index] == null) {
				return false;
			}
			node = node.nexts[index];
		}
		return node.end;
	}

	public boolean startsWith(String pre) {
		if (pre == null) {
			return false;
		}
		char[] chs = pre.toCharArray();
		Node node = root;
		int index = 0;
		for (int i = 0; i < chs.length; i++) {
			index = chs[i] - 'a';
			if (node.nexts[index] == null) {
				return false;
			}
			node = node.nexts[index];
		}
		return true;
	}

	public static void main(String[] args) {
		Problem_0208_Trie trie = new Problem_0208_Trie();
		trie.insert("apple");
		trie.search("apple");   // 返回 true
//		trie.search("app");     // 返回 false
//		trie.startsWith("app"); // 返回 true
//		trie.insert("app");
//		trie.search("app");     // 返回 true
	}

}
