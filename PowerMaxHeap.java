//Power max heap
//Author: Vhuhwavho Mokoma


public class PowerMaxHeap{
private int[] heap;
private int size; //current size
private int parent; //pointer to parent index
private int maxsize; //maximum size of heap
private int powersize; //power value

 //Initializing values of heap
  public PowerMaxHeap(int power, int maxsize)
    {
        this.size = 0;
        this.parent = 0;
        this.maxsize = maxsize;
        this.powersize = (int)Math.pow(2,power)+1;
        heap = new int[this.maxsize];
    }
    
   //swapping inserted value with parent node   
   public void swap(int val, int p){
    if(val>heap[p]){
       int tmp = heap[p];
       heap[p] = val;
       heap[size] =  tmp;
       Heapify(val,p);
     }else{
      heap[size] = val;
      size++;
      }
   }
   //inserting node into tree
   public void insert(int value){
    if(size==0){
      heap[0] = value;
      size++;
    }else{
     if(size%powersize!=0){ //add node to the current parent index
      swap(value,parent);
     }else{ //moving to the next parent
      parent++;
      swap(value,parent);
     }
    }
    
   } 
   //ensuring heap property is maintained
   public void Heapify(int val,int p){
   for(int i = parent; i>=0;i--){
     if(val>heap[i]){
        int t2 = heap[i];
        heap[i] = val;
        heap[p] = t2;
        p = i;
       }
      }
   }
 
       public int popMax()
    {
        int popped = heap[0];
        return popped;
    }















}