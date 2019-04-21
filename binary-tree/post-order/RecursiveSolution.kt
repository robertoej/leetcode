/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        
        val res = mutableListOf<Int>()
        
        root?.left?.let { res.addAll(postorderTraversal(it)) }
            
        root?.right?.let { res.addAll(postorderTraversal(it)) }
        
        root?.`val`?.let { res.add(it) } 
        
        return res
    }
}
