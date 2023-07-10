public class BinaryTree{
    Node root;
    public BinaryTree(){
        this.root=new Node();
    }

    public BinaryTree(int data){
        this.root=new Node(data);
    }
    
    public void insert(int element){
        Node temp=this.root;
        Node node=new Node(element);
        while(temp!=null){
            if(element>=temp.data){
                if(temp.right==null){
                    temp.right=node;
                    break;
                }
                else
                  temp=temp.right;
            }
            else{
                if(temp.left==null){
                    temp.left=node;
                    break;
                }
                else
                    temp=temp.left;
            }
        }
        System.out.println("Inserted "+element);
    }

    private int search(int element){
        Node temp=this.root;
        while(temp!=null){
            if(element==temp.data){
                return element;
            }
            else if(element>temp.data){
                temp=temp.right;
            }
            else{
                temp=temp.left;
            }
        }
        return -1;
    }

    private int remove(int element){
        
    }

    public static void main(String[] args){
        BinaryTree b1=new BinaryTree(4);
        b1.insert(4);
        b1.insert(5);
        b1.insert(2);
        System.out.println(b1.search(2));
    }

}

class Node{
    int data;
    Node left,right;

    public Node(){
        this.left=null;
        this.right=null;
    }

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public Node(int data,Node left,Node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}