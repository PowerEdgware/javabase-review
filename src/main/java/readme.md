##Java基础回顾总结

###Java集合框架
>*Java Collections Framework(JCF)*提供了通用容器 ，用于存储对象的对象。  
> 容器主要包括 Collection 和 Map  Collection存储对象集合，Map存储键值对的映射表。  

#### Collection
>存储单对象的的集合    
> 常见子接口：List Set Queue  
>抽象类：AbstractCollection 
>| AbstractCollection子类：AbstractList，AbstractQueue，AbstractSet
>实现了迭代接口，提供迭代器用于迭代集合对象：  
>`public interface Collection<E> extends Iterable<E>`  

######  List 常见实现
>抽象类：AbstractList 是其他子类的基础类  
> ArrayList ， LinkedList ，Vector  
>并发：CopyOnWriteArrayList 读多写少  

###### Set  常见实现
>子接口：SortedSet，NavigableSet  
>抽象类：AbstractSet 是其他子类的基础类    
>HashSet,TreeSet,LinkedHashSet

###### Queue 常见实现
>子接口：BlockingQueue，Deque(double ended queue)  
>抽象类：AbstractQueue 是其他子类的基础类  
>LinkedList ArrayDeque  
>DelayQueue,PriorityQueue,PriorityBlockingQueue,ArrayBlockingQueue,LinkedBlockingQueue

#### Map (替代 Dictionary)
>存储键值对类型  的散列表  
>抽象类：AbstractMap  
>子接口：SortedMap,NavigableMap,ConcurrentMap  
>常用实现：HashMap,TreeMap,LinkedHashMap,Hashtable,WeakHashMap  
>并发：ConcurrentHashMap,ConcurrentSkipListMap