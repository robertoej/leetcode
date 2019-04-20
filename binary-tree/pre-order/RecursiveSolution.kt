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
    
    fun preorderTraversal(root: TreeNode?): List<Int> {
        
        val res = mutableListOf<Int>()
        
        root?.`val`?.let { res.add(it) } 
        
        root?.left?.let { res.addAll(preorderTraversal(it)) }
            
        root?.right?.let { res.addAll(preorderTraversal(it)) }
        
        return res
    }
}
