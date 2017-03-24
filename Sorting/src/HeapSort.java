/**
 * Created by ADDY on 05/02/17.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class HeapSort {

    private int[] myHeap;
    private int size;
    private int heapSize;

    public HeapSort(int[] arry, int size){
        this.size = size;
        this.heapSize = size;
        myHeap = arry;

    }

    int[] getHeap(){
        return this.myHeap;
    }

    void showHeap(){
        for(int i=0;i<this.heapSize;i++){
            System.out.print(this.myHeap[i]+" ");
        }
        System.out.println();
    }

    void finalArray(){
        for(int i=0;i<this.size;i++){
            System.out.print(this.myHeap[i]+" ");
        }
        System.out.println();
    }

    void maxHeapify(int i){
        int l = 2*i - 1;
        int r = l+1;
        i--;
        int largest;

        if (l <= this.heapSize-1 && this.myHeap[l]>this.myHeap[i]) largest=l;
        else largest=i;

        if (r <= this.heapSize-1 && this.myHeap[r]>this.myHeap[largest]) largest=r;

        if(largest != i){
            int temp = this.myHeap[i];
            this.myHeap[i] = this.myHeap[largest];
            this.myHeap[largest] = temp;
            maxHeapify(largest+1);
        }
    }

    void buildMaxHeap(){
        this.heapSize = this.size;
        for(int i=this.size/2;i>0;i--){
            maxHeapify(i);
            //showHeap();
        }
    }

    int getHeapMaximum(){
        return this.myHeap[0];
    }

    int getHeapExtractMax(){
        int max;
        if (this.heapSize<1) System.out.println("heap underflow");
        max = this.myHeap[0];
        this.myHeap[0] = this.myHeap[this.heapSize-1];
        this.heapSize--;
        maxHeapify(1);
        return max;

    }

    void performHeapIncreaseKey(int i, int key){
        if(key < this.myHeap[i-1]) System.out.println("ERROR: new key is smaller than current key");
        this.myHeap[i-1] = key;
        //System.out.println(this.myHeap[i-1]);
        //System.out.println(this.myHeap[(i/2) - 1]);
        while(i>1 && this.myHeap[(i/2)-1] < this.myHeap[i-1]){
            int temp = this.myHeap[i-1];
            this.myHeap[i-1] = this.myHeap[(i/2)-1];
            this.myHeap[(i/2)-1] = temp;
            i= i/2;
        }
    }

    void maxHeapInsert(int key){
        this.heapSize++;
        //System.out.println(this.heapSize);
        this.myHeap[this.heapSize-1] = -1*(int)Double.POSITIVE_INFINITY;
        performHeapIncreaseKey(this.heapSize, key);
    }

    void sortHeap(){
        for(int i=this.size-1;i>=0;i--){
            this.myHeap[i] = getHeapExtractMax();
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.nextLine();
        int n = 10000000;
        int[] arry = new int[n];
//        for(int i=0;i<n;i++){
//            myHeap[i] = in.nextInt();
//        }
        int j=0;
        for(int i=n;i>0;i--){
            arry[j] = i;
            j++;
        }

        HeapSort heap = new HeapSort(arry,n);
        //heap.showHeap();

        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        heap.buildMaxHeap();
        //heap.showHeap();
        heap.sortHeap();
        //heap.finalArray();

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");





    }
}
