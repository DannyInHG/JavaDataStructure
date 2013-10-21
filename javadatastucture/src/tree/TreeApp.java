package tree;

public class TreeApp {
	public static void main(String[] args)
	{
		Tree biTree = new Tree();
//		Node node = null;
//		biTree.createTree(node);
		
		biTree.insertNodeForBST('I');
		biTree.insertNodeForBST('E');
		biTree.insertNodeForBST('D');
		biTree.insertNodeForBST('X');
		biTree.insertNodeForBST('A');
		biTree.insertNodeForBST('S');
		
		
		biTree.preOrderTraverse(biTree.getRoot());
		biTree.findNodeForBST('Q', biTree.getRoot());
		biTree.deleteNode('D');
		biTree.preOrderTraverse(biTree.getRoot());
		
	}
}
