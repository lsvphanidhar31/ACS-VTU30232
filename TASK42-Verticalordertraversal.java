class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        dfs(root, 0, map);

        return new ArrayList<>(map.values());
    }

    void dfs(TreeNode root, int col, TreeMap<Integer, List<Integer>> map) {

        if (root == null)
            return;

        map.putIfAbsent(col, new ArrayList<>());
        map.get(col).add(root.val);

        dfs(root.left, col - 1, map);
        dfs(root.right, col + 1, map);
    }
}
