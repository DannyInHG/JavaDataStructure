package tree;

public class TreeApp {
	public static void main(String[] args)
	{
		Tree biTree = new Tree();
		Node node = null;
		biTree.createTree(node);
		biTree.preOrderTraverse(biTree.getRoot());
		biTree.findNodeForBST('E', biTree.getRoot());
	}
}
