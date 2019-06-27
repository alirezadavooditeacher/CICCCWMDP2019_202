package Problem;

import java.util.Arrays;
import java.util.List;

public class Problem9 {
    
	public static int caluculate(char[][] lst,int i, int j) {
        int vertical=7, horizontal=9, weight=0;
        if (i<0 || j<0 || i>vertical || j>horizontal) {
                weight=0;
        	    return weight;
        }
        for (int i=0; i<lst.length; i++) {
	        if (lst.get(i) == [i][j]){
	                weight=0;
	        		return weight;
	        }
        }		
        else {
                weight=(i+j)*3-10
                return weight;
	    }
	} 
	
    public static void problem6(table,lst) {      
        max=0
        for i in range(len(table)):
                for j in range(len(table[0])):
                        sum=caluculate(lst,i+1,j)+caluculate(lst,i-1,j)+caluculate(lst,i,j+1)+caluculate(lst,i,j-1) 
                        if sum>max:
                                max=sum
                                cordinate=(i,j);
        return cordinate
    }

    public static Integer[][] main(){    
        Integer[][] lst= {{0,7},{0,8},{1,2},{2,1},{2,2},{2,3},{2,4},{2,5},{3,5},{3,8},{4,5},{4,8},{5,1},{5,2},{5,3},{5,4},{5,5},{5,8},{6,5},{7,3},{7,4},{7,5},{7,6}};
        return lst;
        
    }
}
