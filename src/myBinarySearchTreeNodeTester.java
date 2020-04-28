
import org.junit.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class myBinarySearchTreeNodeTester {
    /*tests the depth method
    test input = {3,0,1,4,5};
    search = 5;
    expected output = 2;
    */
    @Test
    public void depth(){//Passed
        int[] input = {3,0,1,4,3};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(input);
        assertEquals(0,test.depth(3));
    }
    /*
input = {8,3,5,7,2,9};
expected output = 6;
size test checks the size of the tree using the size method
*/
    @Test
    public void size(){
        int[] input = {8,3,5,7,2,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(input);
        assertEquals(6, test.size());
    }

    /*
 Tests the height method and returns the height of the tree
    input = {1,2,3,4,5,6,7,8};
    expected output = 4;
    */
    @Test
    public void height(){
        int[] input = {1,2,3,4,5,6,7,8};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(input);
        assertEquals(4,test.height());
    }
    /*
     Tests duplicate method and checks for repeated numbers in the tree
     input = {1,2,3,4,5,6};
     expected output = {1,2,3,4,5,6};

     */
    @Test
    public void duplicate(){
        int[] input = {1,2,3,4,5,6};
        int[] expected = {1,2,3,4,5,6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(input);
        test.insert(4);
        Assert.assertArrayEquals(expected,input);
    }
    /*
    Tests the insert method and inserts a number
    test input = {1,2,3,4,5,6,8,9};
    expected output = {1,2,3,4,5,6,8,9,7};

    */
    @Test
    public void insert(){
        int[] input = {1,2,3,4,5,6,8,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(input);
        test.insert(7);
        assertEquals(7,test.depth(7));
    }


}


