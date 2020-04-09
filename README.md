# leetcode-prictise
> 领扣算法练习

### 基础部分

#### 基础排序部分
1. 冒泡排序：对相邻的两个元素进行比较，如果满足大小要求，就将这两个数据交换位置，一轮比较结束至少一个元素位于适当的位置。
2. 插入排序：插入排序将数组数据分成已排序区间和未排序区间。初始已排序区间只有一个元素，即数组第一个元素。在未排序区间取出一个元素插入到已排序区间的合适位置，直到未排序区间为空。
3. 选择排序：选择排序将数组分成已排序区间和未排序区间。初始已排序区间为空。每次从未排序区间中选出最小的元素插入已排序区间的末尾，直到未排序区间为空。
4. 归并排序：是利用归并的思想实现的排序方法，该算法采用经典的分治（divide-and-conquer）策略（分治法将问题分(divide)成一些小的问题然后递归求解，而治(conquer)的阶段则将分的阶段得到的各答案"修补"在一起，即分而治之)。
如果要排序一个数组，我们先把数组从中间分成前后两部分，然后对前后两部分分别排序，再将排好序的两部分合并在一起，这样整个数组就都有序了。
5. 快速排序：快速排序使用分治法（Divide and conquer）策略来把一个序列（list）分为较小和较大的2个子序列，然后递归地排序两个子序列。
    1. 挑选基准值：从数列中挑出一个元素，称为“基准”（pivot），
    2. 分割：重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（与基准值相等的数可以到任何一边）。在这个分割结束之后，对基准值的排序就已经完成，
    3. 递归排序子序列：递归地将小于基准值元素的子序列和大于基准值元素的子序列排序。
### 第一部分 数组和字符串

#### 一维数组
1. 至少是其他数字两倍的最大数 
2. 寻找数组的中心索引 
3. 加一 

##### 二维数组
1. 对角线遍历