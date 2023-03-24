package datastructure.tree;

public class MyTree {
    Node root = null;

    /*
     *                            25
     *                 15                    45
     *             5        17          35
     *                   16    18
     */

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insertItem(25);
        tree.insertItem(15);
        tree.insertItem(45);
        tree.insertItem(5);
        tree.insertItem(17);
        tree.insertItem(16);
        tree.insertItem(18);
        tree.insertItem(35);
        tree.printTree(tree.root);

        if (tree.searchItem(16)) {
            System.out.println("찾았다!!");
        }else
        {
            System.out.println("존재하지 않는값");
        }

        if (tree.searchItem(222)) {
            System.out.println("찾았다!!");
        }else
        {
            System.out.println("존재하지 않는값");
        }
    }


    public class Node {
        int value;
        Node leftNode;
        Node rightNode;

        public Node(int item) {
            this.value = item;
            leftNode = null;
            rightNode = null;
        }
    }

    public boolean insertItem(int item) {
        boolean result = false;
        if (root == null) {
            root = new Node(item);
            result = true;
        } else {
            Node head = root;
            while (true) {
                if (head.value < item) {
                    if (head.rightNode != null) {
                        head = head.rightNode;
                    } else {
                        head.rightNode = new Node(item);
                        result = true;
                        break;
                    }
                } else {
                    if (head.leftNode != null) {
                        head = head.leftNode;
                    } else {
                        head.leftNode = new Node(item);
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }

    //중위 순회
    public void printTree(Node root) {
        if (root != null) {
            //System.out.println(root.value); //전위 순회
            printTree(root.leftNode);
            System.out.println(root.value); //중위 순회
            printTree(root.rightNode);
            //System.out.println(root.value); //후위 순회
        } else {
            return;
        }
    }

    //검색
    public boolean searchItem(int item) {
        Node head = this.root;
        if (head != null) {
            while (head != null) {
                if (head.value == item) {
                    return true;
                } else {
                    if (head.value > item) {
                        head = head.leftNode;
                    } else {
                        head = head.rightNode;
                    }
                }
            }
        } else {
            return false;
        }
        return false;
    }


    public boolean deleteItem(int item) {
        Node head = this.root;
        if (head != null) {
            while (head != null) {
                if (head.value == item) {
                    if(head.rightNode != null){
                        Node temp = head.rightNode;
                        while(head.leftNode!= null){
                            head = head.leftNode;
                        }

                    }
                    return true;
                } else {
                    if (head.value > item) {
                        head = head.leftNode;
                    } else {
                        head = head.rightNode;
                    }
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
