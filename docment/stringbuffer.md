StringBuffer是字符串缓冲区。

是一个容器。
特点：
1，长度是可变化的。
2，可以字节操作多个数据类型。
3，最终会通过toString方法变成字符串。



C create U update R read D delete

1，存储。
	StringBuffer append():将指定数据作为参数添加到已有数据结尾处。
	StringBuffer insert(index,数据):可以将数据插入到指定index位置。


2，删除。
	StringBuffer delete(start,end):删除缓冲区中的数据，包含start，不包含end。
	StringBuffer deleteCharAt(index):删除指定位置的字符。
	
3，获取。
	char charAt(int index) 
	int indexOf(String str) 
	int lastIndexOf(String str) 
	int length() 
	String substring(int start, int end) 
 
4，修改。
	StringBuffer replace(start,end,string);
	void setCharAt(int index, char ch) ;


5，反转。
	StringBuffer reverse();
 
6，
	将缓冲区中指定数据存储到指定字符数组中。
	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 

	
JDK1.5 版本之后出现了StringBuilder.

StringBuffer是线程同步。
StringBuilder是线程不同步。

以后开发，建议使用StringBuilder

升级三个因素：
1，提高效率。
2，简化书写。
3，提高安全性