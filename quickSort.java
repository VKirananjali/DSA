class quickSort{
    void sort(int a[],int s,int e){
        int start=s;
        int end=e;
        int pivot=start;
        while(start<=end){
            while(a[start]<a[pivot]){
                start++;
            }
            while(a[end]>a[pivot]){
                end--;
            }
            if(start<=end){
                int t=a[start];
                a[start]=a[end];
                a[end]=t;
                start++;
                end--;
            }
        }
        if(s<end){
            sort(a,s,end);
        }
        if(e>start){
            sort(a,start,e);
        }
    }
    
    void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        quickSort s=new quickSort();
        int arr[]={7,1,5,4,9,7,3,2};
        s.sort(arr,0,7);
        s.print(arr);
    }
}
