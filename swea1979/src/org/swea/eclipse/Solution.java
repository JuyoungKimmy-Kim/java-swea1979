package org.swea.eclipse;

import java.util.*;

public class Solution {
	
	public static final int WALL=0;
	public static final int PATH=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int tc=1; tc<=T; tc++) {
			int result=0;
			
			int N=sc.nextInt();
			int K=sc.nextInt();
			
			int map[][]=new int[N][N];
			
			//input map data
			for (int i=0; i<N; i++)
				for (int j=0; j<N; j++)
					map[i][j]=sc.nextInt();
			
			//check row
			for (int i=0; i<N; i++) {
				int cnt=0;
				for (int j=0; j<N; j++) {
					if (map[i][j]==WALL) {
						if (cnt==K) {
							result++;
						}
						cnt=0;
					}
					else cnt++;
				}
				
				if (cnt==K) result++;
			}
			
			//check column
			for (int j=0; j<N; j++) {
				int cnt=0;
				for (int i=0; i<N; i++) {
					if (map[i][j]==WALL) {
						if (cnt==K) {
							result++;
						}
						cnt=0;
					}
					else cnt++;
				}
				
				if (cnt==K) result++;
			}

			System.out.printf("#%d %d\n", tc, result);
		}
	}

}
