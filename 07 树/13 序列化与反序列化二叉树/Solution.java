/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        if (root != null)
            queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                list.add("null");
            } else {
                list.add(String.valueOf(node.val));
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        if (!list.isEmpty()) {
            sb.append(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            sb.append(",").append(list.get(i));
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0)
            return null;
        String[] split = data.split(",");
        if (split.length == 0)
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;
        while (index < split.length) {
            // left
            TreeNode node = queue.poll();
            if (!"null".equals(split[index])) {
                node.left = new TreeNode(Integer.parseInt(split[index]));
                queue.offer(node.left);
            }
            // right
            index++;
            if (index >= split.length)
                break;
            if (!"null".equals(split[index])) {
                node.right = new TreeNode(Integer.parseInt(split[index]));
                queue.offer(node.right);
            }
            index++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
