class linearSearch{
    int linearSearch(int arr[],int k){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        linearSearch l=new linearSearch();
        int arr[]={10,15,20,12,9,5,2};
        int index=l.linearSearch(arr,9);
        if(index!=-1){
            System.out.println("element found at index: "+ index);
        }
        else{
            System.out.println("element not found!!");
        }
    }
}
