package com.asses2;
import java.io.FileInputStream;

public class vowel {

public static void main(String[] args) {
			try {
				FileInputStream r=new FileInputStream("data.txt");
				int i=0,A=0,E=0,I=0,O=0,U=0;
				while((i=r.read())!=-1) {
					if(i=='A') {
						A++;
					}
					else if(i=='E') {
						E++;
					}
					else if(i=='I') {
						I++;
					}
					else if(i=='O') {
						O++;
					}
					else if(i=='U') {
						U++;
					}
			       }	
				System.out.println("A :"+A);
				System.out.println("E :"+E);
				System.out.println("I :"+I);
				System.out.println("O :"+O);
				System.out.println("U :"+U);
				
			}
			catch(Exception e){
				System.out.println(e);
			}
		}

	}

