import algoexpert.array.FindMedian;
import algoexpert.array.JumpingOnClouds;
import algoexpert.btree.BranchSums;
import algoexpert.btree.FindLowestCommonAncestor;
import algoexpert.btree.InvertBinaryTree;
import algoexpert.btree.MaxPathSum;
import algoexpert.graph.*;
import algoexpert.stack.BalancedBrackets;
import algoexpert.string.FindFirstUniqueChar;
import com.threading.TestBlockingQueue;
import inh.TestAccessModifiers;
import inh.TestStatic;

import java.util.*;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) throws Exception {

//        System.out.println("Hello World!");
//        TestFunctionalDemo testFunctionalDemo = new TestFunctionalDemo();
//        FunctionalDemo functionalDemo = s -> System.out.println("adding >>> "+s);
//        testFunctionalDemo.testMethodImpl(functionalDemo, "prateek");
//
//        //using Funtion interface provided by java
//        Function<String, String> functionalDemo1 = s ->"using >>> "+s;
//        System.out.println(testFunctionalDemo.add("hola", functionalDemo1));

//        EqualsAndHashCode.testEquals();
//        TestEquals.test();

//        int count = Runtime.getRuntime().availableProcessors();
//        System.out.println(count);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        for(int i=0; i<10; i++){
//            Thread t1 = new Thread(new Task());
//            executorService.execute(t1);
//        }
//
        System.out.println("Seperate thread started - " + Thread.currentThread().getName());
//        TestBlockingQueue.test();

//        CTaskTest.test();

//        MoveElemToEnd.moveElementToEnd(new ArrayList<Integer>(Arrays.asList(2,1,2,2,2,3,4,2)),2);

//        List<String> myList = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
//        List<String> myList1 = new ArrayList<String>();
//        myList.removeIf(x -> {
//            if(x.equals("D")){
//                myList1.add(x);
//                return true;
//            }
//            return false;
//        });

//        System.out.println(Arrays.toString(myList.toArray()));
//
//        System.out.println(Arrays.toString(myList1.toArray()));

//        TestStatic.test();

//        BranchSums.main();
//
//        ArrayDeque<String> myList = new ArrayDeque<>();
//        myList.add("1");
//        myList.add("2");
//        myList.add("3");
//        myList.add("4");
//        System.out.println(Arrays.toString(myList.toArray()));
//
//        System.out.println(myList.poll());
//
//        System.out.println(Arrays.toString(myList.toArray()));


//        MaxPathSum.main();

//        new TestAccessModifiers().Test();

//        Set<Long> personIDs = new HashSet<>();
//        personIDs.add(1L);
//        personIDs.add(2L);
//        personIDs.add(3L);
//        personIDs.add(4L);
//        personIDs.add(5L);
//        personIDs.add(6L);
//        personIDs.add(7L);
//        personIDs.add(8L);
//        personIDs.add(9L);
//        personIDs.add(10L);
//        personIDs.add(11L);
//        personIDs.add(12L);
//
//        int noOfBatches = personIDs.size()/3;
//        for(int i=0; i<noOfBatches; i++){
//
//        }

//        RiverMatrix.test();
        DijkstraShortestPath.test();

//        Stack<Character> s = new Stack<>();
//        Queue<Character> q = new LinkedList<>();
//        s.push('a');
//        s.push('b');
//        s.push('c');
//        s.pop();
//
//        q.add('p');
//        q.add('q');
//        q.add('r');
//
//        q.offer('t');

//        System.out.println(q.poll());

//        System.out.println(Arrays.toString(s.toArray()));
//        System.out.println(Arrays.toString(q.toArray()));


//        String[] badges = {"hola", "gola"};
//        System.out.println(Arrays.stream(badges).map(s -> s.toString().concat("jola")).collect(Collectors.joining()));
    }
}
