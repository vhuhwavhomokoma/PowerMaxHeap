//Power max heap
//Author: Vhuhwavho Mokoma


public class PowerMaxHeap{
private int[] heap;
private int size; //current size
private int parent; //pointer to parent index
private int maxsize; //maximum size of heap
private int powersize; //power value;

 //Initializing values of heap
  public PowerMaxHeap(int power, int maxsize)
    {
        this.size = 0;
        this.parent = 0;
        this.maxsize = maxsize;
        this.powersize = (int)Math.pow(2,power);
        heap = new int[this.maxsize];
    }
    
   //swapping inserted value with parent node   
   public void swap(int val, int p){
    if(val>heap[p]){
       int tmp = heap[p];
       heap[p] = val;
       heap[size] =  tmp;
       Heapify(val,p);
       size++;
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
      swap(value,parent);
      this.parent++;
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
   
   //Heapify after poping root node
   public void popHeapify(int val,int index,int p){
     for(int i = p; i>=0;i--){
     if(val>heap[i]){
        int t2 = heap[i];
        heap[i] = val;
        heap[index] = t2;
       }
      }
   
   }
 
       public int popMax()
    {
        int[] tempheap = heap;
        int popped = heap[0];
        for(int n = 0; n<maxsize-1; n++){
         heap[n] = tempheap[n+1];
        }
        
        size--;
        

      
        for(int s = maxsize-1; s>=parent;s--){
        
        if(size%powersize!=0){ //check if latest parent node has been filled
           popHeapify(heap[s],s,parent);
         }else{
           popHeapify(heap[s],s,parent-1);
         }
        
     
         
        }
        

        
        return popped;
    }
    
    
    //get heap
    public int[] getHeap(){
     return heap;
    }















}