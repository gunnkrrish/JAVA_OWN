package DSA;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        arr= mergeSort(arr);
        //mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //USING COPY OF RANGEE****************************************************
    static int[] mergeSort(int[] arr){
        if(arr.length ==1) return arr;
        int mid = arr.length/2;
        int[] a = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] b = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(a,b);
    }
    static int[] merge(int[] a,int[] b){
        int[] mix = new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                mix[k] = a[i];
                i++;
                k++;
            }
            else{
                mix[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            mix[k] = a[i]; 
            k++;
            i++;
        } 
        while(j<b.length){
            mix[k] = b[j];
            k++;
            j++;
        } 
        return mix;
    }
}

















//         if(arr.length ==1){
//             return arr;
//         }
//         int mid = arr.length/2;
//         int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
//         int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

//         return merge(left,right);

//     }  
//     private static int[] merge(int[] first,int[] second){
//         int[] mix = new int[first.length+second.length];
//         int i=0;
//         int j=0;
//         int k=0;

//         while(i<first.length && j<second.length){
//             if(first[i] <second[j]){
//                 mix[k] = first[i];
//                 i++;
//             }else{
//                 mix[k] = second[j];
//                 j++;
//             }
//             k++;
//         }
// //it may be possible if one of the array is not complete copy remaining
// while(i<first.length){
//     mix[k] = first[i];
//     i++;
//     k++;
// }
// while(j<second.length){
//     mix[k] = second[j];
//     j++;
//     k++;
// }
// return mix;
//     }
// }



// USING INDICES ***********************************************************************************
//     static void mergeSortInPlace(int[] arr,int s,int e){
//         if(e-s ==1){
//            return;
//         }
//         int mid = (s+e) /2;
//         mergeSortInPlace(arr, s, mid);
//         mergeSortInPlace(arr, mid, e);

//         mergeInPlace(arr, s,mid, e);

//     }  


//     private static void mergeInPlace(int[] arr,int s,int m,int e){
//         int[] mix = new int[e-s];
//         int i=s;
//         int j=m;
//         int k=0;

//         while(i<m && j<e){
//             if(arr[i] <arr[j]){
//                 mix[k] = arr[i];
//                 i++;
//             }else{
//                 mix[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
// //it may be possible if one of the array is not complete copy remaining
// while(i< m){
//     mix[k] =  arr[i];
//     i++;
//     k++;
// }
// while(j< e){
//     mix[k] =  arr[j];
//     j++;
//     k++;
// }
// for(int l =0;l<mix.length;l++){
//     arr[s+l] = mix[l];
// }
//     }
// }
