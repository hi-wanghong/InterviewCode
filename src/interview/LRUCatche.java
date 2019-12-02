package interview;
import java.util.HashMap;

/**
 * 【日志易】-一面
 * 实现LRU算法的put(K,V)和get(K)方法
 */
class Node {
    //Node对应的键-值
    Object key;
    Object value;

    //前置节点&后置节点
    Node pre;
    Node next;

    public Node(Object key, Object value){
        this.key = key;
        this.value = value;
    }

}

public class LRUCatche<K, V> {


    private int currentSize;//当前的大小
    private int capcity;//总容量
    private HashMap<K, Node> caches;//所有的node节点
    private Node first;//头节点
    private Node last;//尾节点



}
