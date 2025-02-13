### **Problem Statement: Lowest Common Ancestor (LCA) in a Binary Search Tree**  

#### **Problem Description**  
Given a **Binary Search Tree (BST)** and two node values, find the **Lowest Common Ancestor (LCA)** of the two nodes.  

The **LCA** of two nodes **p** and **q** in a BST is defined as the lowest node in the tree that has both **p** and **q** as descendants (where we allow a node to be a descendant of itself).  

#### **Input**  
- A Binary Search Tree (BST) with **unique values**.
- Two given node values **p** and **q** (guaranteed to exist in the BST).  

#### **Output**  
- Return the **TreeNode** that represents the **Lowest Common Ancestor** of **p** and **q**.  

#### **Constraints**  
- 2≤ Number of nodes in BST ≤10^5  
- −10^9≤ Node values ≤10^9 
- The given nodes **p** and **q** are guaranteed to exist in the BST.  

---

### **Example 1**
#### **Input:**  
```
        6
       / \
      2   8
     / \  / \
    0   4 7 9
       / \
      3   5
```
p = 2, q = 8  

#### **Output:**  
```
LCA = 6
```
#### **Explanation:**  
The lowest node that has both **2** and **8** as descendants is **6**.  

---

### **Example 2**
#### **Input:**  
```
        6
       / \
      2   8
     / \  / \
    0   4 7 9
       / \
      3   5
```
p = 2, q = 4  

#### **Output:**  
```
LCA = 2
```
#### **Explanation:**  
Since node **2** is an ancestor of **4**, the **LCA** is **2** itself.  

---

### **Example 3**
#### **Input:**  
```
        6
       / \
      2   8
     / \  
    0   4
       / \
      3   5
```
p = 3, q = 5  

#### **Output:**  
```
LCA = 4
```
#### **Explanation:**  
The lowest common ancestor of **3** and **5** is **4**.  
