package com.sutton.util.arrys;

import java.util.Arrays;
import java.util.List;
/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 学习 Arrays
 * @author: Mr.wang.sutton
 * @create: 2022-10-24 22:51
 **/
public class UseArrays {

    public static void createCopyOf() {
        String[] intro = new String[]{"沉", "默", "王", "二"};
        String[] revised = Arrays.copyOf(intro, 3);
        Arrays.stream(revised).forEach(element -> {
            System.out.println(element.toString());
        });
        String[] expanded=Arrays.copyOf(intro,5);
        Arrays.stream(expanded).forEach(element->{
            System.out.println(expanded.toString());
        });
    }

    public static void useCopyOfRange(){
        String[] intro = new String[]{"沉", "默", "王", "二"};
        String[] abridgement=Arrays.copyOfRange(intro,0,6);
        System.out.println(Arrays.toString(abridgement));
    }

    public static void useFill(){
        String[] sutter=new String[4];
        Arrays.fill(sutter,"陈梅");
        System.out.println(Arrays.toString(sutter));
    }

    public static void useSort(){
        String[] intro1 = new String[] { "chen", "mo", "wang", "er" };
        String[] sorted=Arrays.copyOf(intro1,4);
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));

    }

    public static void useEquals(){
        String[] intro = new String[] { "沉", "默", "王", "二" };
        boolean result=Arrays.equals(new String[]{"沉", "默", "王", "二"},intro);
        boolean result1=Arrays.equals(new String[]{"沉", "默", "王", "三"},intro);
        System.out.println(result1);
        System.out.println(result);
    }

    public static void useBinarySearch(){
        String[] intro1 = new String[] { "chen", "mo", "wang", "er" };
        String[] sorted=Arrays.copyOf(intro1,4);
        Arrays.sort(sorted);
        int exact=Arrays.binarySearch(sorted,"wang");
        System.out.println(exact);
        int caseInsensitive=Arrays.binarySearch(sorted,"WANG",String::compareToIgnoreCase);
        System.out.println(caseInsensitive);
    }

    public static void useStream(){
        String[] intro = new String[] { "沉", "默", "王", "二" };
        System.out.println(Arrays.stream(intro).count());
    }

    public static void usePrint(){
        String[] intro = new String[] { "沉", "默", "王", "二" };
        System.out.println(Arrays.toString(intro));
    }

    public static void  useArrayList(){
        String[] intro = new String[] { "沉", "默", "王", "二" };
        List<String> rets = Arrays.asList(intro);
        System.out.println(rets.contains("二"));
    }

    public static void useSetAll(){
        int[] array={1,2,3,4,5};
        Arrays.setAll(array,i->i*10);
        System.out.println(Arrays.toString(array));
    }

    public static void useParallelPrefix(){
        int[] arr = new int[] { 1, 2, 3, 4};
        Arrays.parallelPrefix(arr, (left, right) -> left + right);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        createCopyOf();
        useCopyOfRange();
        useFill();
        useEquals();
        useSort();
        useBinarySearch();
        useStream();
        useArrayList();
        useSetAll();
        useParallelPrefix();
    }
}