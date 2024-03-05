public class CheckArrayIsSorted {

        public static void main(String[] args){
            int[]arr={1,2,2,5,3,4};
            boolean flag=false;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>=arr[i-1]){
                    flag=true;
                    continue;

                }
                else{
                    flag=false;
                    break;
                }
            }
            System.out.println(flag);
        }
    }

