package interview.tesco;

public class Main {
    public static void main(String[] args) {
        NodeClass node=new NodeClass();
        node.data = "A";
        intitailize(node);

        traverseNode(node);
    }

    private static void traverseNode(NodeClass node) {
        if(node==null){
            return;
        }
        traverseNode(node.left);
        System.out.println(node.data);
         traverseNode(node.right);
    }

    private static void intitailize(NodeClass node) {
        NodeClass Bnode = new NodeClass();
        Bnode.data = "B";

        NodeClass bleft = new NodeClass();
        bleft.data = "D";
        Bnode.left = bleft;

        NodeClass bright = new NodeClass();
        bright.data = "E";
        Bnode.right = bright;

        NodeClass cnode = new NodeClass();
        cnode.data = "C";

        NodeClass cright = new NodeClass();
        cright.data = "F";
        cnode.right = cright;

        node.left = Bnode;
        node.right = cnode;


    }
}
