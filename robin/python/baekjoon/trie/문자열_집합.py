class TrieNode:
    def __init__(self):
        self.word = False
        self.children = {}


class Trie:
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        node = self.root
        for char in word:
            if char not in node.children:
                #자식을 타고 내려가다가, 달라지는 문자부터 서로 다른 노드로 분기된다.
                node.children[char] = TrieNode()
            node = node.children[char]
        node.word = True

    def search(self, word: str) -> bool:
        node = self.root
        for char in word:
            if char not in node.children:
                return False
            node = node.children[char]
        return node.word

    def startsWith(self, prefix: str) -> bool:
        node = self.root
        for char in prefix:
            if char not in node.children:
                return False
            node = node.children[char]

        return True


if __name__ == '__main__':
    trie = Trie()
    cnt_search = 0

    n, m = map(int, input().split())

    for i in range(n):
        str_data = str(input())
        trie.insert(str_data)

    for i in range(m):
        str_data = str(input())
        if trie.search(str_data):
            cnt_search += 1

    print(cnt_search)
