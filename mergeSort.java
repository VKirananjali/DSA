class insertionSort{
   public void sort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
      print(a);
    }
    void print(int a[]){
        int n=a.length;
        for (int i=0; i<n;i++){
            System.out.print(a[i]+" ");
       }
    }
    public static void main(String args[]){
        insertionSort i=new insertionSort();
        int arr[]={1,2,7,4,6,0};
        i.sort(arr);
         
        
    }
    
}

class mergeSort{
    public void sort(int a[], int n){
        int mid, l[],r[];
        if(n>1){
            mid=n/2;
            l=new int[mid];
            r=new int[n-mid];
             for(int i=0; i<mid;i++){
                 l[i]=a[i];
              }
              for(int i=mid;i<n;i++){
                  r[i-mid]=a[i];
              }
              sort(l,mid);
              sort(r,n-mid);
              merge(l,mid,r,mid-n,a);
        }
    }
    public void merge(int L[],int l, int R[], int r,int a[]){
        int i=0,j=0,k=0;
        while(i<l && j<r){
            if(L[i] < R[j]){
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<l){
                a[k]=L[i];
                k++;
                i++;
        }
        while(j<r){
                a[k]=R[j];
                k++;
                j++;
        }
    }
    void print(int a[]){
        int n=a.length;
        for (int i=0; i<n;i++){
            System.out.print(a[i]+" ");
       }
    }
    public static void main(String args[]){
        mergeSort m=new mergeSort();
        int arr[]={1,2,7,4,6,0,9,3};
        m.sort(arr,8);
       m.print(arr);
    }
}
