package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicates {
    public static void findDuplicates(int[] array){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else{
                map.put(array[i],1);
            }
        }
        map.forEach((key,val)->{
            if(val>1){
                System.out.println(key);
            }
        });
    }

    public static void findDuplicate2(int[] array){

        for(int i=0;i<array.length;i++) {
            boolean alreadySeen=false;
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    alreadySeen=true;
                    break;
                }
            }
            if(!alreadySeen) {
                for (int k = i + 1; k < array.length; k++) {
                    if(array[i]==array[k]){
                        System.out.println(array[i]);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] inputArray=new int[size];
        for(int i=0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        //findDuplicates(inputArray);
        findDuplicate2(inputArray);

    }
}

//indDuplicates : T - O(n), s -O(n)
// indDuplicate2 : T - O(n2), s - O(1)