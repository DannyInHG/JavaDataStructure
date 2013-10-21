package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {
	
	
	private Node root;
	
	
	public Tree()
	{
		root = null;
	}
	
//	public Tree(char data)
//	{
//		root = new BiTNode(data);
//	}
	
	public Node createTree(Node node)
	{
		System.out.println("Enter your number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			char readChar = (char)br.read();
			if(readChar == '#')
				node = null;
			else
			{
				node = new Node(readChar);
				if(root == null)
				{
					root = node;
				}
				else
				{
//					do nothing
				}
				
				//如果这里没有return的话，会出现没办法返回链接给孩子的情况，导致孩子始终都是null的。
				//这是因为孩子的new是在递归子程序中的，有效的作用域只在子程序中，JVM会自动回收如果超出这个域。。。
				node.lchild = createTree(node.lchild);
				node.rchild = createTree(node.rchild);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return node;
		
	}
	
	/**
	 * 对二叉排序树的查找操作
	 * @param data
	 * @param node
	 */
	public void findNodeForBST(char data,Node node)
	{
		if(data == node.getData())
		{
			System.out.println("We get the dataLocation!");
			return;
		}
		else if(data > node.getData() && node.rchild != null)
		{
			findNodeForBST(data,node.rchild);
		}
		else if(data < node.getData() && node.lchild != null)
		{
			findNodeForBST(data,node.lchild);
		}
		else
		{
			System.out.println("Sorry,we can't find the data!");
			return ;
		}
		
	}
	
	public void insertNodeForBST(char data)
	{
		
	}
	
	public void deleteNode(char data)
	{
		
	}
	
	public void inOrderTraverse(Node node)
	{
		if(node == null)
			return;
		inOrderTraverse(node.lchild);
		node.displayNode();
		inOrderTraverse(node.rchild);
		
	}
	
	public void preOrderTraverse(Node node)
	{
		if(node == null)
			return;
		
		node.displayNode();
		
		inOrderTraverse(node.lchild);
		
		inOrderTraverse(node.rchild);
		
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	
	
}
