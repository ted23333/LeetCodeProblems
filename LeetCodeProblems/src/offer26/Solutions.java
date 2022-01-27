package offer26;

class Solutions {
    public static void main(String[] args) {
        TreeNode A1 = new TreeNode(4);
        TreeNode A2 = new TreeNode(2);
        TreeNode A3 = new TreeNode(3);
        TreeNode A4 = new TreeNode(4);
        TreeNode A5 = new TreeNode(5);
        TreeNode A6 = new TreeNode(6);
        TreeNode A7 = new TreeNode(7);
        TreeNode A8 = new TreeNode(8);
        TreeNode A9 = new TreeNode(9);
        TreeNode B1 = new TreeNode(4);
        TreeNode B2 = new TreeNode(8);
        TreeNode B3 = new TreeNode(9);
        A1.left = A2; A1.right = A3;
        A2.left = A4; A2.right = A5;
        A3.left = A6; A3.right = A7;
        A4.left = A8; A4.right = A9;
        B1.left =B2; B1.right = B3;
        boolean r = new Solutions().isSubStructure(A1,B1);

    }

    boolean re = false;
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null||A == null) return false;
        if(A.val == B.val||re) re = check(A,B)||re;
        boolean d = isSubStructure(A.left,B)||isSubStructure(A.right,B);
        return re;
    }
    private boolean check(TreeNode A,TreeNode B)
    {
        if(B==null) return true;
        if(A!=null&&B!=null&&A.val == B.val) return  check(A.left,B.left)&&check(A.right,B.right);
        else return false;
    }
}
