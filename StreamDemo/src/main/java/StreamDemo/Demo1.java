package StreamDemo;

/**
 * https://juejin.cn/post/7118991438448164878?searchId=20240320140759FA47CBF4B0941321D3AF
 * 吃透JAVA的Stream流操作，多年实践总结
 */

/**
 * 开始管道
 * 主要负责新建一个Stream流，或者基于现有的数组、List、Set、Map等集合类型对象创建出新的Stream流。
 * API	            功能说明
 * stream()	        创建出一个新的stream串行流对象
 * parallelStream()	创建出一个可并行执行的stream流对象
 * Stream.of()	    通过给定的一系列元素创建一个新的Stream串行流对象
 */

/**
 * 中间管道
 * API	        功能说明
 * filter()	    按照条件过滤符合要求的元素， 返回新的stream流
 * map()	    将已有元素转换为另一个对象类型，一对一逻辑，返回新的stream流
 * flatMap()	将已有元素转换为另一个对象类型，一对多逻辑，即原来一个元素对象可能会转换为1个或者多个新类型的元素，返回新的stream流
 * limit()	    仅保留集合前面指定个数的元素，返回新的stream流
 * skip()	    跳过集合前面指定个数的元素，返回新的stream流
 * concat()	    将两个流的数据合并起来为1个新的流，返回新的stream流
 * distinct()	对Stream中所有元素进行去重，返回新的stream流
 * sorted()	    对stream中所有的元素按照指定规则进行排序，返回新的stream流
 * peek()	    对stream流中的每个元素进行逐个遍历处理，返回处理后的stream流
 */

/**
 * 终止管道
 * 顾名思义，通过终止管道操作之后，Stream流将会结束，最后可能会执行某些逻辑处理，或者是按照要求返回某些执行后的结果数据。
 * API	        功能说明
 * count()	    返回stream处理后最终的元素个数
 * max()	    返回stream处理后的元素最大值
 * min()	    返回stream处理后的元素最小值
 * findFirst()	找到第一个符合条件的元素时则终止流处理
 * findAny()	找到任何一个符合条件的元素时则退出流处理，这个对于串行流时与findFirst相同，
 *              对于并行流时比较高效，任何分片中找到都会终止后续计算逻辑
 * anyMatch()	返回一个boolean值，类似于isContains(),用于判断是否有符合条件的元素
 * allMatch()	返回一个boolean值，用于判断是否所有元素都符合条件
 * noneMatch()	返回一个boolean值， 用于判断是否所有元素都不符合条件
 * collect()	将流转换为指定的类型，通过Collectors进行指定
 * toArray()	将流转换为数组
 * iterator()	将流转换为Iterator对象
 * foreach()	无返回值，对元素进行逐个遍历，然后执行给定的处理逻辑
 */
public class Demo1 {

}
