public class myBinarySearchTreeNode {
    int myValue;
    myBinarySearchTreeNode left;
    myBinarySearchTreeNode right;

    myBinarySearchTreeNode(int inValue){
        // created a new node with empty child pointers
        myValue = inValue;
        right = null;
        left = null;
    }

    myBinarySearchTreeNode(int[] A){
        // creates a new Binary Search Tree rooted at the first value in the array
        /// by inserting elements into the tree in the order they are given in A.
        myValue = A[0];
        for(int i = 1; i < A.length; i++){
            this.insert(A[i]);
        }
    }

    public void insert(int inValue){
        // This method takes a new integer as input and decides
        // if it should be place:
        //    * as the left child,
        //    * as the right child,
        //    * in the left subtree,
        //    * or in the right subtree.
        // If the value already exists in the tree, no action is taken.
        // comparing values
        if(inValue > myValue){
            if(right == null){
                right = new myBinarySearchTreeNode(inValue); // make new node
            }
            else{
                right.insert(inValue);
            }
        }
        else{
            if(left == null){
                left = new myBinarySearchTreeNode(inValue); // make new node
            }
            else{
                left.insert(inValue);
            }
        }
        if(inValue == myValue){ // when values equal to each other
            System.out.println("no duplicates");
        }
    }

    public int height(){
        // This method recursively calculates the height of the entire (sub)tree.
        // This method will take O(n) time
        int LH = 0;//left height
        int RH = 0;//right height
        int height;
        if(left != null){
            LH = left.height()+1;//adds to the height of the left
        }
        if(right != null){
            RH = right.height()+1;//adds to height of the right
        }
        //get greatest height
        if(RH > LH) {
            height = RH;
        }
        else{
            height = LH;
        }
        return height;
    }

    public int depth(int search){
        // This method recursively calculates the depth of a given search value.
        // If the given value is not in the tree, this method returns -1.
        // Note that if the tree is a proper BST, this method should complete in O(log n) time.
        // Additionally, remember that the depth is the number of nodes on the path from a node to the root
        // (i.e. the number of the recursive calls).
        if(search < this.myValue){
            return 1 + left.depth(search);
        }
        if(search > this.myValue){
            return 1 + right.depth(search);
        }
        if(search == this.myValue){//if the value is found
            return 0;//return depth value
        }
        return -1;//if value is not found

    }
    public int size(){
        int sum = 0;//root
        if(left != null){
            sum += left.size();//increment sum
        }
        if(right != null){
            sum += right.size();//increment sum
        }
        print();
        return sum + 1;
    }

    // Utility function included so you can debug your solution.
    public void print() { print(""); }
    private void print(String prefix) {
        System.out.println(prefix + myValue);
        prefix = prefix.replace('\u251C', '\u2502');
        prefix = prefix.replace('\u2514', ' ');
        if(left != null) left.print(prefix + "\u251C ");
        if(right != null) right.print(prefix + "\u2514 ");
    }
}


