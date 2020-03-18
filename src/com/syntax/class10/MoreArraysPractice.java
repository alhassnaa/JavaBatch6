package com.syntax.class10;

public class MoreArraysPractice {

	public static void main(String[] args) {

		
		String team[] = { "Besiktas", "Trabzon", "Galatasaray", "Fenerbahce" };
		String[] player = { "Sergen", "Yattara", "Hakan", "Alex" };
		int i=0;
		int j=0;
		for (i=0;i<team.length;i++) {
			for (j=0;j<player.length;j++) {
				if(i==j) {
					System.out.println(team[i]+" "+player[j]);
				}
			}
		}
		}
	}