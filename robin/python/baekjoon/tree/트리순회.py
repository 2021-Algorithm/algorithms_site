"""

전위 순회(preorder): 루트 -> 왼쪽 자식 -> 오른쪽 자식
중위 순회(inorder): 왼쪽 자식 -> 루트 -> 오른쪽 자식
후위 순회(postorder): 왼쪽 자식 -> 오른쪽 자식 -> 루트
"""

import sys

sys.setrecursionlimit(10 ** 6)


def preorder(node):
    if node == '.':
        return

    print(node, end="")  # 루트
    preorder(tree[node][0])  # 왼쪽 자식
    preorder(tree[node][1])  # 오른쪽 자식


def inorder(node):
    if node == '.':
        return

    inorder(tree[node][0])  # 왼쪽 자식
    print(node, end="")  # 루트
    inorder(tree[node][1])  # 오른쪽 자식


def postorder(node):
    if node == '.':
        return

    postorder(tree[node][0])  # 왼쪽 자식
    postorder(tree[node][1])  # 오른쪽 자식
    print(node, end="")  # 루트


if __name__ == '__main__':
    n = int(input())
    tree = {}

    for _ in range(n):
        root, left, right = input().split()
        tree[root] = (left, right)

    preorder('A')
    print()
    inorder('A')
    print()
    postorder('A')
