package com.company.dailyCoding;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {
    public static void main(String[] args) {
        TreeBFS.tree root = new TreeBFS.tree("1");
        TreeBFS.tree rootChild1 = root.addChildNode(new TreeBFS.tree("2"));
        TreeBFS.tree rootChild2 = root.addChildNode(new TreeBFS.tree("3"));
        TreeBFS.tree leaf1 = rootChild1.addChildNode(new TreeBFS.tree("4"));
        TreeBFS.tree leaf2 = rootChild1.addChildNode(new TreeBFS.tree("5"));
        ArrayList<String> output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "5", "3"]

        leaf1.addChildNode(new TreeBFS.tree("6"));
        rootChild2.addChildNode(new TreeBFS.tree("7"));
        output = dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "6", "5", "3", "7"]
    }

    public static ArrayList<String> dfs(tree node) {
        ArrayList<String> values = new ArrayList<>();
        Queue<tree> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            tree currentNode = queue.remove();
            values.add(currentNode.getValue());

            if (currentNode.getChildrenNode() != null) {
                queue.addAll(currentNode.getChildrenNode());
            }
        }
        return values;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
