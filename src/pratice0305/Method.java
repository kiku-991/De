package pratice0305;

public class Method {


		// TODO 自動生成されたメソッド・スタブ

		public int[] megerArray(int[] left,int[] right){
			int [] megerArray = new int[left.length+right.length];
			int index=0;

			for(int l:left){
				megerArray[index]=l;
				index++;
			}
			for(int r :right){
				boolean flg =false;
				for(int m :left){
					if(r==m){
						flg=true;
						break;
					}
				}
				if(!flg){
					megerArray[index]=r;
					index++;
				}
			}

			int[] reArray = new int[index];
			for(int x = 0;x<reArray.length;x++){
				reArray[x]=megerArray[x];
			}
			return megerArray;

		}
		public int[] Array(int[] l,int[] r){

			int[] newArr = new int[l.length+r.length];
			int inde =0;
			for(int le:l){
				newArr[inde]=le;
				inde++;
			}
			for(int ri :r){
				newArr[inde]=ri;
				inde++;
			}
			int[]reA = new int[inde];
			for(int y=0;y<reA.length;y++){
				reA[y]=newArr[y];
			}
			return newArr;


		}

	}


