class JFS{
	public static void main(String args[]){
		int arr[][]={{0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]==0){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}